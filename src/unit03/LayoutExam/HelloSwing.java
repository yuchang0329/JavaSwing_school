package unit03.LayoutExam;

import javax.swing.*;

//2. JFrame 상속 받기 
public class HelloSwing extends JFrame{

	//생성자에서 화면 만들기 
	HelloSwing(){
		//초기 세팅 세주기 
		setTitle("안녕 스윙!");
		setSize(300,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		//
		new HelloSwing();
	}

}
