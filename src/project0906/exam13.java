package project0906;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class exam13 extends JFrame{
	exam13(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�޴� �����");
		
		Container c=getContentPane();
		
		setLayout(new FlowLayout());
		JMenuBar menuBar=new JMenuBar();
		
		JMenu menu1=new JMenu("����");
		JMenu menu2=new JMenu("����");
		JMenu menu3=new JMenu("����");
		
		JMenuItem item1=new JMenuItem("������");
		JMenuItem item2=new JMenuItem("����");
		JMenuItem item3=new JMenuItem("�ݱ�");
		
		setJMenuBar(menuBar);
	    menuBar.add(menu1);
	    menuBar.add(menu2);
	    menuBar.add(menu3);
	    
	    JMenuItem edit1=new JMenuItem("����");
	    JMenuItem edit2=new JMenuItem("�߶󳻱�");
	    JMenuItem edit3=new JMenuItem("�ٿ��ֱ�");
	    
	    JMenuItem Color1=new JMenuItem("����");
	    JMenuItem Color2=new JMenuItem("���");
	    JMenuItem Color3=new JMenuItem("�Ķ�");
	    
	    
	    menu1.add(item1);
	    menu1.add(item2);
	    menu1.add(item3);
	    
	    menu2.add(edit1);
	    menu2.add(edit2);
	    menu2.addSeparator();
	    menu2.add(edit3);
	    
	    menu3.add(Color1);
	    menu3.add(Color2);
	    menu3.add(Color3);
	    
	    Color1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.RED);
				
			}
	    	
	    });
	    
	    Color2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
			 c.setBackground(Color.GREEN);
				
			}
	    });
	    	
	    
			Color3.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					c.setBackground(Color.BLUE);
					
				}
				
			});
		
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new exam13();

	}

}
