package swing;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;

class mouseDemo
{
	public static void main(String args[])
	{
		abc obj = new abc();
	}
}
class abc extends JFrame
{
	public abc()
	{
		addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent me)
			{
				int x = me.getX();
				int y = me.getY();
				System.out.println(x+" , "+y);
			}
		});

		setLayout(new FlowLayout());
		setSize(300,450);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("!! MOUSE POINTING !!");

		ImageIcon image = new ImageIcon("st1.png");
	}
}