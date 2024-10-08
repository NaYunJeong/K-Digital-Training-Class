# -*- coding:utf-8 -*-
from cx_Oracle import connect

# DB연결 => 커피이름, 가격, 원두 정보 => .csv파일로 생성(, 를 기준으로)
#    ex)    이름,가격,원두
#           이름,가격,원두
#            ... 

con = connect("choco/1718@localhost:1521/xe")

file = open("C:/Users/sdedu/Desktop/Workspace/Python/coffee.csv", "a", encoding="UTF-8")

sql = "select c_name, c_price, c_bean from jul18_coffee"

cur = con.cursor()
cur.execute(sql)

for n, p, b in cur:
    print(n, p, b)
    file.write(f"{n},{p},{b}\n")

file.close()
con.close()