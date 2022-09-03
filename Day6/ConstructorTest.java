/*
* ConStructorTest(Day6-3)
* Version : 1.0
* Created : 2021.12.05
* Updated : 2021.12.05
* Author : U.S.Jung
*/
public class ConstructorTest {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("c color : " + c.color);
        System.out.println("c name : " + c.name);
        System.out.println("c type : " + c.type);
        Car c2 = new Car("Black", "뉴비틀", "풀옵션");
        System.out.println("c2 color : " + c2.color);
        System.out.println("c2 name : " + c2.name);
        System.out.println("c2 type : " + c2.type);
    }
}

class Car{
    String color;
    String name;
    String type;

    Car(){
//        color = "미정";
//        name = "개발중";
//        type = "기본형";
        this("미정", "개발중", "기본형");
        System.out.println("Car() 실행");
    }

    Car(String color, String name, String type){
        this.color = color;
        this.name = name;
        this.type = type;
        System.out.println("Car(S,S,S) 실행");
    }

    //init
    static{
        System.out.println("오늘의 업무를 시작합니다.");
    }

    {
        System.out.println("{}");
    }
}
