package Day9.Inter1;

public class MyInterfaceMain {
    public static void main(String[] args) {
        MyInterfaceClass mc = new MyInterfaceClass();
        mc.printGreeting();
        mc.printGreetingD();
        mc.printGreetings();
        MyInterface.printGreetings();

        MyInterface mi = new MyInterfaceClass();
        mi.printGreetingD(); // Changed가 왜 출력되는지 이해 필요
    }
}
