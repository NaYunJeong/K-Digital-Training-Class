# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from xml.etree.ElementTree import fromstring
from json import loads

# http://openapi.seoul.go.kr:8088/(인증키)/json/CardSubwayPayFree/1/1000/201501/
# 4f626857416f6c6c3632586a416843

# 2019 ~ 2023년 월별로 > 하나의 파일(csv)에 저장
# 연월(ex:201901),호선명,지하철역,유임승차인원,무임승차인원,유임하차인원,무임하차인원

with open("C:/Users/sdedu/Desktop/Workspace/Python/python_data/subwayPayFree.csv", "a", encoding="UTF-8") as f:
    hc = HTTPConnection("openapi.seoul.go.kr:8088")
    
    for year in range(2019, 2024):
        for month in range(1, 13):
            when = "%d%02d" % (year, month)
            for start in range(1, 2000, 1000):
                hc.request("GET", f"/4f626857416f6c6c3632586a416843/json/CardSubwayPayFree/{start}/{start+999}/{when}/")
                resBody = hc.getresponse().read()
                subwayData = loads(resBody)
                
                if "CardSubwayPayFree" in subwayData:
                    for s in subwayData["CardSubwayPayFree"]["row"]:
                        f.write(f"{when},")
                        f.write(f"{s['SBWY_ROUT_LN_NM']},")
                        f.write(f"{s['STTN']},")
                        f.write(f"{s['RMIO_GTON_NOPE']},")
                        f.write(f"{s['FREECHRG_GTON_NOPE']},")
                        f.write(f"{s['RMIO_GTOFF_NOPE']},")
                        f.write(f"{s['FREECHRG_GTOFF_NOPE']}\n")

print("끝!")


# with open("C:/Users/sdedu/Desktop/Workspace/Python/python_data/subwayPayFree.csv", "a", encoding="UTF-8") as f:
    # hc = HTTPConnection("openapi.seoul.go.kr:8088")
    #
    # years = range(2019, 2024)
    # months = range(1, 13)
    # subwayData = []
    #
    # for year in years:
        # for month in months:
            # # year_month = f"{year}"
            #
            # hc.request("GET", f"/4f626857416f6c6c3632586a416843/xml/CardSubwayPayFree/1/1000/{year}{month:02d}/")
            #
            # resBody = hc.getresponse().read()
            # # print(resBody.decode())
            #
            # for s in fromstring(resBody).iter("row"):
                # data = {
                    # "연월" : s.find("USE_MM").text,
                    # "호선명" : s.find("SBWY_ROUT_LN_NM").text,
                    # "지하철역" : s.find("STTN").text,
                    # "유임승차인원" : s.find("RMIO_GTON_NOPE").text,
                    # "무임승차인원" : s.find("FREECHRG_GTON_NOPE").text,
                    # "유임하차인원" : s.find("RMIO_GTOFF_NOPE").text,
                    # "무임하차인원" : s.find("FREECHRG_GTOFF_NOPE").text,
                    # }
                # subwayData.append(data)
                # # print(subwayData)
            
    