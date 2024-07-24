# -*- coding:utf-8 -*-
import numpy as np
import matplotlib.pyplot as plt
import matplotlib.font_manager as fm

from http.client import HTTPConnection
from json import loads

# http://openAPI.seoul.go.kr:8088/(인증키)/json/RealtimeCityAir/1/25/
# 4f626857416f6c6c3632586a416843

# 서북권, 도심권, 동북권, ... 의 미세먼지 / 초미세먼지
#    각각 평균값을 bar그래프로 표현 (누적합)

hc = HTTPConnection("openAPI.seoul.go.kr:8088")
hc.request("GET", "/4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/")

resBody = hc.getresponse().read()
# print(resBody.decode())

airData = loads(resBody)

whereDict = {}  # {'동남권' : 3, '서북권' : 2, ... }
pm10Dict = {}   # {'동남권' : 150.0, '서북권' : 147.0, ...}
pm25Dict = {}

for a in airData["RealtimeCityAir"]["row"]:
    # print(a["MSRRGN_NM"], a["PM10"], a["PM25"])
    where = a["MSRRGN_NM"]
    pm10 = float(a["PM10"])
    pm25 = float(a["PM25"])
    
    if where in pm10Dict:
        pm10Dict[where] += pm10
        pm25Dict[where] += pm25
        whereDict[where] += 1
    else:
        pm10Dict[where] = pm10
        pm25Dict[where] = pm25
        whereDict[where] = 1
    print(whereDict);   print(pm10Dict);    print(pm25Dict); print("------")

print("최종");    print(whereDict);   print(pm10Dict);    print(pm25Dict); print("------")
#########################################################################################
rgns = []
pm10s = []
pm25s = []

for k, v in whereDict.items():
    rgns.append(k)
    pm10s.append(pm10Dict[k] / v)
    pm25s.append(pm25Dict[k] / v)
    
print("-------------------")
print(rgns);    print(pm10s);   print(pm25s)

# avgPM10s = sum(pm10s) / len(pm10s)
# # print(avgPM10s)
# avgPM25s = sum(pm25s) / len(pm25s)
# # print(avgPM25s)

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName) 
    
c = ['#FFB2D9', '#D941C5']
plt.bar(rgns, pm10s, color="#FFB2D9")
plt.bar(rgns, pm25s, color="#D941C5", bottom=pm10s)
plt.title("서울시 권역별 평균 초/미세먼지 농도", loc="center")
plt.legend(["미세먼지", "초미세먼지"])
plt.show()
    
    
