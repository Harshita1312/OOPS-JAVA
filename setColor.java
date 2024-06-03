/*3. Aim of the program -Implement a GUI application which consists of one List Box and
one button. The list box will have four different color names. When the user will select
a color from the list box and click on the button, the panel color will be changed to
that color.
Input: Select any color from the list box
Output: Panel background color will be changed accordingly
*/
package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class setColor{
	public static void main(String args[]){
		xyz obj = new xyz();
	}
}

class xyz extends JFrame
{
	String colors[] = {"black","blue","red","green"};
	Color colorChoices[] = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN}; // Moved outside constructor
	JButton b;
	JList list;
	JPanel p;
	public xyz()
	{
		p = new JPanel();
		list = new JList(colors);
		p.add(list);
		add(p);

		b = new JButton("click");
		add(b);

		 b.addActionListener(new ActionListener() {
			 @Override
		     public void actionPerformed(ActionEvent e) {
				 int selectedIndex = list.getSelectedIndex();
		         if (selectedIndex >= 0 && selectedIndex < colorChoices.length) {
					 getContentPane().setBackground(colorChoices[selectedIndex]);
		         }
		     }
        });

		setSize(300,400);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}