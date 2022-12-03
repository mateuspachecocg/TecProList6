package question01;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class MyButton extends JButton{
	
	public MyButton (Color color, int x0,int y0) {
		String colorName = "";
		
		if (color.equals(Color.yellow)) 
			colorName = "Yellow";
		else if(color.equals(Color.green)) 
			colorName = "Green";
		else if(color.equals(Color.blue))
			colorName = "Blue";
		
		this.setText(colorName);
		super.setBounds(x0, y0, 70, 50);
		this.setFont(new Font("Comic Sans", Font.BOLD, 11));
		this.setBorder(BorderFactory.createLineBorder(color));
	}

}
