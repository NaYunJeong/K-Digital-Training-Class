# -*- coding:utf-8 -*-

# function(함수)
# def 함수명(파라미터명):
    # code
    
def test():
    print("잠못잔 나윤")
    
def test2():    # :(콜론)을 썼으면 그 다음줄에는 반드시 들여쓰기를 해야!!
   pass             # : 뒤에 코드 적을것이 없을 때, 자리 채워주라는 의미
# 정수 2개를 넣으면 그 합을 '출력'하는 함수
def printSum(a=5, b=8):     # 함수를 호출할 때 값을 안넣어주면 함수의 파라미터 값을 기본값으로 사용
    print(a + b)

# 정수 3개를 넣으면 그 합을 '출력'하는 함수
def printSum2(a=5, b=8, c=16):  # overloading이 안됨 => 모든 함수명이 다 달라야 함
    print(a + b + c) 
    
# 정수 2개를 넣으면 그 합을 '구하는' 함수
def getSum(a, b):
    return a + b

# 정수 2개를 넣으면 사칙연산 결과를 '구하는 함수
def calc(a, b):
    
    '''
        설명서...
        이 설명서는 1734년 영국에서부터 시작되어..
        $^@%@#$%#$!$%$^%$#&%$^%@#^#@
    '''
    
    q = a + b
    w = a - b
    e = a * b
    r = a / b
    return q, w, e, r   # tuple 하나 리턴

##################################################################
help(calc)
help(print())     # 궁금한 함수가 있다면 help를 이용하여 해당 설명 확인
test()
printSum(3, 5)
printSum()
printSum2(3, 13, 9)
c = getSum(10, 20)
print(c)

d = calc(20, 10)
print(d, type(d))

# u, i, o, p = calc(20, 10)    # 튜플을 각각의 변수에 넣어줌(자리에 맞게)

u, i, _, p = calc(20, 10)
print(u, i, p)


