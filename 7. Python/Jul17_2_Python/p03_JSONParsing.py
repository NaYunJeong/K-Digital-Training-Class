# -*- coding:utf-8 -*-
from urllib.parse import quote
from http.client import HTTPSConnection
from xml.etree.ElementTree import fromstring
from json import loads

# Keys: 42008a8c8e7402a3fc9d3b1a7df8fee9

# https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}&units=metric&lang=kr

# 도시 이름 : 입력 (영어)
# 요청파라미터 추가 O
# 응답 내용 출력까지

cityName = input("도시 이름(영어) : ")

hc = HTTPSConnection("api.openweathermap.org")
url = "/data/2.5/weather?q=%s&appid=42008a8c8e7402a3fc9d3b1a7df8fee9&units=metric&lang=kr" % cityName
hc.request("GET", url)

resBody = hc.getresponse().read()
# print(resBody.decode()) # 여기까지가 HTTP 통신

weatherData = loads(resBody)    # JS => Python
# print(weatherData)

# dict : {"key" : "value"}
# list : [1, 2, 3] => 인덱스 값으로
l = [1, 2, 3]                           # python : list / JS : array
d = {"name" : "홍길동", "age" : 30}      # python : dict / JS : object
###########################################################################
# 날씨 / 기온 / 체감기온 / 습도 / 바람속도
# 데이터를 콘솔창에 출력
# dict / list 잘 확인하면서 진행

# 단 하나의 데이터 O => 반복문이 필요없음 !

print(weatherData["weather"][0]["description"])
print(weatherData["main"]["temp"])
print(weatherData["main"]["feels_like"])
print(weatherData["main"]["humidity"])
print(weatherData["wind"]["speed"])
    
    







