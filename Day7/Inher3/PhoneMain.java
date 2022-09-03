/*
* Overriding Example
* Version : 1.0
* Created : 2021.12.11
* Updated : 2021.12.11
* Author : U.S.Jung
*/
public class PhoneMain {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.sendMessage();
        sp.sendMessage(1);
        sp.sendMessage("1");
    }
}
