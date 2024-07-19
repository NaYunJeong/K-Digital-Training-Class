# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from cx_Oracle import connect
from json import loads

# 서울 - 미세먼지 검색 - 공공 - 서울시 권역별 실시간 대기환경 현황 - openAPI - 첫번째
# http://openAPI.seoul.go.kr:8088
# /4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/

# 구 이름, 미세먼지, 초미세먼지 의 정보를 DB에 담기
#    (여러 기간에 걸쳐 이 데이터를 모은다고 가정)

hc = HTTPConnection("openAPI.seoul.go.kr:8088")
hc.request("GET", "/4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/")


resBody = hc.getresponse().read()
# print(resBody.decode())

airData = loads(resBody)

# DB연결
con = connect("choco/1718@localhost:1521/xe")
cur = con.cursor()

airPollutions = airData["RealtimeCityAir"]["row"]
# print(airPollutions)

for a in airPollutions:
    # print(a["MSRSTE_NM"], a["PM10"], a["PM25"])
    sql = "insert into jul19_airPollution values(jul19_airPollution_seq.nextval, "
    sql += f"'{a['MSRSTE_NM']}', {a['PM10']}, {a['PM25']})"
    cur.execute(sql)
    
con.commit()
con.close()

print("완료!")







