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
		setTitle("제목");
		
		setLayout(new FlowLayout());
		
		JButton btn1=new JButton("버튼1");
		JButton btn2=new JButton("버튼2");
		JButton btn3=new JButton("버튼3");
		JButton btn4=new JButton("버튼4");
		JButton btn5=new JButton("버튼5");
		JButton btn6=new JButton("버튼6");
		JTextField txt=new JTextField(10);
		
		btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setBackground(Color.RED);
				btn2.setBackground(Color.YELLOW);
				txt.setText("텍스트 필드가 바뀝니다.");
				btn3.setText("버튼3 텍스트가 왜이래");
			}
			
		});
		
		
		JLabel lbl=new JLabel("성명 :");
		
		JTextArea area=new JTextArea(20,10);
	
		JCheckBox chk1=new JCheckBox("java");
		JCheckBox chk2=new JCheckBox("C++");
		JCheckBox chk3=new JCheckBox("JSP",true);
		
		JRadioButton rdo1=new JRadioButton("고래");
		JRadioButton rdo2=new JRadioButton("상어");
		JRadioButton rdo3=new JRadioButton("새우");
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
