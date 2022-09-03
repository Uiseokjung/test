package main;

import javax.swing.*;
import java.awt.event.*;
import db.MemberMain;
import programmers.*;
import graphics.*;

/**
 * Day14 Project Main Class
 * 
 * <br>
 * Copy not write
 * 
 * @author u.s.jung
 * @version 1.0
 * @since 2022. 1. 9
 */

public class ProjectMain extends JFrame implements ActionListener {
	JComboBox jc;
	String[] menu = new String[10];
	
	JButton b1, b2;
	JTextField[] tf = new JTextField[5];
	
	JLabel l;
	
	ProjectMain(){
		menu[0] = "1. DB Query";
		menu[1] = "2. Subak";
		menu[2] = "3. Find Kim";
		menu[3] = "4. BaseBall";
		menu[4] = "5. 정수의 배열";
		menu[5] = "6. 약수의 개수";
		menu[6] = "7. Collatz";
		menu[7] = "8. Graphics";
		
		jc = new JComboBox(menu);
		jc.setBounds(20, 20, 150, 30);
		b1 = new JButton("Go");
		b1.setBounds(180, 20, 50, 30);

		b2 = new JButton("Exec");
		b2.setBounds(180, 70, 80, 30);

		b1.addActionListener(this);
		b2.addActionListener(this);
		jc.addActionListener(this);

		for(int i=0;i<5;i++) {
			tf[i] = new JTextField();
			tf[i].setBounds(20, 70+i*40, 150, 30);
			add(tf[i]);
		}
		
		l = new JLabel("Result Area");
		l.setBounds(20, 270, 260, 30);
		
		add(jc); add(b1); add(b2); add(l);
		setSize(300, 400);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProjectMain();
		//MemberMain mm = new MemberMain();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jc) {
			int i = jc.getSelectedIndex() + 1;
			System.out.println(i + "번 선택");
			if(i==1) {
				MemberMain mm = new MemberMain();
			
				for(int j=0;j<5;j++) {
					tf[j].setVisible(false);
				}
			}
			else if(i==2) {
				for(int j=1;j<5;j++) {
					tf[j].setVisible(false);
				}
				tf[0].setVisible(true);	
			}
			else if(i==3) {
				for(int j=1;j<5;j++) {
					tf[j].setVisible(true);
				}	
			}
			else if(i==4) {
				for(int j=1;j<5;j++) {
					tf[j].setVisible(false);
				}
				tf[0].setVisible(true);	
			}
			else if(i==5) {
				for(int j=1;j<5;j++) {
					tf[j].setVisible(false);
				}
				tf[0].setText("정수를 입력하시오");
				tf[0].setVisible(true);
			}
			else if(i==6) {
				for(int j=2;j<5;j++) {
					tf[j].setVisible(false);
				}
				tf[0].setText("최소값을 입력하시오");
				tf[1].setText("최대값을 입력하시오");
				tf[0].setVisible(true);
				tf[1].setVisible(true);
			}
			else if(i==7) {
				for(int j=1;j<5;j++) {
					tf[j].setVisible(false);
				}
				tf[0].setText("1로 만들고 싶은 수를 입력하시오");
				tf[0].setVisible(true);
			}
			else if(i==8) {
				GraphicsEx ge = new GraphicsEx();
			}
				
		}
		else if(e.getSource() == b2) {
			int i = jc.getSelectedIndex() + 1;
			if(i==2) {
				Subak sb = new Subak();
				l.setText(sb.subak(Integer.parseInt(tf[0].getText())));
			}
			else if(i==3) {
				String[] seoul = new String[5];
				for(int j=0; j<seoul.length ; j++) {
					seoul[j] = tf[j].getText();
				}
				FindKim k = new FindKim();
				l.setText(k.findKim(seoul));
			}
			else if(i==4) {
				BaseBall bb = new BaseBall(Integer.parseInt(tf[0].getText()));
				bb.run();
			}
			else if(i==5) {
				Arange ar = new Arange();
				long result = ar.solution(Long.parseLong(tf[0].getText()));
				l.setText(Long.toString(result));
			}
			else if(i==6) {
				int left = Integer.parseInt(tf[0].getText());
				int right = Integer.parseInt(tf[1].getText());
				Modulo m = new Modulo();
				int result = m.solution(left, right);
				l.setText(Integer.toString(result));	
			}
			else if(i==7) {
				int num = Integer.parseInt(tf[0].getText());
				Collatz cl = new Collatz();
				int result = cl.solution(num);
				l.setText(Integer.toString(result));
			}
		}
	}
	
	
}
