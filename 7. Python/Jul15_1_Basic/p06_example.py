# -*- coding:utf-8 -*-
from random import randint
import time

# Java (null) = Python (None)

# 가위바위보 (함 => 한번 질 때까지 => 총 몇번 이겼는 지 출력)
handleTable = [None, "가위", "바위", "보"]

def printRule():
    print("------------")
    for i, h in enumerate(handleTable):
        if (i != 0):
            print("[%d] %s" % (i, h))
    print("------------")

def comFire():
    return randint(1, 3)

def userFire():
    print("------------")
    uh = int(input("뭐낼까? : "))
    print("------------")
    if (1 <= uh <= 3):
        return uh
    else:
        print("잘못입력했음 !")
        return userFire()

def printHand(uhuh, chch):
    print("유저 : %s" % handleTable[uhuh])
    print("컴퓨터 : %s" % handleTable[chch])

def judge(uhuh, chch):
    t = uhuh - chch
    if t == 0:
        print("무승부")
        return 0
    elif t == -1 or t == 2:
        print("패배")
        return 999
    else:
        print("승리")
        return 1
    
def playGame():
    printRule()
    win = 0
    while True:
        uHand = userFire()
        cHand = comFire()
        printHand(uHand, cHand)
        result = judge(uHand, cHand)
        if result == 999:
            print("------------")
            print("종료")
            
            if win >= 10:
                time.sleep(1) # Java의 Thread.sleep()
                print(".", end="")
                time.sleep(1)
                print(".", end="")
                time.sleep(1)
                print(".", end="")
                time.sleep(1)
                print("Great!")
            elif win >= 5:
                time.sleep(1)
                print(".", end="")
                time.sleep(1)
                print(".", end="")
                time.sleep(1)
                print(".", end="")
                time.sleep(1)
                print("Good!")
            else:
                time.sleep(1)
                print(".", end="")
                time.sleep(1)
                print(".", end="")
                time.sleep(1)
                print(".", end="")
                time.sleep(1)
                print("Bad!")
            break
        win += result
    print("%d승으로 종료 ! " % win)
######################################################
playGame()


# def explainRule():
    # print("0 : 가위")
    # print("1 : 바위")
    # print("2 : 보")
    # print("---------------------")
    #
# def getComAns():
    # comAns = random.randint(0, 2)
    # return comAns
    #
# def getUserAns():
    # userAns = int(input('숫자 선택 (0,1,2) : '))
    # if userAns < 0 or userAns > 2:
        # print("0,1,2 중에서 선택")
    # return userAns if 0 <= userAns <= 2 else getUserAns()
    #
# def playGame() :
    # explainRule()
    # comAns = getComAns()
    # win, lose, draw = 0, 0, 0
    #
    # while True:
        # userAns = getUserAns()
        # if userAns == 0:    # 가위
            # if comAns == 0:
                # print("비김")
                # draw += 1
            # elif comAns == 2:
                # print("User 승")
                # win += 1
            # elif comAns == 1:
                # print("User 패")
                # lose += 1
                # print("승리횟수 : ", win)
                # break
                #
        # if userAns == 1:    # 바위
            # if comAns == 1:
                # print("비김")
                # draw += 1
            # elif comAns == 0:
                # print("User 승")
                # win += 1
            # elif comAns == 2:
                # print("User 패")
                # lose += 1
                # print("승리횟수 : ", win)
                # break
                #
        # if userAns == 2:    # 보
            # if comAns == 2:
                # print("비김")
                # draw += 1
            # elif comAns == 1:
                # print("User 승")
                # win += 1
            # elif comAns == 0:
                # print("User 패")
                # lose += 1
                # print("승리횟수 : ", win)
                # break
                #
# playGame()











