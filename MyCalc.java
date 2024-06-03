package Swing;

import javax.swing.*;
import java.awt.FlowLayout;  //it centre alines
import java.awt.event.*;

class MyCalc
{
	public static void main(String args[])
	{
		operations obj = new operations();
	}
}
class operations extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	public operations()
	{
		l1 = new JLabel("1st no: ");
		add(l1);
		t1 = new JTextField(20);
		add(t1);
		l2 = new JLabel("2nd no: ");
		add(l2);
		t2 = new JTextField(20);
		add(t2);
		b1 = new JButton("ADD");
		add(b1);
		b2 = new JButton("SUBSTRACT");
		add(b2);
		b3 = new JButton("MULTIPLY");
		add(b3);
		b4 = new JButton("RESET");
		add(b4);
		l3 = new JLabel("Result");
		add(l3);
		t3 = new JTextField(10);
		add(t3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		setVisible(true);
		setLayout(new FlowLayout());
		setSize(300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("CALCULATOR");
	}
	public void actionPerformed(ActionEvent ae)
	{
		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t2.getText());
		int value;

		if(ae.getSource() == b1){
			value = num1+num2;
			t3.setText(value+"");
		}
		else if(ae.getSource() == b2){
			value = num1-num2;
			t3.setText(value+"");
	    }
	    else if(ae.getSource() == b3){
			value = num1*num2;
			t3.setText(value+"");
		}
		else{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
}