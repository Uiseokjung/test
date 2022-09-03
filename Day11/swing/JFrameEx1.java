package swing;

import javax.swing.JFrame;
import javax.swing.JButton;
public class JFrameEx1 {
    public static void main(String[] args) {
        JFrame f1 = new JFrame();

        JButton b1 = new JButton("누르지마시오.");
        b1.setBounds(100,200,300,50);

        f1.add(b1);

        f1.setSize(600, 400);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}
