public class CalcDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOperand(100, 0);
       // c.divide1();
        c.divide2();
    }
}
class Calculator{
    int left, right;

    void setOperand(int left, int right){
        this.left = left;
        this.right = right;
    }
    // 예외처리 안함
    public void divide1(){
        System.out.println(left/right);
    }
    // 예외처리를 함
    public void divide2(){
        try{
            System.out.println(left/right);
            System.out.println("완벽한 입력입니다.");
        }
        catch(ArithmeticException e){
            System.out.println("야 0으로 나누지 말랬지");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
            return;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("오류가 나든 안나든 니가 잘한 건 아니다.");
        }
    }
}
