/*4. Aim of the program -Design a GUI application which consists of three Label named
as Red, Green and blue, three combo boxes which will consist the value from 0 to 255
and one button named as show output. The user will select different values from three
combo boxes. When the user clicks on the button, the panel background will be
changed accordingly as per the value passed in RGB format.
Input: select three color value(0-255) from 3 different combo box.
Output: The panel color will be changed accordingly*/

package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class comboBox{
	public static void main(String args[]){
		setColor obj = new setColor();
	}
}

class setColor extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JComboBox c1,c2,c3;
	JButton b;
	String range[] = new String[256];

	public setColor()
	{
		for(int i=0; i<256; i++){
				range[i]=i+"";
		}

		l1 = new JLabel("Red");
		l1.setForeground(Color.red);
		add(l1);
		c1 = new JComboBox(range);
		add(c1);
		l2 = new JLabel("Green");
		l2.setForeground(Color.green);
		add(l2);
		c2 = new JComboBox(range);
		add(c2);
		l3 = new JLabel("Blue");
		l3.setForeground(Color.blue);
		add(l3);
		c3 = new JComboBox(range);
		add(c3);
		b = new JButton("Show Output");
		add(b);

		b.addActionListener(this);
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);

		setSize(400,200);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a=c1.getSelectedIndex();
		int d=c2.getSelectedIndex();
		int c=c3.getSelectedIndex();
		if(ae.getSource() == b){
			getContentPane().setBackground(new Color(a,d,c));
		}
	}
}