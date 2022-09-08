package project0906;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class exam11 extends JFrame{
	exam11(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI ½Ç½À");
		
		setLayout(new FlowLayout());
		
		JTextField txt1=new JTextField(10);
		JTextField txt2=new JTextField(10);
		add(txt1);
		add(txt2);
		
		addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				txt1.setText(Integer.toString(e.getX()));
				txt2.setText(Integer.toString(e.getY()));
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new exam11();

	}

}
