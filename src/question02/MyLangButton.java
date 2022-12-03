package question02;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class MyLangButton extends JButton{
	
	private String langName;
	
	public MyLangButton(String name,int boundX0, int boundY0, ActionListener listener) {
		langName = name;
		this.setText(name);
		super.setBounds(boundX0, boundY0, 100, 50);
		this.setFont(new Font("Comic Sans", Font.BOLD, 11));
		this.setBorder(BorderFactory.createLineBorder(Color.blue));
		this.addActionListener(listener);
	}
	
	public String getLangName() {
		return langName;
	}
}
