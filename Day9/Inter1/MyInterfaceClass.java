package Day9.Inter1;

public class MyInterfaceClass implements MyInterface {
    public void printGreeting(){
        //System.out.println(super.interface_version);
        System.out.println("Hi");
    }   

    //Interface의 default method overriding
    public void printGreetingD(){
        System.out.println("Hi in default(Changed)");
    }

    public void printGreetings(){
        System.out.println("Hi in static(Changed)");
    }
}
