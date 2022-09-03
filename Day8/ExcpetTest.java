public class ExcpetTest {
    public static void main(String[] args) {
        try{
            dontcall(20000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void dontcall(int i) throws Exception{
        if(i>10000){
            throw new MyException("큰 수로 호출하지 말라고 했지");
    }
    }// Exception을 던지기 때문에 try문으로 감싸주어야한다

}

class MyException extends Exception{
    MyException(String msg){
        super(msg);
        System.out.println("시스템적인 중대한 예외가 발생하였습니다.");
    }
}
