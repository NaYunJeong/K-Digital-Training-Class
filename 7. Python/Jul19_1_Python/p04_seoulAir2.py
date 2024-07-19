# -*- coding:utf-8 -*-
from cx_Oracle import connect

# DB에 있는 미세먼지 데이터 => csv에 저장(데이터 콤마로 구분)

con = connect("choco/1718@localhost:1521/xe")
file = open("C:/Users/sdedu/Desktop/Workspace/Python/airPollution.csv","a", encoding="UTF-8")

sql = "select * from jul19_airPollution"

cur = con.cursor()
cur.execute(sql)

for no, nm, pm10, pm25 in cur:
    # print(no, nm, pm10, pm25)
    file.write(f"{no},{nm},{pm10},{pm25}\n")
    
file.close()
con.close()
print("성공")

