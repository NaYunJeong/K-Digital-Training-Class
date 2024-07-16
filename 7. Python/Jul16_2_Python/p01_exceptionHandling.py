# -*- coding:utf-8 -*-

# Java : 강제 => 언제 해야하는지 몰라도 됨
#        하기 싫은데도 해야하는...
#        직접 : try - catch - finally
#        미루기 : throws

# Python : 하기 싫으면 안해도 됨
#        직접 : try - except - else - finally

# error : 컴파일할때(소스를 기계어로 바꿀때) 컴파일작업을 실행하지 못하는 상황
# warning : 정리가 안된 소스(ex: 쓸모없는 변수 설정, close();를 안한 상황)
# exception : 실행하다가 예외적인 상황이 발생해서 정상적으로 돌아가지 않는 상황

# python은 인터프리터 방식 : 실행하면 그 때부터 한줄씩 기계어로 바꿔서 실행
# error ? exception ? 경계가 모호함
########################################################################
    # 미ㅓ리어ㅣ뮈후디ㅏㅜㅁ히ㅏㅓ이흐ㅠㅣㅁㅈ너ㅣ모허ㅣㅏㅇ롬너   # 15, 16번줄
    
try:
    # 정수 2개 입력받아서 앞의 숫자를 뒤의 숫자로 나눴을 때 그 몫을 출력
    x = int(input("x : "))
    y = int(input("y : "))      # 1. y가 0일 때 ZeroDivisionError 발생 
    z = x // y
    print(z)
    
    l = [1, 23, 456]
    print(l[y])                 # 2. y가 4일 때 인덱스가 없는 값으로 IndexError 발생
except Exception as asdf:       # 일괄적으로
    print(asdf)                 # 무슨 내용인지 알고 싶을 때

# except ZeroDivisionError:       # 1. 오류 해결
    # print("y에 0? 이거 맞아요?")
# except IndexError:              # 2. 오류 해결
    # print("list에 없음")

# try문에서 else를 사용하는 이유는, 단순 성능적인 부분이 아니라
# 에러가 발생할 가능성이 있는 부분과 그렇지 않은 부분을 정확히 구분지어
# 작성자의 의도를 명확하게 하기 위함
else:
    print("문제가 없으면 실행")

finally:
    print("문제가 있든 없든 무조건 실행(return보다 먼저 수행)")




