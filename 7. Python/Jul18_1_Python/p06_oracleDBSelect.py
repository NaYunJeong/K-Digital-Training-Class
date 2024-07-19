# -*- coding:utf-8 -*-
from cx_Oracle import connect

# input으로 숫자 2개를 입력 => 가격순(오름차순)으로 정렬해서
#                        => ? ~ ?번째까지의 평균가격을 출력

con = connect("choco/1718@localhost:1521/xe")

start = int(input("시작 : "))
end = int(input("끝 : "))

sql = "select avg(c_price) "
sql += "from (select rownum as rn, c_price "
sql += "        from (select c_price "
sql += "            from jul18_coffee order by c_price)) "
sql += f"where rn between {start} and {end}"

cur = con.cursor()
cur.execute(sql)

for a in cur:   # cur안에 tuple형태로 결과가 담김
    print(a)
    print(type(a))
    print(a[0])

con.close()


