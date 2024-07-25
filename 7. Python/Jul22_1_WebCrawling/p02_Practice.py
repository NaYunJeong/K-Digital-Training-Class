# -*- coding:utf-8 -*- 
import urllib.request as req
from urllib.error import HTTPError, URLError

# 저장 경로 - list 형식으로 !

urlList = ["data:image/jpeg;base64,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",
           "https://www.google.com"]

pathList = ["C:/Users/sdedu/Desktop/Workspace/Test1/data/iu2.png",
            "C:/Users/sdedu/Desktop/Workspace/Test1/data/index.html"]

for i, url in enumerate(urlList):
    # 예외처리
    try:
        # web의 수신정보를 확인
        res = req.urlopen(url)
        
        # 수신받는 내용
        content = res.read()
        print("----------------------------")
        
        # 상태정보 확인
        print(f"헤더 정보 : {i, res.info()}")
        print(f"http status : {res.getcode()}")
        print("----------------------------")
        
        # 파일 쓰기
        # with : 파일을 열고, 닫는거 같이 해주는 역할
        with open(pathList[i], "wb") as f:     # 'w' : write / 'b' : binary mode
            f.write(content)
        
    except HTTPError as e:
        print("HTTPError Code : ", e.code)
    except URLError as e:
        print("URLError Code : ", e.code)
    else:
        print("----------------------------")
        print("성 공 !")
        print("----------------------------")
        