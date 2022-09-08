package project0906;

import java.awt.*;

import javax.swing.*;

public class exam08 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("텍스트 실습");
			setLayout(new FlowLayout());
			
			JTextField txt1=new JTextField(10);
			add(txt1);
			
			JTextArea txt2=new JTextArea(5,10);
			add(txt2);
			add(new JScrollPane(txt2));
			
			JPasswordField txt3=new JPasswordField(10);
			add(txt3);
			
			setSize(200,200);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		new MyGUI();

	}

}
