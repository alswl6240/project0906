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
		setTitle("툴바 실습");
		setLayout(new FlowLayout());
		
		JToolBar toolBar=new JToolBar();
		
		ImageIcon img1=new ImageIcon("images/exit.png");
		
		JButton btn1=new JButton("새문서");
		JButton btn2=new JButton("열기");
		JButton btn3=new JButton(img1);
		
		add(toolBar,BorderLayout.NORTH);
		toolBar.add(btn1);
		toolBar.add(btn2);
		toolBar.add(btn3);
		
		JLabel lbl1=new JLabel(" 이 글자가 바뀝니다.");
		add(lbl1);
		
		btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl1.setText("[새문서]를 선택했습니다.");
				
			}
			
		});
		btn2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl1.setText("[열기]를 선택했습니다.");
				
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
