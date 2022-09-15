package unit03.LayoutExam;

import java.awt.FlowLayout;

import javax.swing.*;

public class HelloFlowLayout extends JFrame{
	HelloFlowLayout(){
		
		JPanel p = new JPanel();
		add(p);
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		JButton btn6 = new JButton("��ư6");
		JButton btn7 = new JButton("��ư7");
		
		p.setLayout(new FlowLayout());
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);
		p.add(btn7);
		
		
		
		//�����ӱ⺻����
		setTitle("�ȳ� �÷ο� ���̾ƿ�");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
			new HelloFlowLayout();
	}

}
