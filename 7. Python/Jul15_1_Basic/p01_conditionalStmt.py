# -*- coding:utf-8 -*-
from test.test_tools.test_unparse import elif1

# 조건문 : 흐름 제어

if True:                      # if문 뒤 {} 대신 :(콜론) 사용
    print("와 ~ 조건문")        # if문 내의 문장은 들여쓰기 필수!
if False:
    print("안나오G ~ ?")
#############################################################
# 우선순위 (산술, 관계, 논리)
# 산술 > 관계 > 논리
print(10 + 2 > 8 + 3)           # 산술이 관계보다 앞서서 => 12 > 11
print(10 + 2 * 2 > 8 + 3 * 2)   # 14 > 14
print(((10 + 2) > 3) and (6 + 4 == 10))
#############################################################
# if 조건A:
    # 코드
# else:
    # 코드
    
# 놀이동산 >> A : 성인, 150이상 (나이, 키 값은 입력받아서)
# 입력시에 => 탑승 가능 or 탑승 불가 출력
age = int(input('나이 : '))
height = float(input('키 : '))
# 1)
# if (age >= 20):
    # if (height >= 150):
        # print('탑승 가능')
    # else:
        # print('탑승 불가')
# else:
    # print('탑승 불가')

# 2)   
# if (age >= 20 and height >= 150):
    # print("탑승 가능")
# else:
    # print("탑승 불가") 
    
# 3)
print("탑승가능" if (age >= 20 and height >= 150) else "탑승 불가")
print((age >= 20 and height >= 150) and "탑승 가능" or "탑승 불가")
#############################################################
# 다중 조건문
# Java : if - else if - else
# Python : if - elif - else
# 점수 입력 => 80점 이상은 'A'
#            70점 이상은 'B'
#            60점 이상은 'C'
#            나머지는 'D'를 출력

score = int(input('점수 : '))
if score > 100 or score < 0:
    print("점수 범위가 아닙니다.")
elif (score >= 80):
    print("A")
elif (score >= 70):
    print("B")
elif (score >= 60):
    print("C")
else:
    print("D")
#############################################################
# switch - case : 없음! (if-elif-else로 조합하여 사용)

# in, not in
abc = {"name" : "나윤", "age" : 19, "phone" : "010-1234-5678"}
    
print("name" in abc)            # True
print(20 in abc.values())       # False
print("height" not in abc)      # True
    
    
    