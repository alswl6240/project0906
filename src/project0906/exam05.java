package project0906;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class exam05 {
   static class MyGUI extends JFrame{
	   MyGUI(){
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setTitle("Card layout 실습");
		   setLayout(new CardLayout(10,10));
		   JButton btn1= new JButton("버튼1");
		   JButton btn2= new JButton("버튼2");
		   JButton btn3= new JButton("버튼3");
		   JButton btn4= new JButton("버튼4");
		   add(btn1); 
		   add(btn2);
		   add(btn3);
		   add(btn4);
		   setSize(256,256);
		   setVisible(true);
	   }
   }
	public static void main(String[] args) {
	new MyGUI();

	}

}
