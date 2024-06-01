/* 1. Aim of the program -Design a registration form using Swing with following components
on it – Label, Textbox, Text area, Checkbox, Radio button and Button, Image.  */

package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class regForm
{
	public static void main(String args[])
	{
		design obj = new design();
	}
}

class design extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3;
	JButton b1;
	JRadioButton r1,r2,r3;
	JCheckBox c1,c2,c3;

	public design()
	{
		l1 = new JLabel("REGISTRATION FORM");
		add(l1);
		l2 = new JLabel("Name: ");
		add(l2);
		t1 = new JTextField(10);
		add(t1);
		l3 = new JLabel("Select Gender: ");
		add(l3);
		r1 = new JRadioButton("Male");
		add(r1);
		r2 = new JRadioButton("Female");
		add(r2);
		r3 = new JRadioButton("Others");
		add(r3);
		TextArea ta = new TextArea("Address");
		ta.setBounds(50,50,5,5);
		add(ta);
		l4 = new JLabel("Select Hobbies: ");
		add(l4);
		c1 = new JCheckBox("Dancing");
		add(c1);
		c2 = new JCheckBox("Painting");
		add(c2);
		b1= new JButton("SUBMIT");
		add(b1);
		t2 = new JTextField(20);
		add(t2);

		ImageIcon image = new ImageIcon("ok.png");
		l5 = new JLabel("status");
		l5.setIcon(image);
		add(l5);

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);

		b1.addActionListener(this);

		setVisible(true);
		setLayout(new FlowLayout());
		setSize(700,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str = t1.getText();
		if(r1.isSelected()){
			str = "Hello Mr."+str;
		}
		else if(r2.isSelected()){
			str = "Hello Mrs."+str;
		}
		else{
			str = "Hello "+str;
		}
		if(c1.isSelected()){
			str = str + " dancer";
		}
		if(c2.isSelected()){
			str = str + " painter";
		}
		t2.setText(str);
	}
}