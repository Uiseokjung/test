package Day9.Except1;

public class ExceptionTest {
    public static void main(String[] args) {
        Exception1 ex1 = new Exception1();
        try{
            ex1.alwaysAngry(1);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Exception1{
    public void alwaysAngry(int i) throws Exception{
        if(i==1){
            throw new Exception("Always Angry Excpeiton");
        }
        else{

        }
    }
}
