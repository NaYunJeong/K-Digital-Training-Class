# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from xml.etree.ElementTree import fromstring
from cx_Oracle import connect

# 기상청 (주소값 구해서)
# 기상청 xml => DB에 적재
# 시간대 / 기온 / 최고기온 / 날씨(한글) / 바람의 방향(한글)
# http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168075000

hc = HTTPConnection("www.kma.go.kr")
hc.request("GET", "/wid/queryDFSRSS.jsp?zone=1168075000")

res = hc.getresponse()
resBody = res.read()
# print(resBody.decode())

con = connect("choco/1718@localhost:1521/xe")
cur = con.cursor()

for w in fromstring(resBody).iter("data"):
    # print(w.find("hour").text)
    hour = w.find("hour").text
    temp = w.find("temp").text
    tmx = w.find("tmx").text
    wfKor = w.find("wfKor").text
    wdKor = w.find("wdKor").text
    sql = "insert into jul19_weather values(jul19_weather_seq.nextval, "
    sql += f"'{hour}', '{temp}', '{tmx}', '{wfKor}', '{wdKor}')"
    cur.execute(sql)
    
con.commit()
con.close()
print("완료")

