import java.util.*;

public class Colors {
    public static String BlACK = "\033[30m";
    public static String RED   = "\033[31m";
    public static String GREEN = "\033[32m";
    public static String YELLOW = "\033[33m";
    public static String BLUE = "\033[34m";
    public static String MAGENTA = "\033[35m";
    public static String CYAN = "\033[36m";
    public static String WHITE = "\033[37m";

    public static String BG_RED = "\033[101m";
    public static String BG_GREEN = "\033[102m";
    public static String END = "\033[0m";

    public static void test(){
        System.out.println(RED + "색깔나옴?" + END);
    }


    public static void color_8(){
        String str = "";
        for(int i =0; i<8; i++){
            str = str + "\033[" + (100 + i) + "m" + "   " + END; 
        }
        System.out.println(str);
    }

    public static void color_256(){
        String str = "";
        for(int i =0; i<256; i++){
            str = str + "\033[48;5;" + i + "m" + " " + END; 
        }
        System.out.println(str);
    }

    public static void color_true(){
        String[] str = new String [4];
        for(int i=0; i<4; i++){
            str[i] = "";
        }

        for(int i=0; i<256; i++){
            str[0] = str[0] +  "\033[48;2;" + i + ";0;0m" + " " + END;
            str[1] = str[1] +  "\033[48;2;0;" + i + ";0m" + " " + END;
            str[2] = str[2] +  "\033[48;2;0;0;" + i + "m" + " " + END;
            str[3] = str[3] +  "\033[48;2;" + i + ";" + i + ";" + i + "m" + " " + END;
        }

        for(int i=0; i<4; i++){
            System.out.println(str[i]);
        }
    }

    public static int cprint(String str){
        Random rd = new Random();
        int rd_i = rd.nextInt(256);
        System.out.println("선택된 색상코드는 " + rd_i + "입니다.");
        System.out.println("\033[38;5;" + rd_i +"m" + str + END);
        return rd_i;
    }

    public static void cprint(String str, int i){
        if(i < 0 || i> 255){
            System.out.println("입력하신 색상이 없습니다.");
            i = 0;
        }
        System.out.println("\033[38;5;" + i +"m" + str + END);

    }
    public static void cprintTitle(String str){
        Random rd = new Random();
        int color = rd.nextInt(256);
        System.out.println("**********************");
        System.out.println("\033[38;5;" + color +"m" + str + END);
        System.out.println("**********************");
    }
}
