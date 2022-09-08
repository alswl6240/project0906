package project0906;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class exam12 extends JFrame{
      exam12(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ket Event");
		
		setLayout(new FlowLayout());
		JTextField txt1=new JTextField(10);
		JTextArea area=new JTextArea(10,10);
		
		addKeyListener(new KeyListener(){

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				int key= e.getKeyCode();
				if(key == KeyEvent.VK_ENTER){
					String str=txt1.getText();
					area.setText(area.getText()+str+'\n');
					txt1.setText("");
				
				
				
			}
			
			});
		
		add(txt1);
		add(area);
		
		setSize(200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new exam12();

	}



