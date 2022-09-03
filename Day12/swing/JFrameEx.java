
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameEx extends JFrame {
	int count = 0;
	
	JFrameEx(){
		// component setting
		JButton b1 = new JButton("Click");
		b1.setBounds(100, 150, 150, 30);
		
		JTextField tf1 = new JTextField("Blank");
		tf1.setBounds(300, 150, 150, 30);
		
		JLabel l1 = new JLabel("Blank");
		l1.setBounds(300, 200, 150, 30);
		
		// add action listener
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count += 1;
				System.out.println(count);
				tf1.setText("���� ���� ȸ�� : " + count);
				l1.setText("���� ���� ȸ�� : " + count);
			}
		});
		
		add(b1);add(tf1);add(l1);
		setSize(600, 400);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEx();
	}

}
