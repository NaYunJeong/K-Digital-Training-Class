# -*- coding:utf-8 -*-

# 방금 만든 csv파일 불러와서
#     연월에 맞춰서 => 유임승차,무임승차,유임하차,무임하차 인원수 계산하여
#    => 선 그래프 그리기!

import matplotlib.pyplot as plt
import matplotlib.font_manager as fm

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)

prnDict, frnDict, panDict, fanDict = {}, {}, {}, {}

with open("C:/Users/sdedu/Desktop/Workspace/Python/python_data/subwayPayFree.csv", "r", encoding="UTF-8") as f:
    for line in f.readlines():
        # print(line)
        line = line.replace("\n", "").split(",")
        # print(line)
        when = line[0]
        prn = float(line[3]); frn = float(line[4]); pan = float(line[5]); fan = float(line[6])
        
        if when in prnDict:
            prnDict[when] += prn
            frnDict[when] += frn
            panDict[when] += pan
            fanDict[when] += fan
        else:
            prnDict[when] = prn
            frnDict[when] = frn
            panDict[when] = pan
            fanDict[when] = fan
# print(when)
print(prnDict)
# print(frnDict)
# print(panDict)
# print(fanDict)
#
whens, prns, frns, pans, fans = [], [], [], [], []
for k, v in prnDict.items():
    whens.append(k)
    prns.append(v)
    frns.append(frnDict[k]) # key에 해당하는 value
    pans.append(panDict[k])
    fans.append(fanDict[k])
print("----------------------")
print(whens)
print(prns)
print(frns)
print(pans)
print(fans)
#
# plt.plot(whens, prns, color="#EF9A9A")
# plt.plot(whens, frns, color="blue")
# plt.plot(whens, pans, color="#90CAF9")
# plt.plot(whens, fans, color="black")
# plt.legend(["유임승차" , "무임승차" , "유임하차" , "무임하차"])
# plt.title("월별 지하철 유,무임 승차 정보")
# plt.show()

###########################################################################
# rgnn_sum = 0
# fgnn_sum = 0
# rgfn_sum = 0
# fgfn_sum = 0
# date = []
# rgnn = []
# fgnn = []
# rgfn = []
# fgfn = []
#
# with open("C:/Users/sdedu/Desktop/Workspace/Python/python_data/subwayPayFree.csv", "r", encoding="UTF-8") as f:
    # for year in range(2019, 2024):
        # for month in range(1, 13):
            # when = "%d%02d" % (year, month)
            # date.append(when)
            # for line in f.readlines():
                # line = line.replace("\n", "").split(",")
                
                # rgnn_sum += float(line[3])
                # fgnn_sum += float(line[4])
                # rgfn_sum += float(line[5])
                # fgfn_sum += float(line[6])
                # rgnn.append(rgnn_sum)            
                # fgnn.append(fgnn_sum)            
                # rgfn.append(rgfn_sum)            
                # fgfn.append(fgfn_sum)            
            #
# print(rgnn)
# print(fgnn)
# print(rgfn)
# print(fgfn)
# print(date)

# x1 = plt.subplot()
# p1 = x1.plot(date, rgnn, "r-")
#
# x2 = x1.twinx()
# p2 = x2.plot(date, fgnn, "b-")
# p3 = x2.plot(date, rgfn, "g-")
# p4 = x2.plot(date, fgfn, "y-")
#
# x1.legend(["유임승차" , "무임승차" , "유임하차" , "무임하차"])
# plt.show()


