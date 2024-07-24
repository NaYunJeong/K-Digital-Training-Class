# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from json import loads

# http://openapi.seoul.go.kr:8088/(인증키)/json/CardBusStatisticsServiceNew/1/5/20151101/
# 4f626857416f6c6c3632586a416843                                        # 시작번호/끝번호/날짜

# 2021 ~ 2023년 3년치 데이터를
# 연,월,일,노선번호,정류장명(역명),승차총승객수,하차총승객수
# 연도별로 csv파일에 저장

# 정류장명(역명) => 혹시 ,가 들어있을수도 있으니
#        => ,를 .로 바꿔서 저장
 
# 인원수 관련 => 정수형태로 저장
hc = HTTPConnection("openapi.seoul.go.kr:8088")

page = 1
start = 20210101

while True:
    hc.request("GET", f"/4f626857416f6c6c3632586a416843/json/CardBusStatisticsServiceNew/{page}/{page} + 1000/{start}/")
    resBody = hc.getresponse().read()

    print(resBody.decode())
    
    busData = loads(resBody)
    busStations = busData["CardBusStatisticsServiceNew"]["rows"]
    
    for b in busStations:
        print(b[])
    page += 1
    start += 1
    
    
    
    