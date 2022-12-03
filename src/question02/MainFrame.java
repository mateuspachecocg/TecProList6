package question02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener {

	JLabel label;
	JButton btn1, btn2, btn3, btn4, btn5, btn6;

	MainFrame() {
		super("Question 02");

		label = new JLabel("Choose");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setBounds(115, 75, 150, 50);
		label.setBorder(BorderFactory.createLineBorder(Color.blue));
		label.setLayout(null);
		

		btn1 = new MyLangButton("Java", 20, 200, this);
		btn2 = new MyLangButton("JavaScript", 140, 200, this);
		btn3 = new MyLangButton("Python", 260, 200, this);
		btn4 = new MyLangButton("C++", 20, 270, this);
		btn5 = new MyLangButton("C#", 140, 270, this);
		btn6 = new MyLangButton("C", 260, 270, this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(380, 390));
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.add(label);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(btn6);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() instanceof MyLangButton) {
			label.setFont(new Font("Serif", Font.BOLD, 20));
			label.setText(((MyLangButton) arg0.getSource()).getLangName());
		}
	}
}
