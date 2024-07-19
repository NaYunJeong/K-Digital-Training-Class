# -*- coding:utf-8 -*-

# 파일로부터 데이터를 읽어와서 프로그램에서 활용하기 위함
# 프로그램에서 만든 데이터를 파일형태로 저장하기 위함
# 파일 열기 => 작업(읽기, 쓰기) => 파일 닫기 (필수 !!)

# .txt파일 / .csv (Comma Separated Value)파일

# 1. 파일에 내용 쓰기 (write)
# 파일을 만들어낼 폴더는 미리 만들어둬야함 / 파일은 존재하지 않아도 실행 시 파일을 만들어줌
# C:\Users\sdedu\Desktop\Workspace\Python

# file(\->/변경, +/파일명.확장자) / mode(쓰기->"w") / encoding("utf-8") 만 활용
# w : 덮어쓰기 (재실행하여도 txt아래에 내용이 추가되는 것이 아닌 기존 내용을 덮어씀)
# file = open("C:/Users/sdedu/Desktop/Workspace/Python/test.txt", "w", encoding="UTF-8") 
# file.write("어제 오늘 호우주의보가 발효됨")
# print("완료!")
# file.close()

# 2. 파일에 내용을 추가 (append)
# file = open("C:/Users/sdedu/Desktop/Workspace/Python/test.txt", "a", encoding="UTF-8") 
# file.write("\n비좀 그만왔으면 좋겠어요...\n머리가 난리부르스에요...")
# print("완료!")
# file.close()

# 3. 파일 읽어오기 (read)
file = open("C:/Users/sdedu/Desktop/Workspace/Python/test.txt", "r", encoding="UTF-8") 

# # 3-1. 파일 전체 읽기
# data = file.read()
# print(data)
# file.close()

# 3-2. 파일을 한줄씩 읽기
while True:     # 내가 가져온 파일의 내용이 언제 끝날지 모르기 때문에 True
    data = file.readline()  # 한 줄을 읽어옴
    print(data, end="")
    # readline의 결과가 공백인 상황 (파일의 맨 마지막 줄까지 끝난 상황)
    if data == "":
        break
        
file.close()
