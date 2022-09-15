package unit03.LayoutExam;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloGridLayout extends JFrame{
	HelloGridLayout(){
		
		JPanel p = new JPanel();
		add(p);
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		JButton btn6 = new JButton("버튼6");
		JButton btn7 = new JButton("버튼7");
		
		btn1.setBackground(Color.red);
		btn2.setBackground(Color.orange);
		btn3.setBackground(Color.yellow);
		btn4.setBackground(Color.green);
		btn5.setBackground(Color.blue);
		btn6.setBackground(Color.WHITE);
		btn7.setBackground(Color.black);
		
		
		p.setLayout(new GridLayout(0,3,10,10));
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);
		p.add(btn7);
		
		
		//프레임기본세팅
		setTitle("그리드 레이아웃");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HelloGridLayout();

	}

}
