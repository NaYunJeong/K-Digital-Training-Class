# -*- coding:utf-8 -*-
from http.client import HTTPSConnection
from urllib.parse import quote
from cx_Oracle import connect
from json import loads

# API키 : f8770d180132ae1c23514061344fd981
# Authorization: KakaoAK ${REST_API_KEY}
# https://dapi.kakao.com/v2/local/search/keyword.json
# query / x / y / radius 
# 37.5037754 / 127.0240711

# json 데이터
# 검색어를 입력
#    => 위도/경도 지정
#    => 반경 1km이내에 있는
#    => 검색어에 대한 위치 정보

#    => 장소명(업체명), 전화번호, 경도, 위도
#    => DB에 저장
#    => 전화번호 : 없는 부분은 ' - ' 으로 대체
#    => 경도, 위도 : 소수점 6자리까지 저장

search = quote(input("장소 : "))
# print(search)

# y = float(input("y : "))
# x = float(input("x : "))

hc = HTTPSConnection("dapi.kakao.com")
url = f"/v2/local/search/keyword.json?query={search}&x=127.0240711&y=37.5037754&radius=1000"

head = {"Authorization": "KakaoAK f8770d180132ae1c23514061344fd981"}

hc.request("GET", url, headers=head)

resBody = hc.getresponse().read()
# print(resBody.decode())
########################################################################### 여기까지가 HTTP통신
# DB => insert

con = connect("choco/1718@localhost:1521/xe")
cur = con.cursor()
location = loads(resBody)

for l in location["documents"]:
    sql = "insert into search_location values( "
    sql += "search_location_seq.nextval, "
    sql += f"'{l['place_name']}', "
    sql += f"nvl('{l['phone']}', '-'), "
    sql += f"{float(l['x']):.6f}, "
    sql += f"{float(l['y']):.6f})"
    cur.execute(sql)
    
con.commit()
con.close()
print("완료!")












