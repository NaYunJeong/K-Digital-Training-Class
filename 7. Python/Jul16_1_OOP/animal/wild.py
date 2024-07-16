# -*- coding:utf-8 -*-

class Tiger:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    def printInfo(self):
        print(self.name, self.age)
        
# [이 모듈을 실행했을 때 동작해라] 가 가능한 조건
#    프로그램의 시작점이라는 뜻
# main의 역할 : 이 모듈이 import를 당했을 때 아무작업도 하지 말고
#                실제 이 모듈에서 코드가 실행되었을 때만 동작해라
#            >> 실질적인 main 역할이 가능 O
if __name__ == "__main__":          # Java에서의 main 메소드와 유사한 기능
    from animal.pet import Dog      # animal 폴더에 있는 pet 모듈의 Dog 객체를 import
    d = Dog('고양이', 2)
    d.printInfo()
    
        