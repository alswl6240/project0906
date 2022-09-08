package project0906;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class exam02 {
    static class MyGUI extends JFrame{
    	MyGUI(){
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		setTitle("GUI 프로그램");
    		setLayout(new FlowLayout());
    		JButton btn1=new JButton("버튼1");
    		add(btn1);
    		JButton btn2=new JButton("버튼2");
    		JButton btn3=new JButton("버튼3");
    		JButton btn4=new JButton("버튼4");
    		JButton btn5=new JButton("버튼5");
    		JTextField txt1=new JTextField(20);
    		JCheckBox ch1 =new JCheckBox("a");
    		add(txt1);
    		add(btn2);
    		add(btn3);
    		add(btn4);
    		add(btn5);
    		add(ch1);
    		setSize(256,256);
    		setVisible(true);
    	}
    }
	public static void main(String[] args) {
		new MyGUI();
		

	}

}
