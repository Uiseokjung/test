

// Swing Component ����
// https://web.mit.edu/6.005/www/sp14/psets/ps4/java-6-tutorial/components.html

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextAreaEx extends JFrame implements ActionListener{
	
	JLabel l1, l2;
	JTextArea ta;
	JButton b;
	
	JTextAreaEx(){
		l1 = new JLabel("�ܾ� :");
		l1.setBounds(50, 35, 100, 30);
		
		l2 = new JLabel("���� :");
		l2.setBounds(150, 35, 100, 30);
		
		ta = new JTextArea();
		ta.setBounds(50, 75, 200, 200);
		ta.setLineWrap(true);
		
		b = new JButton("Count");
		b.setBounds(50, 300, 100, 30);
		b.addActionListener(this);
		
		add(l1);add(l2);add(ta);add(b);
		
		setSize(300, 400);
		setLayout(null);
		setTitle("Word Count Master");
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Pressed");
		String str = ta.getText();
		String[] word1 = str.split(" ");
		String[] word2 = str.split("\\s");
		l1.setText("�ܾ� : " + word1.length);
		l2.setText("���� : " + str.length());		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextAreaEx();
	}

}
