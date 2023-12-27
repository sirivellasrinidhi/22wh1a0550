package cse22550;
import java.awt.*;
import java.awt.event.*;
public class BLExample {
	BLExample(){
		Frame frame =new Frame("Border Layout Example");
		Panel pa=new Panel();
		Button b1=new Button("India");
		Button b2=new Button("Pakistan");
		Button b3=new Button("Japan");
		Button b4=new Button("China");
		Button b5=new Button("Countries");
		frame.add(pa);
		pa.setLayout(new BorderLayout());
		pa.add(b1,BorderLayout.CENTER);
		pa.add(b2,BorderLayout.SOUTH);
		pa.add(b3,BorderLayout.EAST);
		pa.add(b4,BorderLayout.WEST);
		pa.add(b5,BorderLayout.NORTH);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	public static void main(String args[]) {
		new BLExample();
	}
}
