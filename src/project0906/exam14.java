package project0906;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class exam14 extends JFrame{
	exam14(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���� �ǽ�");
		setLayout(new FlowLayout());
		
		JToolBar toolBar=new JToolBar();
		
		ImageIcon img1=new ImageIcon("images/exit.png");
		
		JButton btn1=new JButton("������");
		JButton btn2=new JButton("����");
		JButton btn3=new JButton(img1);
		
		add(toolBar,BorderLayout.NORTH);
		toolBar.add(btn1);
		toolBar.add(btn2);
		toolBar.add(btn3);
		
		JLabel lbl1=new JLabel(" �� ���ڰ� �ٲ�ϴ�.");
		add(lbl1);
		
		btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl1.setText("[������]�� �����߽��ϴ�.");
				
			}
			
		});
		btn2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl1.setText("[����]�� �����߽��ϴ�.");
				
			}
			
		});
		btn3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
	
	});

		
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new exam14();

	}

}
