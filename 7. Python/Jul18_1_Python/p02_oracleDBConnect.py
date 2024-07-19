# -*- coding:utf-8 -*-
from cx_Oracle import connect

# OracleDB와 연동이 되는 Java : instantClient에 있는 ojdbc8.jar
# OravleDB와 연동이 되는 Python : cx_Oracle.py(가 instantClient를 사용)

# 기본적으로 python에는 OracleDB 연결 기능이 없음..
# 설치해주자
# 시작 - cmd -> pip install cx_oracle  /  pip list
# pip list

# sqlplus로 접속할 때 사용하는 주소
#    sqlplus [ID]/[PW]@[IP Address]:[PORT]/{SID}
#    sqlplus choco/1718@localhost:1521/xe

try:
    c = connect("choco/1718@localhost:1521/xe")            # connect(cx_Oracle)
    print("성공 !")
except Exception as e:
    print(e)

c.close()