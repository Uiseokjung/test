/*
* MethodTest(Day6-2)
* Version : 1.0
* Created : 2021.12.05
* Updated : 2021.12.05
* Author : U.S.Jung
*/
public class MethodTest {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.add(3,5);
        c.add(3.0, 5.0);
        c.add(1,2,10);
        int res = c.add(100);
        System.out.println("add return : " + res);
        
        int[] arr = {1,2,3,5,100};
        c.add(arr);
        
        String[] str = {"Like a ","Bridge ","Over ","Troubled","Water"};
        String res_str = c.add(str);
        System.out.println("add str[] : " + res_str);

    }
}

class Calc{
    //int a, b의 합을 구한다.
    public void add(int a, int b){
        System.out.println("add int : " + (a+b));
    }

    //double a, b의 합을 구한다.
    public void add(double a, double b){
        System.out.println("add double : " + (a+b));
    }

     //int a, b의 합을 구한다.
     public void add(int a, int b, int c){
        System.out.println("add 3 int : " + (a+b+c));
    }
    public int add(int i){
        return i+100000;
    }

    //입력값의 개수가 정해져 있지 않을 때
    public void add(int[] i){
        int sum = 0;
        for(int k = 0; k<i.length; k++){
            sum += i[k];
        }
        System.out.println("add sum : " + sum);
    }
    
    //String의 배열을 입력받아 다 붙여서 리턴하는 함수 add를 만드시오.
    public String add(String[] str){
        /*String st = "";
        for(int i=0; i<str.length; i++){
            st += str[i];
        }
        return st;
        */
        String res_str2 = "";
        for(String j : str){
            res_str2 += j;
        }
        return res_str2;
    }
}
