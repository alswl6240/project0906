package project0906;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class exam06 {
   static class MyGUI extends JFrame{
	

	MyGUI(){
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setTitle("Container �ǽ�");
		   Container c=getContentPane();
		   c.setBackground(Color.YELLOW);
		   setLayout(new FlowLayout());
		   JButton btn1=new JButton("��ư1");
		   btn1.setBackground(Color.BLACK);
		   btn1.setForeground(Color.MAGENTA);
		   c.add(btn1);
		   
		   JButton btn2=new JButton("��ư2");
		   btn2.setFont(new Font("�������",Font.BOLD,30));
		   btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		   btn2.setToolTipText("�� ��ư�� ũ�� ������");
		   c.add(btn2);
		   
		   JButton btn3=new JButton("��ư");
		   btn3.setEnabled(false);
		   c.add(btn3);
		   setSize(256,256);
		   setVisible(true);
	   }
   }
	public static void main(String[] args) {
	  new MyGUI();

	}

}
