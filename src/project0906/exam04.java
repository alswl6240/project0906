package project0906;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class exam04 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GridLayout 실습");
			setLayout(new GridLayout(3,3,10,10));
			JButton btn1=new JButton("버튼1");
			JButton btn2=new JButton("버튼2");
			JButton btn3=new JButton("버튼3");
			JButton btn4=new JButton("버튼4");
			JButton btn5=new JButton("버튼5");
			JButton btn6=new JButton("버튼6");
			JButton btn7=new JButton("버튼7");
			JButton btn8=new JButton("버튼8");
			JButton btn9=new JButton("버튼9");
			add(btn1);
			add(btn2);
			add(btn3);
			add(btn4);
			add(btn5);
			add(btn6);
			add(btn7);
			add(btn8);
			add(btn9);
			setSize(256,256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();

	}

}
