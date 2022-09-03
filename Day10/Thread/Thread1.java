public class Thread1 extends Thread {
    Thread1(){}

    Thread1(String name){
        setName(name);
    }
    public void run(){
        // 10초동안 1초마다 스레드 이름과 현재 경과초를 출력
        try{
            for(int i=1; i<11; i++){
            sleep(1000);
            System.out.println("Thread(" + getName() + ") " + i);
            }
        } 
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
