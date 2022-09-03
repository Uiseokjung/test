

/*import javax.swing.*;
import java.awt.event.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

public class MovieSearch extends JFrame implements ActionListener {
	JLabel[] l = new JLabel[5];
	JTextField tf;
	JButton b;
	
	MovieSearch() {
		tf = new JTextField("��ȭ�̸��� �Է��ϼ���");
		tf.setBounds(20, 50, 200, 30);
		
		b = new JButton("�˻�");
		b.setBounds(230, 50, 60, 30);
		
		for(int i=0; i<l.length; i++) {
			l[i] = new JLabel("������"+(i+1));
			l[i].setBounds(20, 90+(40*i), 500, 30);
			add(l[i]);
		}
		
		add(tf);add(b);
		b.addActionListener(this);
		
		setTitle("Movie Search");
		setSize(600, 360);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String str = tf.getText();
		l[0].setText(str);
		
		String URL = "http://search.naver.com/search.naver?query=��ȭ+" + str;
		try {
			Document doc = Jsoup.connect(URL).get();
			Elements els = doc.select("p.area_text_box_ell");
			System.out.println(els);
			
			int i = 0;
			for(Element el : els) {
				if(i<5) {
					l[i].setText(el.text());
				}
				i += 1;
			}
		}
		catch(Exception ex) {
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MovieSearch();
	}

}*/
