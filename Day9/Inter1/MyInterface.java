package Day9.Inter1;

public interface MyInterface{
    int interface_version = 1;

    void printGreeting();

    default void printGreetingD(){
        System.out.println("Hi in default");
    }

    static void printGreetings(){
        System.out.println("Hi in static");
    }
}