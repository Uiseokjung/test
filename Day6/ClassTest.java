/*
* Class Test(Day6-1)
* Version : 1.0
* Created : 2021.12.05
* Updated : 2021.12.05
* Author : U.S.Jung
*/
public class ClassTest {
    public static void main(String[] args){
        MyUtils.pl("Java Programming");
        MyUtils.pl(34567);
        Colors.cprintTitle("Class Test");

        //Field Test
        Store st1 = new Store();
        Store st2 = new Store();
        st1.name = "신촌점";
        st2.name = "홍대입구점";
        MyUtils.pl("st1 : " + st1.name);
        MyUtils.pl("st2 : " + st2.name);

        st1.pran_name = "CU";
        st2.pran_name = "GS25";

        MyUtils.pl("st1.pran_name : " + st1.pran_name);
        MyUtils.pl("st2.pran_name : " + st2.pran_name);

        if(1==1){
            Store st3 = new Store();
            st3.pran_name = "GSGS25";
            MyUtils.pl("st2.pran_name(if문내) : " + st2.pran_name);
        }
        MyUtils.pl("st2.pran_name(로컬 객체 종료 후) : " + st2.pran_name);
        //MyUtils.pl("st3 : " + st3.pran_name); //if문 종료후 사라짐
    }
}
class MyUtils{
    public static void pl(String str){
        System.out.println(str);
    }
    public static void pl(int i){
        System.out.println(i);
    }
}

class Store{
    String name;
    static String pran_name;
}