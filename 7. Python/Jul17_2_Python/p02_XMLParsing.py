# -*- coding:utf-8 -*-
from http.client import HTTPSConnection
from urllib.parse import quote
from xml.etree.ElementTree import fromstring


# 네이버 개발자 센터 - 로그인 - Application - ID / Secret 가져오기
# 1eFvj50LoTCSGgY_S07x
# TRi3rapCOJ

# Document - 서비스 API - 검색 - 쇼핑 - 요청 URL - xml 주소 가져오기
# https://openapi.naver.com/v1/search/shop.xml/

# 상품명 : 입력
# xml 파싱해서
# 문서의 상품 이름 / 최저가 / 브랜드 / 대분류 카테고리 정보를 출력


q = input("상품명 : ")

# URLEncoding해서 주소로 넘겨줄 것
q = quote(q)     # quote(urllib.parse) 
print(q)

def cut(t):
    t = t.replace("<b>", "").replace("</b>", "")
    return t

hc = HTTPSConnection("openapi.naver.com")
# request 함수의 body
#    : 요청할 때 데이터를 보내야 하는 경우에 body에 담아서 보냄

h = {
    "X-Naver-Client-Id": "1eFvj50LoTCSGgY_S07x",
    "X-Naver-Client-Secret": "TRi3rapCOJ"
    }

hc.request("GET", "/v1/search/shop.xml?query=" + q, headers=h)

resBody = hc.getresponse().read()
print(resBody.decode())

# XML Parsing
# DOM객체 여러개 찾기 : .getiterator("태그명") / .iter("태그명")
# DOM객체 하나 찾기 : .find("태그명")

for p in fromstring(resBody).iter("item"):
    print(cut(p.find("title").text))
    print(p.find("lprice").text)
    print(p.find("brand").text)
    print(p.find("category1").text)
    print("----------------------------")
 
