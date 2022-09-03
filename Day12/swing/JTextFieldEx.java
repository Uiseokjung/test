

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldEx extends JFrame implements ActionListener{
	Font f1, f2;
	JTextField tf1, tf2, tf3;
	JButton b1, b2, b3;
	
	JTextFieldEx(){
		f1 = new Font("���� ����", Font.PLAIN, 20);
		f2 = new Font("����", Font.PLAIN, 20);
		
		tf1 = new JTextField();
		tf1.setBounds(50, 70, 200, 40);
		tf1.setFont(f1);
		
		tf2 = new JTextField();
		tf2.setBounds(50, 120, 200, 40);
		tf2.setFont(f2);
		
		tf3 = new JTextField("Answer");
		tf3.setBounds(50, 190, 200, 40);
		tf3.setEditable(false);
		tf3.setFont(f1);
		
		b1 = new JButton("+");
		b1.setBounds(30, 270, 70, 50);
		b2 = new JButton("-");
		b2.setBounds(110, 270, 70, 50);
		b3 = new JButton("con");
		b3.setBounds(190, 270, 70, 50);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		add(tf1);add(tf2);add(tf3);
		add(b1);add(b2);add(b3);
		
		setSize(300, 400);
		setLayout(null);
		setVisible(true);		
	}
	
	public void actionPerformed(ActionEvent e) {
		String str1 = tf1.getText();
		String str2 = tf2.getText();
		String res = "";
		int a, b, c;
		
		if(e.getSource() == b1) {
			a = Integer.parseInt(str1);
			b = Integer.parseInt(str2);
			c = a + b;
			res = String.valueOf(c);
		}
		else if(e.getSource() == b2) {
			a = Integer.parseInt(str1);
			b = Integer.parseInt(str2);
			c = a - b;
			res = String.valueOf(c);
		}
		else if(e.getSource() == b3) {
			res = str1 + str2;
		}
	
		tf3.setText(res);
	}
	
	public static void main(String[] args) {
		new JTextFieldEx();
	}
}
