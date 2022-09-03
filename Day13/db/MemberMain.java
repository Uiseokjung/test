package db;

import javax.swing.*;
import java.awt.event.*;

public class MemberMain extends JFrame implements ActionListener {
	JLabel l1, l2, l3;
	JTextField tf1, tf2, tf3;
	JButton b1, b2, b3;
	
	MemberMain(){
		l1 = new JLabel("SEQ");
		l2 = new JLabel("ID");
		l3 = new JLabel("NAME");
		l1.setBounds(20, 20, 100, 30);
		l2.setBounds(20, 60, 100, 30);
		l3.setBounds(20, 100, 100, 30);
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf1.setBounds(150, 20, 100, 30);
		tf2.setBounds(150, 60, 100, 30);
		tf3.setBounds(150, 100, 100, 30);
		
		b1 = new JButton("Insert");
		b2 = new JButton("Update");
		b3 = new JButton("Delete");
		b1.setBounds(20, 180, 80, 30);
		b2.setBounds(110, 180, 80, 30);
		b3.setBounds(200, 180, 80, 30);
		
		add(l1); add(l2); add(l3);
		add(tf1); add(tf2); add(tf3);
		add(b1); add(b2); add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setSize(320, 320);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MemberMain();
	}
	
	public void actionPerformed(ActionEvent e) {
		MemberVO vo = new MemberVO();
		MemberDAO dao = new MemberDAO();
		vo.setMemberSeq(Integer.parseInt(tf1.getText()));
		vo.setMemberId(tf2.getText());
		vo.setMemberName(tf3.getText());
		
		if(e.getSource() == b1) {
			dao.insert(vo);
		}
		else if(e.getSource() == b2){
			dao.update(vo);
		}
		else if(e.getSource() == b3) {
			dao.delete(vo.getMemberSeq());
		}
	}

}
