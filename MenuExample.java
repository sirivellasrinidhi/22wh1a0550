package cse22550;
import java.awt.*;
import java.awt.event.*;
class MenuExample  
{  
     MenuExample(){  
         Frame f= new Frame("BVRITH");  
         MenuBar mb=new MenuBar();  
         Menu menu1=new Menu("CSE"); 
         Menu submenu1=new Menu("I");
         Menu submenu2=new Menu("II");
         Menu submenu3=new Menu("III");
         Menu submenu4=new Menu("IV");
         MenuItem i5=new MenuItem("A"); 
         MenuItem i6=new MenuItem("B");
         MenuItem i7=new MenuItem("C");
         menu1.add(submenu1);
         menu1.add(submenu2);  
         menu1.add(submenu3);
         menu1.add(submenu4);
         submenu2.add(i5);  
         submenu2.add(i6); 
         submenu2.add(i7); 
         mb.add(menu1);  
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true); 
         f.addWindowListener(new WindowAdapter(){
        	 public void windowClosing(WindowEvent we) {
        		 System.exit(0);
        	 }
         });
}  
public static void main(String args[])  {  
new MenuExample();  
}  
}  
