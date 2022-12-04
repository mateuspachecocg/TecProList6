package question04;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {

	JLabel labelTop, labelMax, labelMin, labelMean;
	JTextField textFieldAdd, textFieldMax, textFieldMin, textFieldMean;
	JButton btnOK, btnShow;
	ArrayList<Integer> numbersList;

	public MyFrame() {
		super("Question 04");

		numbersList = new ArrayList<Integer>();

		btnOK = new JButton("OK");
		btnOK.setBounds(240, 100, 160, 40);
		btnOK.addActionListener(this);

		btnShow = new JButton("Show");
		btnShow.setBounds(400, 260, 160, 40);
		btnShow.addActionListener(this);

		textFieldAdd = new JTextField();
		textFieldAdd.setBounds(40, 100, 160, 40);
		textFieldAdd.setHorizontalAlignment(JTextField.CENTER);

		textFieldMax = new JTextField();
		textFieldMax.setBounds(200, 200, 160, 40);
		textFieldMax.setHorizontalAlignment(JTextField.CENTER);

		textFieldMin = new JTextField();
		textFieldMin.setBounds(200, 260, 160, 40);
		textFieldMin.setHorizontalAlignment(JTextField.CENTER);

		textFieldMean = new JTextField();
		textFieldMean.setBounds(200, 320, 160, 40);
		textFieldMean.setHorizontalAlignment(JTextField.CENTER);

		labelTop = new JLabel("Write a number:");
		labelTop.setHorizontalAlignment(JLabel.CENTER);
		labelTop.setBounds(0, 40, 240, 60);

		labelMax = new JLabel("Max >>>");
		labelMax.setHorizontalAlignment(JLabel.CENTER);
		labelMax.setBounds(40, 200, 160, 40);

		labelMin = new JLabel("Min >>>");
		labelMin.setHorizontalAlignment(JLabel.CENTER);
		labelMin.setBounds(40, 260, 160, 40);

		labelMean = new JLabel("Mean >>>");
		labelMean.setHorizontalAlignment(JLabel.CENTER);
		labelMean.setBounds(40, 320, 160, 40);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(600, 440));
		this.setResizable(false);
		this.setLayout(null);
		this.setBackground(Color.white);
		this.setVisible(true);

		this.add(labelTop);
		this.add(labelMax);
		this.add(labelMean);
		this.add(labelMin);

		this.add(textFieldAdd);
		this.add(textFieldMax);
		this.add(textFieldMin);
		this.add(textFieldMean);

		this.add(btnOK);
		this.add(btnShow);
	}

	private String getMean() {

		Integer sum = 0;
		for (Integer x : numbersList) {
			sum += x;
		}
		Double mean = sum / ((1.0) * numbersList.size());
		return String.format("%.2f", mean);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(btnOK)) {
			if (!textFieldAdd.getText().isEmpty()) {
				try {
					numbersList.add(Integer.parseInt(textFieldAdd.getText()));
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "Please Enter With a Integer");
				}

				textFieldAdd.setText("");

			}

		} else if (e.getSource().equals(btnShow)) {
			if (!numbersList.isEmpty()) {
				textFieldMax.setText(Collections.max(numbersList).toString());
				textFieldMin.setText(Collections.min(numbersList).toString());
				textFieldMean.setText(this.getMean());
			}
		}

	}

}
