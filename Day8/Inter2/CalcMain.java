public class CalcMain {
 public static void main(String[] args) {
     CalcDummy c = new CalcDummy();
     c.setOperand(10, 21, 30);
     System.out.println(c.sum() + " " + c.avg());
 }   
}

class CalcDummy implements CalcInterface{
    int left, right, center;
    public void setOperand(int first, int second, int third){
        this.left = first;
        this.right = second;
        this.center = third;
    }
    public int sum(){
        return (left + right + center);
    }
    public double avg(){
        return (sum()/3);
    }
}
