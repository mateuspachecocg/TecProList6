package question03;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	
	JTextField textField;
	JButton button;
	
	public MyFrame() {
		super("Question 03");
		
		textField = new JTextField();
		textField.setBounds(30, 20, 150, 30);
		
		button = new JButton();
		button.setText("SEND");
		button.addActionListener(this);
		button.setBounds(190, 20, 90, 30);
		button.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(310, 100));
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.add(button);
		this.add(textField);	
		}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"TextField: " + textField.getText());
	}
}
