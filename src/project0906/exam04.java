package project0906;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class exam04 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GridLayout �ǽ�");
			setLayout(new GridLayout(3,3,10,10));
			JButton btn1=new JButton("��ư1");
			JButton btn2=new JButton("��ư2");
			JButton btn3=new JButton("��ư3");
			JButton btn4=new JButton("��ư4");
			JButton btn5=new JButton("��ư5");
			JButton btn6=new JButton("��ư6");
			JButton btn7=new JButton("��ư7");
			JButton btn8=new JButton("��ư8");
			JButton btn9=new JButton("��ư9");
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
