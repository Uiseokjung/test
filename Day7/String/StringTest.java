/*
* String Class Example
* Version : 1.0
* Created : 2021.12.11
* Updated : 2021.12.11
* Author : U.S.Jung
*/
import java.util.*;
public class StringTest {
    public static void main(String[] args) {
        // 0. String은 클래스형
        String ex1 = "abcdef";
        String ex2 = "abcdef";
        if(ex1 == ex2){
            System.out.println("String ex1 == ex2 : " + (ex1 == ex2));
        }
        else{
            System.out.println("String ex1 == ex2 : " + (ex1 == ex2));

        }// String에 값을 줄 때 첫번째 값은 같음. 변경할 이유가 없다고 생각하기 때문

        String ex3 = new String("abc");
        String ex4 = new String("abc");
        if(ex3 == ex4){
            System.out.println("String ex3 == ex4 : " + (ex3 == ex4));
        }
        else{
            System.out.println("String ex3 == ex4 : " + (ex3 == ex4));

        }// String a = new String(); 은 첫번째 값부터 다름.

        // 1. length()
        String str1 = "dajclkasjdadsc";
        String str2 = "한글은요?";
        p("문자열의 길이 : " + str1.length() + ", " + str2.length());

        // 2. charAt()
        String str3 = "Java Study";
        p("" + str3.charAt(3));

        // 3. equals(), equalsIgnoreCase()
        String str4 = new String("AAA");
        String str5 = new String("AAA");
        String str6 = new String("AaA");
        p("equals() : " + (str4 == str5) + ", " + str4.equals(str5) + ", " + str4.equalsIgnoreCase(str6));

        // 4. replace()
        String str7 = "Heaven Helps";
        String str8 = "Helps";
        String str9 = str7.replace(str8, "            !!!!");
        String str10 = str7.replace("e", "3764278364");
        p("replace() : " + str9 + ", " + str10);
        
        // 5. substring()
        String str11 = str7.substring(1); // 시작인덱스만 주면 끝까지
        p("substring() : " + str11);

        // 6. trim()
        String str12 = "                    Winter                 ".trim();
        p("trim() : " + str12);

        // 7. split()
        String[] str13 = str7.split("[e ]"); // [] 안에있는 것만 취급, e 또는 space로 나누는 regexp
        for(int i=0; i<str13.length ; i++){
            p(str13[i]);
        }

        String[] str14 = str7.split(" ");
        for(int i=0; i<str14.length ; i++){
            p(str14[i]);
        }

        // 8. matches()
        String str15 = "3128314-4134134-314132";
        boolean b = str15.matches("[0-9]{7}-[0-9]{7}-[0-9]{6}"); /* []안에는 문자열의 숫자 범위, {}안에는 숫자 개수
        영어 [A-Za-z], 한글[가-힣]까지      ^은 반대*/
        p("matches() : " + b);
    
        // 9. indexOf()
        p("indexOf() : " + "usjung".indexOf("u"));

        String num = getPhoneNum();
        p("고객님의 전화번호는 " + num + "입니다 맞으십니까?");
    }

    public static void p(String s){
        System.out.println(s);
    }

    public static String getPhoneNum(){
        // 전화번호를 입력받는다.
        // 숫자와 - 포함하여 10자리-13자리인지 check
        // check 실패시에는 계속 입력을 받는다.
        // 전화번호의 숫자만 뒷 4자리를 ****로 하고 return 
        Scanner sc = new Scanner(System.in);
        String pN = "";
        while(true){
            p("전화번호를 입력하세요 : ");
            pN = sc.next();
            if(9<pN.length() && pN.length()<14)//pN.matches("[0-9-]{10,13}")
            {
            break;
        }
        }
        pN = pN.replace("-","");
        //String endNum = pN.substring(pN.length()-4);
          //  pN = pN.replace(endNum,"****");
        pN = pN.substring(0,pN.length()-4);
        pN = pN + "****";
        return pN;
    }
}
