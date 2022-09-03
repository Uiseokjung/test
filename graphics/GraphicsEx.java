package graphics;

import javax.swing.*;
import java.awt.*;

public class GraphicsEx extends JFrame {
	
	
	public GraphicsEx() {
		Dimension dim = new Dimension(800, 600);
		DrawPanel pan = new DrawPanel();
		
		add(pan);
		pack();
		setLocation(200,400);
		setSize(dim);
		//setPrefered(dim);
		setVisible(true);
	}
	/**
	 * 
	 * param means user input data from terminal
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsEx();
	}

}
class DrawPanel extends JPanel{
	public void paint(Graphics g) {
		super.paint(g);
		g.drawRect(50,  50, 100, 150);
		g.drawOval(170,170,70,70);
		g.drawLine(300, 50, 400, 100);
		g.drawArc(200, 300, 150, 150, 90, 120);
		g.setFont(new Font("Times new Roman", Font.ITALIC, 30));
		g.drawString("My Drawing", 400, 50);
		Image img = Toolkit.getDefaultToolkit().getImage("src/graphics/java.png");
		g.drawImage(img, 500,50,this);
		
		//polygon
		int[] x_points = {50, 70, 80, 70, 50, 40};
		int[] y_points = {250, 250, 260, 270, 270, 260};
		
		g.setColor(Color.blue);
		g.drawPolygon(x_points, y_points, 6);
		
		//round rectangle
		g.setColor(new Color(100,200,50));
		g.drawRoundRect(400, 230, 100, 150, 20, 20);
		
		//fill
		g.setColor(Color.cyan);
		g.fillRect(400,400,40,40);
	}
}
