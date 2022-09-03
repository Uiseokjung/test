/*
* SmartPhone
* Version : 1.0
* Created : 2021.12.11
* Updated : 2021.12.11
* Author : U.S.Jung
*/
public class SmartPhone extends Phone {
    void sendMessage(String str){
        super.sendMessage();
        System.out.println("3. 몇 글자이던 입력 가능합니다.");
    }

    void sendMessage(int i){
        System.out.println("2. 몇 글자이던 입력가능합니다.");
    }
    // Overriding
    void sendMessage(){
        System.out.println("1. 몇 글자이던 입력 가능합니다.");
    }
}
