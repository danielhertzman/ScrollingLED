package com.mah.moment2Test;

import resources.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.mah.ScrollingLEDMessage.arrays.Array7;

/**
 * This class lets the user put in values to the columns and the rows of the grid and show the input values 
 * on the separate row and column.
 * @author Andrea Schremm, Daniel Hertzman-Ericson, Feby Triana Bergman, Henrik Ahlqvist, Nawzad Bako, Tanya Souresrafil
 *
 */
public class UserInput extends JPanel {
	private Controller testController;
	private int rowNbr;
	private int colNbr;
	private JButton readRowBtn = new JButton("Läs rad");
	private JButton writeRowBtn = new JButton("Skriv rad");
	private JButton rowNbrBtn = new JButton("Input rad nbr");
	private JButton readColBtn = new JButton("Läs kol");
	private JButton writeColBtn = new JButton("Skriv kol");
	private JButton colNbrBtn = new JButton("Input kol nbr");
	private JLabel rowLbl;
	private JLabel colLbl;

	private JButton moveLeftBtn = new JButton("moveleft");
	private JButton moveRightBtn = new JButton("moveright");

	public UserInput(Controller testController) {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.testController = testController;
		rowLbl = new JLabel("Aktuell rad: " + rowNbr);
		colLbl = new JLabel("Aktuell kolumn: " + colNbr);
		add(readRowBtn);
		add(writeRowBtn);
		add(rowNbrBtn);
		add(readColBtn);
		add(writeColBtn);
		add(colNbrBtn);
		add(rowLbl);
		add(colLbl);
		ButtonListener btnListener = new ButtonListener();
		rowNbrBtn.addActionListener(btnListener);
		writeRowBtn.addActionListener(btnListener);
		readRowBtn.addActionListener(btnListener);
		colNbrBtn.addActionListener(btnListener);
		writeColBtn.addActionListener(btnListener);
		readColBtn.addActionListener(btnListener);

		add(moveLeftBtn);
		moveLeftBtn.addActionListener(btnListener);

		add(moveRightBtn);
		moveRightBtn.addActionListener(btnListener);

	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			// Copies the values from the specified row to the separate row
			if (e.getSource() == readRowBtn) {
				testController.readRowOfGrid(rowNbr);
			}

			// Lets you input value to the specified row
			if (e.getSource() == writeRowBtn) {
				String rowString = JOptionPane
						.showInputDialog("Ange rad (t.ex. 1,2,3,4...)");
				testController.setRowOfGrid(rowString, rowNbr);
			}

			// Specify row number
			if (e.getSource() == rowNbrBtn) {

				rowNbr = InOut.readInt("Ange radnummer (endast heltal)");
				String res = "Aktuell rad: " + rowNbr;
				rowLbl.setText(res);

			}

			// Copies the values from the specified column to the separate column
			if (e.getSource() == readColBtn) {
				testController.readColOfGrid(colNbr);
			}

			// Lets you input value to the specified column
			if (e.getSource() == writeColBtn) {
				String colString = JOptionPane
						.showInputDialog("Ange kolumn (t.ex. 1,2,3,4...)");
				testController.setColOfGrid(colString, colNbr);
			}

			// Specify column number
			if (e.getSource() == colNbrBtn) {
				colNbr = InOut.readInt("Ange kolumnnummer (endast heltal)");
				String res = "Aktuell kolumn: " + colNbr;
				colLbl.setText(res);
			}

			// move left within the grid
			if (e.getSource() == moveLeftBtn) {
				int[] i = { 0, 0, 0, 0, 0, 0, 0 };
				Array7 arr7 = new Array7(i);
				testController.moveLeft(arr7);
			}

			// move right within the grid
			if (e.getSource() == moveRightBtn) {
				int[] i = { 0, 0, 0, 0, 0, 0, 0 };
				Array7 arr7 = new Array7(i);
				testController.moveRight(arr7);
			
			}
		}
	}

}
