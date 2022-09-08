package project0906;

import java.awt.*;

import javax.swing.*;

public class exam09 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("combo 박스");
			
			setLayout(new FlowLayout());
			String pet[]={"고양이","강아지","토끼","코알라","송아지"};
			
			JList list=new JList(pet);
			add(list);
			
			JComboBox combo=new JComboBox(pet);
			add(combo);
			
			
			
			setSize(200,200);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		new MyGUI();

	}

}
