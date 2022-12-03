package question01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener {
	
	JPanel panelTop;
	JPanel panelBottom;
	JButton buttonYellow;
	JButton buttonGreen;
	JButton buttonBlue;
	
	MainFrame() {
		super("Questions 1");
		
		buttonYellow = new JButton();
		buttonYellow.setText("Yellow");
		buttonYellow.setBounds(20, 25, 70, 50);
		buttonYellow.setFont(new Font("Comic Sans", Font.BOLD, 11));
		buttonYellow.setBorder(BorderFactory.createLineBorder(Color.yellow));
		
		buttonGreen = new JButton();
		buttonGreen.setText("Green");
		buttonGreen.setBounds(105, 25, 70, 50);
		buttonGreen.setFont(new Font("Comic Sans", Font.BOLD, 11));
		buttonGreen.setBorder(BorderFactory.createLineBorder(Color.green));
		
		buttonBlue= new JButton();
		buttonBlue.setText("Blue");
		buttonBlue.setBounds(190, 25, 70, 50);
		buttonBlue.setFont(new Font("Comic Sans", Font.BOLD, 11));
		buttonBlue.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		
		buttonYellow.addActionListener(this);
		buttonGreen.addActionListener(this);
		buttonBlue.addActionListener(this);
		
		panelTop = new JPanel();
		panelTop.setBounds(10, 10, 280, 100);
		panelTop.setLayout(null);
		panelTop.setBackground(Color.LIGHT_GRAY);
		
		
		panelTop.add(buttonYellow);
		panelTop.add(buttonGreen);
		panelTop.add(buttonBlue);
		
		panelBottom = new JPanel();
		panelBottom.setBounds(10, 120, 280, 330);
		panelBottom.setBackground(Color.white);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(300,500));
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.add(panelTop);
		this.add(panelBottom);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Color color = null;
		
		if (arg0.getSource().equals(buttonYellow))
			color = Color.yellow;
		else if (arg0.getSource().equals(buttonGreen))
			color = Color.green;
		else if(arg0.getSource().equals(buttonBlue))
			color = Color.blue;
		else 
			color = panelBottom.getBackground();
		
		panelBottom.setBackground(color);
		
	}

}
