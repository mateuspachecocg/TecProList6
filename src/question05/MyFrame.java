package question05;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

	JLabel label;
	JButton btn;
	JComboBox comboBox;
	JTextField textField;

	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(620, 220);

		label = new JLabel("Values:");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setBounds(20, 40, 160, 40);
		label.setBorder(BorderFactory.createLineBorder(Color.blue));

		textField = new JTextField();
		textField.setBounds(200, 40, 160, 40);
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setFont(new Font("Consolas", Font.BOLD, 13));

		String[] operations = { "Sum", "Multiplication" };

		comboBox = new JComboBox(operations);
		comboBox.setBounds(200, 120, 160, 40);
		comboBox.setFont(new Font("Consolas", Font.BOLD, 13));

		btn = new JButton("Calculate");
		btn.setBounds(420, 120, 160, 40);
		btn.addActionListener(this);

		this.add(label);
		this.add(textField);
		this.add(comboBox);
		this.add(btn);

		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btn) {
			if (textField.getText().length() < 3) {
				Integer x, unity, ten;
				try {
					x = Integer.parseInt(textField.getText());
					unity = x % 10;
					ten = (x - unity) / 10;
					String msg = "";
					if (comboBox.getSelectedIndex() == 0) {
						msg = String.format("The result of the sum %d + %d = %d.", ten, unity, ten + unity);
					} else if (comboBox.getSelectedIndex() == 1) {
						msg = String.format("The result of the Multiplication %d X %d = %d.", ten, unity, ten * unity);
					}
					
					JOptionPane.showMessageDialog(null, msg, "Result", JOptionPane.INFORMATION_MESSAGE, null);

				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "Enter with integers values", "Warning", JOptionPane.WARNING_MESSAGE,
							null);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Please enter with only 2 caracters", "Warning",
						JOptionPane.ERROR_MESSAGE, null);
			}
		}

	}
}
