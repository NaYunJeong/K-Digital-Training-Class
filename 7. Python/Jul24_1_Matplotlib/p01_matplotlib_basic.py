# -*- coding:utf-8 -*-

import matplotlib.pyplot as plt
import matplotlib.font_manager as fm
import numpy as np

# Numpy : 다차원 배열, 행렬 연산
#    cmd => pip install numpy

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)

# matplotlib에서는 일반적으로 Numpy에 있는 Array를 이용
# Numpy를 사용하지 않더라도, 모든 시퀀스는 내부적으로 Array로 변환을 해서 사용

yData = np.array([12, 31, 1, 2])  # Numpy의 Array를 사용
xData = [1, 2, 3, 4]              # Numpy를 사용하지 않아도 내부적으로 변환

# 기본
# plt.plot(yData)     # plot : 선
# plt.show()

# x, y축 지정
# plt.plot(xData, yData)
# plt.show()

# 축
# plt.plot(xData, yData)
# plt.xlabel("x축")
# plt.ylabel("y축")
# plt.axis([0, 10, 0, 50])  # [xmin, xmax, ymin, ymax]
# plt.show()

# 제목(title)
# plt.plot(xData, yData)
# f = {"fontsize" : 15, "fontweight" : "light"}  # bold, light, ultralight, ...
# plt.title("ㅋㅋ", loc="left")     # 왼쪽 배치
# plt.title("ㅎㅎ", loc="center")   # 가운데 배치
# plt.title("제목", loc="right", fontdict=f)   # 오른쪽 배치
# plt.show()

# style
# plt.plot(xData, yData, "c-.h")  # c(선의 색상) / -.(선의 모양)
# plt.show()

# 색 / 선의 모양 / 마커의 모양
# 색
#    b : blue / g : green / r : red / y : yellow / k : black / w : white / c : cyan
#    plot함수의 color라는 옵션으로 RGB를 지정하는 것도 가능 !

# 선의 모양
#    ':' : 점선 / '-' : 실선 / '--' : dashed line / '-.' : 실선 + 점선
#    plot함수의 linestyle이라는 옵션으로 지정하는 것이 가능 !

# 마커의 모양
#    '.' : 점 / 'o' : 동그라미 / 'v' : 아래 삼각형 / '^' : 위 삼각형
#    '<', '>' : 삼각형 왼쪽, 오른쪽 / 's'(스퀘어) : 사각형 / 'p'(펜타) : 오각형
#    'h'(헥사) : 육각형 / '*' : 별 / '+' : +모양 / 'x' : x모양 
#    plot함수의 marker라는 옵션으로 지정하는 것이 가능 !

# 실습
# plt.plot(xData, yData, "b:s")
# plt.title("실습해봅시다아")
# plt.xlabel("x축")
# plt.ylabel("y축")
# plt.axis([0, 10, 0, 40])
# plt.show()

# plt.plot(xData, yData, color="#A566FF", linestyle="--",
         # marker="*", linewidth=5, markersize=10)
# plt.show()

# grid (격자)
# plt.plot(xData, yData)
# plt.grid(axis="both", color="#997700", linestyle="-.")
# plt.show()

# 눈금
# plt.plot(xData, yData)
# plt.xticks(xData, ["일", "이", "삼", "사"])
# plt.yticks(np.arange(0, 41, 10), ["ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ"])
# plt.tick_params(axis="x", direction="inout", length=10, pad=15,
# #            x, y, both    in,out,inout(눈금위치)  눈금의길이
                # color="r", labelsize=20, labelcolor="#F15F5F")
# plt.show()

# 선
# plt.plot(xData, yData)
#
# # 실제 y값, xmin, xmax => 지정한 점을 따라서 수평선
# plt.hlines(31, 1, 2, color="r", linestyles="--")
# # 실제 x값, ymin, ymax => 지정한 점을 따라서 수직선
# plt.vlines(1, 31, 12, color="r", linestyles="--")
# plt.show()

# 선 여러개
# xData = [1, 2, 3, 4]              
# yData = np.array([12, 31, 1, 2])  
# # yData2 = [5, 66, 1, 10]
# # yData2 = [500, 600, 100, 1000]
# # plt.plot(xData, yData, "r-")
# # plt.plot(xData, yData2, "g:")
# # plt.legend(["빨강데이터", "초록데이터"])
# # plt.show()
#
# # 선 여러개 2 (y축을 나눠서 (y데이터 격차가 클 경우 다른 그래프의 값이 미미하게 보임))
# yData2 = [500, 600, 100, 1000]
#
# x1 = plt.subplot()  # subplot : 여러 그래프들을 동시에 시각화
# p1 = x1.plot(xData, yData, "r-")
# x1.set_xlabel("x축")
# x1.set_ylabel("y축")
#
# x2 = x1.twinx()     # twinx : x축을 공유
# p2 = x2.plot(xData, yData2, "g:")
# x2.set_ylabel("y축2")
# x1.legend(p1 + p2, ["Red", "Green"])    # p1 + p2 : 별개의 그래프 두개를 이어주겠다
# plt.show()



