# -*- coding:utf-8 -*-
from cx_Oracle import connect

# select 번호순으로 조회(console에 번호순 출력) => 번호를 입력하면 => 그 데이터가 삭제!
# 999를 입력하게 되면 프로그램이 종료 => 종료하기 전까지 반복

con = connect("choco/1718@localhost:1521/xe")

while True:
    sql = "select * from jul18_coffee order by c_no"
    cur = con.cursor()
    cur.execute(sql)

    for no, name, price, bean in cur:
        print(f"{no}] {name}, {price:,}원, {bean}산")
    print("------------------------------")
    
    # input으로 번호를 입력하면, 해당 데이터가 삭제되도록
    no = int(input("번호 입력 : "))
    
    if no == 999:
        print("종료")
        break
    
    sql = f"delete from jul18_coffee where c_no = {no}"
    
    cur.execute(sql)

    if cur.rowcount == 1:
        print("삭제 성공")
        con.commit()
    
con.close()