package project0906;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class exam15 extends JFrame{
	exam15(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("����");
		
		setLayout(new FlowLayout());
		
		JButton btn1=new JButton("��ư1");
		JButton btn2=new JButton("��ư2");
		JButton btn3=new JButton("��ư3");
		JButton btn4=new JButton("��ư4");
		JButton btn5=new JButton("��ư5");
		JButton btn6=new JButton("��ư6");
		JTextField txt=new JTextField(10);
		
		btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setBackground(Color.RED);
				btn2.setBackground(Color.YELLOW);
				txt.setText("�ؽ�Ʈ �ʵ尡 �ٲ�ϴ�.");
				btn3.setText("��ư3 �ؽ�Ʈ�� ���̷�");
			}
			
		});
		
		
		JLabel lbl=new JLabel("���� :");
		
		JTextArea area=new JTextArea(20,10);
	
		JCheckBox chk1=new JCheckBox("java");
		JCheckBox chk2=new JCheckBox("C++");
		JCheckBox chk3=new JCheckBox("JSP",true);
		
		JRadioButton rdo1=new JRadioButton("��");
		JRadioButton rdo2=new JRadioButton("���");
		JRadioButton rdo3=new JRadioButton("����");
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(lbl);
		add(txt);
		add(area);
		
		add(chk1);
		add(chk2);
		add(chk3);
		
		add(rdo1);
		add(rdo2);
		add(rdo3);
		
		ButtonGroup grp=new ButtonGroup();
		grp.add(rdo1);
		grp.add(rdo2);
		grp.add(rdo3);
		
		
		
		
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new exam15();

	}

}
