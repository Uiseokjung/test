package stream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class MyFileOutputStream {
    public static void main(String[] args) {
        //String data = "This building is under construction";
        String data = "한글은? 되는지 안되는지 해보섿";
        try{
            OutputStream os = new FileOutputStream("C:/Users/82105/OneDrive/바탕 화면/메가IT/Day11/output1.txt");
            byte[] databytes = data.getBytes();
            os.write(databytes);
            os.write('\n');
            os.write(databytes[0]);
            os.write('\n');
            os.write(databytes, 4, 10);

            os.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
