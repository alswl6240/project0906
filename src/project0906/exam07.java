package project0906;

import java.awt.*;

import javax.swing.*;

public class exam07 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("�̹��� �ǽ�");
			setLayout(new FlowLayout());
			
			ImageIcon img1=new ImageIcon("images/java1.png");
			JButton btn1=new JButton("��ư1",img1);
			add(btn1);
			
			ImageIcon img2=new ImageIcon("images/Java2.png");
			JLabel lbl1=new JLabel("���̺�1�Դϴ�");
			JLabel lbl2=new JLabel(img2);
			add(lbl1);
			add(lbl2);
			
			JCheckBox chk1=new JCheckBox("C++");
			JCheckBox chk2=new JCheckBox("Java");
			JCheckBox chk3=new JCheckBox("C#",true);
			add(chk1);
			add(chk2);
			add(chk3);
			
			JRadioButton rdo1=new JRadioButton("��");
			JRadioButton rdo2=new JRadioButton("���");
			JRadioButton rdo3=new JRadioButton("����");
			add(rdo1);
			add(rdo2);
			add(rdo3);
			
			ButtonGroup grp=new ButtonGroup();
			grp.add(rdo1);
			grp.add(rdo2);
			grp.add(rdo3);
			setSize(200,300);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		new MyGUI();

	}

}
