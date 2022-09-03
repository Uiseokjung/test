public interface MyInterface {
    default void d_method() {
        System.out.println("MyInterface : d_method");
    }
    static void s_method() {
        System.out.println("MyInterface : s_method");
    }
}
