package project0906;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class exam03 { 
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("border layout �ǽ�");
			setLayout(new BorderLayout(10,10));
			JButton btn1=new JButton("��ư1");
			add(btn1,BorderLayout.NORTH);
			JButton btn2=new JButton("��ư2");
			add(btn2,BorderLayout.WEST);
			JButton btn3=new JButton("��ư3");
			add(btn3,BorderLayout.CENTER);
			JButton btn4=new JButton("��ư4");
			add(btn4,BorderLayout.EAST);
			JButton btn5=new JButton("��ư5");
			add(btn5,BorderLayout.SOUTH);
			setSize(256,256);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		new MyGUI();

	}

}
