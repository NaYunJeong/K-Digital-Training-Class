# -*- coding:utf-8 -*-
from cx_Oracle import connect

# 만든 db를 csv파일로 만들기 (번호,시간,온도,최고기온,날씨,바람방향 의 형태로)

con = connect("choco/1718@localhost:1521/xe")
file = open("C:/Users/sdedu/Desktop/Workspace/Python/weather.csv", "a", encoding="UTF-8")

sql = "select * from jul19_weather"

cur = con.cursor()
cur.execute(sql)

for no, hour, temp, tmx, wfKor, wdKor in cur:
    # print(no, hour, temp, tmx, wfKor, wdKor)
    file.write(f"{no},{hour},{temp},{tmx},{wfKor},{wdKor}\n")
    
file.close()
con.close()
print("성공")

