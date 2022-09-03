public class InterMain {
    public static void main(String[] args) {
        MyClass1 mc = new MyClass1();
        mc.aaa = 50; // 클래스에서 재정의한 변수는 수정 불가
        System.out.println(mc.aaa);
    }
}
