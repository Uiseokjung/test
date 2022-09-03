public class Thread2 implements Runnable {
    String name = "";

    Thread2(){

    }
    Thread2(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    public void run(){
        try{
            for(int i=1; i<11; i++){
            Thread.sleep(1000);
            System.out.println("Thread(" + getName() + ") " + i);
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
