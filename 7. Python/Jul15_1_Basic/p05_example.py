# -*- coding:utf-8 -*-
import random

# UP/DOWN 게임 (함수)
# 유저의 이름을 입력받고 환영하는 인사를 출력
# (컴퓨터) 1 ~ 100 사이의 랜덤함 숫자를 하나 뽑아서
# 유저에게 정답을 입력하게 했을 때
# 저 범위의 숫자가 아니면 다시 입력하도록
# 입력한 숫자가 정답보다 작으면 'UP', 크면 'DOWN' 출력
# 정답을 맞췄을 때는 몇 번만에 맞췄는지 출력 + 종료
# 정답 기회는 총 10번

def greetUser():
    userName = input('이름 : ')
    print("반갑습니다 ~ " + userName + "님")

def getComAns():
    comAns = random.randint(1, 100)
    return comAns

def explainRule():
    print("#####################")
    print("기회는 총 10번 !")
    print("1부터 100사이의 숫자 맞추기 !")
    print("#####################")
    
def sayUserAns():
    userAns = int(input('숫자(1~100) : '))
    if userAns < 1 or userAns > 100:
        print('1~100사이의 숫자 입력 !')
    return userAns if 1 <= userAns <= 100 else sayUserAns()
    
def playGame():
    greetUser()
    comAns = getComAns()
    explainRule()
    count = 0
    while count < 10:
        userAns = sayUserAns()
        count += 1
            
        if userAns < comAns:
            print("UP")
        elif userAns > comAns:
            print("DOWN")
        else:
            print("#####################")
            print(count + '번 만에 정답 !')
            print("#####################")
            break
            
playGame()