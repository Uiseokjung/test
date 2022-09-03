

import javax.swing.*;
import java.awt.*;

public class LayoutTest extends JFrame {
	
	LayoutTest(){
		// border layout
		JButton b1 = new JButton("NORTH");
		JButton b2 = new JButton("SOUTH");
		JButton b3 = new JButton("EAST");
		JButton b4 = new JButton("WEST");
		JButton b5 = new JButton("CENTER");
		
		//add(b1, BorderLayout.NORTH);
		//add(b2, BorderLayout.SOUTH);
		//add(b3, BorderLayout.EAST);
		//add(b4, BorderLayout.WEST);
		//add(b5, BorderLayout.CENTER);
		
		// Grid Layout
		JButton b11 = new JButton("A");
		JButton b12 = new JButton("B");
		JButton b13 = new JButton("C");
		JButton b14 = new JButton("D");
		JButton b15 = new JButton("E");
		JButton b16 = new JButton("F");
		JButton b17 = new JButton("G");
		JButton b18 = new JButton("H");
		
		//add(b11);add(b12);add(b13);add(b14);
		//add(b15);add(b16);add(b17);add(b18);
		//setLayout(new GridLayout(2,4));
		
		JButton[] bt = new JButton[100];
		for(int i=0; i<bt.length; i++) {
			bt[i] = new JButton("BT:" + i);
			add(bt[i]);
		}
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		setSize(400, 800);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LayoutTest();
	}

}
