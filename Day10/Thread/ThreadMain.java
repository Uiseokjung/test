public class ThreadMain {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1("T1");
        Thread2 th2 = new Thread2("T2");

        th1.start();
        Thread th3 = new Thread(th2);
        th3.start();
        for(int i=0;i<10;i++){
            System.out.println(33333);
        }
    }
}
