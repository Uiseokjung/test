package stream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;  
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.net.URL;

public class MyFileInputStream {
    public static void main(String[] args) {
        System.out.println("File Input Test");

        /* 1. File Input Stream */
        System.out.println("1. File Input Stream");
        try{
            FileInputStream is = new FileInputStream("C:/Users/82105/OneDrive/바탕 화면/메가IT/Day11/Input1.txt");
            int i = is.read();
            //System.out.println("readchar : " + i);
            //i = is.read();
            //System.out.println("readchar : " + i);

            while(i!=-1){
                System.out.print((char)i);
                i = is.read();
            }
            is.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        /* 2. FileReader Stream */
        System.out.println("\n\n2.FileReader");
        try{
            FileReader r = new FileReader("C:/Users/82105/OneDrive/바탕 화면/메가IT/Day11/Input2.txt");
            int i = r.read();
            while(i!=-1){
                System.out.print((char)i);
                i = r.read();
            }
            r.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        /* 3. Scanner */
        System.out.println("\n\n3.Scanner");
        File f = new File("C:/Users/82105/OneDrive/바탕 화면/메가IT/Day11/Input1.txt");
        try{
            Scanner sc = new Scanner(f); //System.in -> 
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        /* 4. Image file */
        String filename = "C:/Users/82105/OneDrive/바탕 화면/메가IT/Day11/MyPicture.jpg";
        try{
            InputStream is = new FileInputStream(filename);
            System.out.println(is.available());
            byte[] buffer = new byte[is.available()];

            int j = is.read(buffer); // j = 읽은 바이트 수
            // int j = is.read(); // j = 읽은 글자 자체

            int i = 0;
            for(byte b : buffer){
                if(i%10 == 0){
                    System.out.println();
                }
                System.out.printf("%02x", b);
                i++;

            }
            System.out.println("\nj : " + j);
            System.out.println("total bytes : " + i);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        /* 5. URL로부터 HTML */
        String web = "https://music.bugs.co.kr";
        
        try{
            URL url = new URL(web);

            InputStream is = url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            br.lines().forEach(System.out::println);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        /* 6. Multi File Read like 1 File */
        String filename1 = "C:/Users/82105/OneDrive/바탕 화면/메가IT/Day11/input1.txt";
        String filename2 = "C:/Users/82105/OneDrive/바탕 화면/메가IT/Day11/input3.txt";
        String filename3 = "C:/Users/82105/OneDrive/바탕 화면/메가IT/Day11/input4.txt";

        try{
            InputStream is1 = new FileInputStream(filename1);
            InputStream is2 = new FileInputStream(filename2);
            InputStream is3 = new FileInputStream(filename3);
            SequenceInputStream sis1 = new SequenceInputStream(is1, is2);
            SequenceInputStream sis2 = new SequenceInputStream(sis1, is3);

            int b = sis2.read();

            while(b!=-1){
                System.out.print((char)b);
                b = sis2.read();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    }

