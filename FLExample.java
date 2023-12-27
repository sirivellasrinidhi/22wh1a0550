package cse22550;
import java.awt.*;
import java.awt.event.*;
public class FLExample {
	FLExample(){
		Frame frame=new Frame("Flow Layout Example");
		Panel pa =new Panel();
		Button b1=new Button("India");
		Button b2=new Button("Pakistan");
		Button b3=new Button("Japan");
		Button b4=new Button("China");
		Button b5=new Button("Countries");
		frame.add(pa);
		pa.add(b1);
		pa.add(b2);
		pa.add(b3);
		pa.add(b4);
		pa.add(b5);
		pa.setLayout(new FlowLayout());
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		}
	public static void main(String args[]) {
		new FLExample();
	}
}

