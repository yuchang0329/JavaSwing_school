package unit03.LayoutExam;

import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloPanel extends JFrame{
	
	HelloPanel(){
		
		JPanel p = new JPanel();
		p.setBackground(Color.orange);
		add(p);
		

		JButton btn = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		
		btn.setBackground(Color.yellow);
		btn2.setBackground(Color.pink);
		
		p.add(btn);
		p.add(btn2);
		

		
		setTitle("�ȳ� �г�");
		setSize(300,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloPanel();

	}

}
