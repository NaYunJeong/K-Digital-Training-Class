# -*- coding:utf-8 -*-

sss = ["ㅋㅋㅋ", "ㅁㅁㅁ", "ㅂㅂㅂ", "ㅎㅎㅎ", "ㅁㅁㅋㅋㅋ", "ㄹㄹㄹ"]
for s in sss:
    # 찾는 문자열이 존재하는 경우 : 그 문자열이 있는 인덱스값을 리턴
    # 찾는 문자열이 존재하지 않는 경우 : -1 리턴
    print(s.find("ㅋㅋㅋ"))
    print(s.find("ㅊㅊㅊ"))
    print("------------")
    
# 조조(맹덕), 유비(현덕), 손권(중모)
# 책을 훑어보면서... => 위의 인물들이 몇 번 언급됐는지 카운팅하기!
# 인물, 언급횟수 의 형태로 => csv파일에 저장

wc = {"조조" : 0, "유비" : 0, "손권" : 0}

for i in range(1,11):
    # fileData = f"C:/Users/sdedu/Desktop/DB/ThreeKingdoms/ThreeKingdoms{i:02}.txt"
    fileName = "C:/Users/sdedu/Desktop/DB/ThreeKingdoms/ThreeKingdoms%02d.txt" % i
    # print(fileName)
    
    with open(fileName, "r", encoding="UTF-8") as f:
        for line in f.readlines():
            # print(line)
            line = line.replace("\n", "")
            line = line.split(" ")
            for word in line:
                print(word)
                if word.find("조조")!= -1 or word.find("맹덕") != -1:
                    wc["조조"] += 1
                elif word.find("유비")!= -1 or word.find("현덕") != -1:
                    wc["유비"] += 1
                elif word.find("손권")!= -1 or word.find("중모") != -1:
                    wc["손권"] += 1
for key in wc:
    print(key)
for val in wc.values():
    print(val)                    
    
with open("C:/Users/sdedu/Desktop/Workspace/Python/tkResult.csv", "w", encoding="UTF-8") as f:
    for k, v in wc.items():
        f.write(f"{k},{v}\n")
        
print("END !")
    
    
    
    