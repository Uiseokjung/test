package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyFileInputOuput {
    public static void main(String[] args) {
        // 1. input1.txt를 읽고 termianl에 출력
        // 2. 읽은 거슬 ouput2.txt에 출력(write)
        try{
            FileInputStream is = new FileInputStream("C:/Users/82105/OneDrive/바탕 화면/메가IT/Day11/input1.txt");
            //FileInputStreamReader fisr = new FileInputStreamReader(~~); // Reader로 넣어주면 char 형태로 변환됨.
            FileOutputStream os = new FileOutputStream("C:/Users/82105/OneDrive/바탕 화면/메가IT/Day11/output2.txt");

            int i = is.read();
            while(i!=-1){
                System.out.print((char)i);
                os.write(i);// os.write((char)i);
                i = is.read();
            }
            
            is.close();
            os.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
