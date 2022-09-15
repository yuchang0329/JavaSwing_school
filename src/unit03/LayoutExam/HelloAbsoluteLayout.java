package unit03.LayoutExam;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloAbsoluteLayout extends JFrame{
	HelloAbsoluteLayout(){
		setLayout(null);
		
		JButton btn1 = new JButton("버튼1");
		btn1.setSize(70,40);
		btn1.setLocation(10,40);
		
		JButton btn2 = new JButton("버튼2");
		//btn2.setSize(90,20);
		//btn2.setLocation(150,30);
		btn2.setBounds(150,30,90,120);
		
		add(btn1);
		add(btn2);
		
		//프레임기본세팅
		setTitle("배치관리자가 없는 절대 값 레이아웃");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		

	}
	public static void main(String[] args) {
		new HelloAbsoluteLayout();

	}

}
