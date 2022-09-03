import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalc extends JFrame {
	static JLabel label;
	static JLabel info;
	double result = 0;
	String math = "";
	double num = 0;
	String tostring = "";
	public MyCalc() {
		setTitle("공학용 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container MyCon = getContentPane();
		MyCon.setLayout(new BorderLayout(5, 5));
		
		UpPanel UP = new UpPanel();
		MyCon.add(UP, BorderLayout.EAST);
		DownPanel DP = new DownPanel();
		MyCon.add(DP, BorderLayout.SOUTH);
		
		setSize(350, 600);
		setVisible(true);
	}
	class UpPanel extends JPanel {
		public UpPanel() {
			setLayout(new GridLayout(3, 1));;
			info = new JLabel("");
			label = new JLabel("0");
			
			add(info);
			add(label);
		}
	}
	
	class DownPanel extends JPanel{
		public DownPanel() {
			JButton[] bt = new JButton[35];
			setLayout(new GridLayout(7, 5, 5, 5));
			
				bt[0] = new JButton("(");
                bt[1] = new JButton(")");
                bt[2] = new JButton("**2");
                bt[3] = new JButton("***3");
                bt[4] = new JButton("||");

                bt[5] = new JButton("1/x");
                bt[6] = new JButton("√");
                bt[7] = new JButton("e");
                bt[8] = new JButton("ln");
                bt[9] = new JButton("log");

                bt[10] = new JButton("x!");
                bt[11] = new JButton("sin");
                bt[12] = new JButton("cos");
                bt[13] = new JButton("tan");
                bt[14] = new JButton("PI");

                bt[15] = new JButton("AC");
                bt[16] = new JButton("<-");
                bt[17] = new JButton("7");
                bt[18] = new JButton("8");
                bt[19] = new JButton("9");

                bt[20] = new JButton("+/-");
                bt[21] = new JButton("%");
                bt[22] = new JButton("4");
                bt[23] = new JButton("5");
                bt[24] = new JButton("6");

                bt[25] = new JButton("+");
                bt[26] = new JButton("-");
                bt[27] = new JButton("1");
                bt[28] = new JButton("2");
                bt[29] = new JButton("3");

                bt[30] = new JButton("/");
                bt[31] = new JButton("*");
                bt[32] = new JButton(".");
                bt[33] = new JButton("0");
                bt[34] = new JButton("=");
			
			for(int i = 0; i < 35; i++) {
				bt[i].setPreferredSize(new Dimension(0, 65));
				if(16<i && i<30 && i%5==1 && i%5==2) {
					bt[i].addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							JButton b = (JButton)e.getSource();
							if(label.getText() == "0") {
								label.setText("");
							}
							String labeltext = label.getText();
							String text = b.getText();
							String newtext = labeltext + text;
							int n = newtext.length();
							if(n <= 10) {
								label.setText(newtext);
							}
							if(info.getText().contains("=") == true) {
								info.setText("");
								label.setText(b.getText());
								result = 0;
								num = 0;
							}
						}
					});
				}else if(i == 33) {
					bt[i].addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							JButton b = (JButton)e.getSource();
							String labeltext = label.getText();
							String text = b.getText();
							String newtext = labeltext + text;
							if(labeltext == "0") {
								label.setText("0");
							}else {
								label.setText(newtext);
							}
							
						}
					});
				}else if(i == 34) {
					bt[i].addActionListener(new Result());
				}else if(i % 5 == 4 || i < 16 || 30 < i) {
					if(i == 15) {
							bt[i].addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								int n = label.getText().length();
								if(n >= 0) {
									label.setText("0");
									info.setText("");
								}
								result = 0;
							}
						});
					}else if(i == 16) {
						bt[i].addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								int n = label.getText().length();
								if(n > 0) {
									setBackSpace(getBackSpace().substring(0, getBackSpace().length() - 1));
								}
								if(label.getText() == "") {
									label.setText("0");
								}
							}
						});
					}else if(i == 33) {
						bt[i].addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								JButton b = (JButton)e.getSource();
								String labeltext = label.getText();
								String text = b.getText();
								String newtext = labeltext + text;
								int n = newtext.length();
								if(label.getText().contains(b.getText()) == false && n < 10) {
										label.setText(newtext);
								}
								}
						});
					}else {
						bt[i].addActionListener(new Result());
					}
				}
				add(bt[i]);
			}
		}		
	}
	
	public class Result implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			String labeltext = label.getText();
			String text = b.getText();
			String newtext = labeltext + text;
			int n = newtext.length();
			if(text != "**2") {
				num = Double.parseDouble(label.getText().substring(0, n - 1));				
			}
			if(math == "+") {
				result += num;
				math = "";
			}else if(math == "-") {
				result -= num;
				math = "";
			}else if(math == "*") {
				result *= num;
				math = "";
			}else if(math == "/") {
				result /= num;
				math = "";
			}else if(math == "%"){
				result %= num;
				math = "";
			}
			if(math == "") {
				math = b.getText();			
			}
			if(info.getText() == "" && text != "**2" && text != "=") {
				info.setText(newtext);
				result = num;
				label.setText("0");
			}else if(info.getText() != "" && text != "**2" && text != "="){
				result = (Math.round(result*1000000000)/1000000000.0);
				if(result % 1 == 0) {
					info.setText((int) result + text);
					label.setText("0");
				}else {
					info.setText(result + text);
					label.setText("0");
				}
			}
			if(text == "**2") {
				num = Double.parseDouble(label.getText().substring(0, n - 2));
				math = "";
				if(info.getText() == "") {
					result = (Math.round((Math.pow(num, 2))*1000000000)/1000000000.0);
					if(result % 1 == 0) {
						info.setText("pow(" + (int) num + ")");
						label.setText(String.valueOf((int) result));
					}else {
						info.setText("pow(" + num + ")");
						label.setText(String.valueOf(result));
					}
				}else {
					if(result % 1 == 0) {
						info.setText("pow(" + (int) result + ")");
						result = (Math.round((Math.pow(result, 2))*1000000000)/1000000000.0);
						label.setText(String.valueOf((int) result));
					}else {
						info.setText("pow(" + result + ")");
						result = (Math.round((Math.pow(result, 2))*1000000000)/1000000000.0);
						label.setText(String.valueOf(result));
					}
				}
			}
			if(text == "***3") {
				num = Double.parseDouble(label.getText().substring(0, n - 3));
				math = "";
				if(info.getText() == "") {
					result = (Math.round((Math.pow(num, 3))*1000000000)/1000000000.0);
					if(result % 1 == 0) {
						info.setText("pow(" + (int) num + ")");
						label.setText(String.valueOf((int) result));
					}else {
						info.setText("pow(" + num + ")");
						label.setText(String.valueOf(result));
					}
				}else {
					if(result % 1 == 0) {
						info.setText("pow(" + (int) result + ")");
						result = (Math.round((Math.pow(result, 3))*1000000000)/1000000000.0);
						label.setText(String.valueOf((int) result));
					}else {
						info.setText("pow(" + result + ")");
						result = (Math.round((Math.pow(result, 3))*1000000000)/1000000000.0);
						label.setText(String.valueOf(result));
					}
				}
			}
			if(text == "||"){
				num = Double.parseDouble(label.getText().substring(0, n - 1));
				math = "";
				result = Math.abs(num);
				info.setText("|" + (int)result + "|");
				label.setText(String.valueOf(result));
			}
			if(text == "1/x"){
				num = Double.parseDouble(label.getText().substring(0, n - 1));
				math = "";
				result = 1/(int)num;
				info.setText("1/" + (int)num);
				label.setText(String.valueOf(result));
			}
			if(text == "e"){
				result = 2.71828182846;
				math = "";
				info.setText(""+ result);
				label.setText(""+ result);
			}
			if(text == "ln"){
				num = Double.parseDouble(label.getText().substring(0, n - 1));
				math = "";
				result = Math.log10(num);
				info.setText("ln" + (int)num);
				label.setText(String.valueOf(Math.log10(num)));
			}
			if(text == "log"){
				num = Double.parseDouble(label.getText().substring(0, n - 1));
				math = "";
				result = Math.log(num);
				info.setText("log" + (int)num);
				label.setText(String.valueOf(Math.log(num)));
			}
			if(text == "x!"){
				num = Double.parseDouble(label.getText().substring(0, n - 1));
				result = num-1;
				for(double i= result; i>0; i--){
					result *= i;
				}
				int result1 = (int)result;
				info.setText((int)num + "!");
				label.setText(String.valueOf(result1));
			}
			if(text == "sin"){
				num = Double.parseDouble(label.getText().substring(0, n - 1));
				math = "";
				result = Math.sin(num);
				info.setText("sin" + (int)num);
				label.setText(String.valueOf(result));
			}
			if(text == "cos"){
				num = Double.parseDouble(label.getText().substring(0, n - 1));
				math = "";
				result = Math.cos(num);
				info.setText("cos" + (int)num);
				label.setText(String.valueOf(result));
			}
			if(text == "tan"){
				num = Double.parseDouble(label.getText().substring(0, n - 1));
				math = "";
				result = Math.tan(num);
				info.setText("tan" + (int)num);
				label.setText(String.valueOf(result));
			}
			if(text == "PI"){
				if(info.getText() == "") {
					result = (Math.round((Math.sqrt(num))*1000000000)/1000000000.0);
					if(result % 1 == 0) {
						info.setText("sqrt(" + (int) num + ")");
						label.setText(String.valueOf((int) result));
					}else {
						info.setText("sqrt(" + num + ")");
						label.setText(String.valueOf(result));
					}}
				result = 3.14159265359;
				info.setText(""+result);
				label.setText(String.valueOf(result));
			}
			if(text == "+/-"){
				num = Double.parseDouble(label.getText().substring(0, n - 1));
				math = "";
					if(num>0){
					result = -num;
				}
				else if(num<0){
					result = +num;
				}
				else{
					result = 0;
				}
				info.setText("+/-" + (int)num);
				label.setText(String.valueOf(result));
			}
	
			if(text == "√") {
				math = "";
				if(info.getText() == "") {
					result = (Math.round((Math.sqrt(num))*1000000000)/1000000000.0);
					if(result % 1 == 0) {
						info.setText("sqrt(" + (int) num + ")");
						label.setText(String.valueOf((int) result));
					}else {
						info.setText("sqrt(" + num + ")");
						label.setText(String.valueOf(result));
					}
				}else {
					if(Math.sqrt(result) % 1 == 0) {
						info.setText("sqrt(" + (int) result + ")");
						result = (Math.round((Math.sqrt(result))*1000000000)/1000000000.0);
						label.setText(String.valueOf((int) result));
					}else {
						info.setText("sqrt(" + result + ")");
						result = (Math.round((Math.sqrt(result))*1000000000)/1000000000.0);
						label.setText(String.valueOf(result));
					}
				}
			}
			if(text == "=") {
				math = "";
				if(info.getText() != "" && label.getText() != "" && info.getText().contains(text) == false) {
					if(result % 1 == 0) {
						info.setText(info.getText() + label.getText() + text);
						label.setText(String.valueOf((int) result));
					}else {
						info.setText(info.getText() + label.getText() + text);
						label.setText(String.valueOf(result));
					}
				}
			}
		}
	}
	
	public double Calculator(String ss) {
		return 0;
	}
	private void setBackSpace(String bs) {
		label.setText(bs);
	}
	
	private String getBackSpace() {
		return label.getText();
	}

	public static void main(String[] args) {
		new MyCalc();
	}
}