# -*- coding:utf-8 -*-

# OOP : 객체 단위로 실생활을 표현 => 유지보수가 편하게
#    캡슐화 => 데이터를 안전하게 처리
#    1 file == 1 class => 코드 재사용

# Java : Perfect한 OOP
#    Java File(class) => 파일 하나가 곧 클래스 하나
#    클래스명은 항상 대문자로 시작! ex) Cat / Dog ...

# Python : hybrid한 OOP
#    Python File(module) => 파일 하나에 클래스가 여러개 들어올 수 있음
#                            (1 file != 1 class)
#    클래스명 무조건 대문자로 시작하라는 법은 없음 => Java에서 이미 대문자(대문자 사용)
#    접근제어자(ex: public, private, ...) 없음 => 캡슐화 없음
#    static 멤버변수 없음 (static 메소드는 있음)
########################################################################
class Shop():
    def showInfo(self):
        print(self.name, self.floor)
        
class Dog:
    name = "sadf"   # 의미 없음
                    # 58번줄에서 넣은 값이 23번줄의 name에 담기는 것이 아님
                    # 단순 기본값 처리용
                    # 58번줄이 없었을 때에 출력되는 기본값일 뿐
                    # 멤버변수는 생성자에서 만들어줄것!
                    
    def bark(self):             # (self) 필수 요소
        print("왕와오앙왕앙!!")
        
    def printInfo(self):
        # (Java의 this. = Python의 self.)
        # Java : this.name => this. 은 생략이 가능 => name(멤버변수명으로 사용O)
        # Python : self.name => self. 은 생략이 불가능 => self.name으로 써야함
        print(self.name, self.age)
    
    # overloading 지원 안됨 => 모든 메소드명은 다 달라야
    def printInfo2(self, c):
        for _ in range(c):
            print(self.name, self.age)
    
    # static method : 객체를 만들지 않고 사용할 수 있는 메소드
    # @ : decorator(데코레이터)_python / (anotation_java)      
    @staticmethod               
    def staticMethodTest():
        print("Mㅔthㅗdㅡ")
        
##########################################################################
Dog.staticMethodTest()

s = Shop()
s.name = '카페'
s.floor = 1
s.showInfo()
print("------------------")
d = Dog()
d.name = "댕댕이"
d.age = 1982
print(d, type(d))
d.printInfo()
d.bark()            # 메소드 호출방법 1
Dog.bark(d)         # 메소드 호출방법 2
print("------------------")
d.printInfo2(3)


