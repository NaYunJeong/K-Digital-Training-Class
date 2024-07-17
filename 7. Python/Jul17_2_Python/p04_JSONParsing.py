# -*- coding:utf-8 -*-
from http.client import HTTPSConnection
from json import loads
from urllib.parse import quote

# f8770d180132ae1c23514061344fd981
# https://dapi.kakao.com/v3/search/book

# 책 이름을 검색해서 책 제목 - 작가 / 할인가 / 도서 소개 출력

bookName = input("책 이름 : ")
bookName = quote(bookName)
# print(bookName)

hc = HTTPSConnection("dapi.kakao.com")
head = {
    "Authorization" : "KakaoAK f8770d180132ae1c23514061344fd981"
    }
hc.request("GET", "/v3/search/book?query=" + bookName, headers=head)

resBody = hc.getresponse().read()
# print(resBody.decode())
######################################################################
bookData = loads(resBody)   # JS => Python
# print(type(bookData))
######################################################################
books = bookData["documents"]
print(books)

for b in books:
    try:
        print(b["title"], "-", b["authors"][0])        # 저자 한명만 출력됨 / # 저자가 없는 경우 'list index out of range' 에러 => try
        # print(b["title"], "-", ", ".join(b["authors"]))  
                                    # .join() : list를 문자열로 만들때 사용
                                    # 구분자.join() : list의 요소들을 지정한 구분자로 나눠
                                    #                하나의 문자열로 합쳐줌
                                    # ex) ", ".join(['a', 'b' ,'c']) => a, b, c
        print(b["sale_price"])
        print(b["contents"])
        print("---------------------")
    except Exception as e:
        print("", end="")
    
# print(bookData["documents"][0]["title"])
# print(bookData["documents"][0]["authors"])
# print(bookData["documents"][0]["sale_price"])
# print(bookData["documents"][0]["contents"])
