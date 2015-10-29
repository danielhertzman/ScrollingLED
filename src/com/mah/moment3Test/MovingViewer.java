package com.mah.moment3Test;

import java.awt.*;

import javax.swing.*;

import com.mah.ScrollingLEDMessage.arrays.*;
import com.mah.moment2Test.UserInput;

/**
 * It shows the grid that represent the Array7x7 objects and separate the columns on each sides
 * This contains the values that fell out after movement
 * @author Andrea Schremm, Daniel Hertzman-Ericson, Feby Triana Bergman, Henrik Ahlqvist, Nawzad Bako, Tanya Souresrafil
 *
 */

public class MovingViewer extends JPanel {
	private JPanel gridPanel = new JPanel(new GridLayout(7, 7, 5, 5));
	private JPanel rightPanel = new JPanel(new GridLayout(7, 1, 0, 5));
	private JPanel leftPanel = new JPanel(new GridLayout(7, 1, 0, 5));

	private Color gridColor;
	private Color right_left_Color;

	private JLabel[][] gridLabels = new JLabel[7][7];
	private JLabel[] rightLabels = new JLabel[7];
	private JLabel[] leftLabels = new JLabel[7];

	public MovingViewer() {
		setLayout(new BorderLayout(50, 50));

		gridColor = Color.CYAN;
		right_left_Color = Color.GRAY;

		add(gridPanel, BorderLayout.CENTER);
		add(rightPanel, BorderLayout.EAST);
		add(leftPanel, BorderLayout.WEST);

	}
	
	public void setInputPanel(MovingInput input) {
		add(input, BorderLayout.SOUTH);
	}
	
	/**
	 * Shows the content of the input Array7x7 on the grid
	 * @param theGrid
	 */
	public void showGrid(Array7x7 theGrid) {

		for (int row = 0; row < theGrid.getNbrOfRows(); row++) {

			for (int col = 0; col < theGrid.getNbrOfCols(row); col++) {

				JLabel lbl = new JLabel(String.valueOf(theGrid.getElement(row,
						col)), SwingConstants.CENTER);
				lbl.setBackground(gridColor);

				customizeLabel(lbl);

				gridLabels[row][col] = lbl;
				gridPanel.add(lbl);
			}
		}
	}
	
	/**
	 * Updates the grid with the content of the input Array7x7
	 * @param theGrid
	 */
	public void updateGrid(Array7x7 theGrid) {

		for (int row = 0; row < theGrid.getNbrOfRows(); row++) {

			for (int col = 0; col < theGrid.getNbrOfCols(row); col++) {

				gridLabels[row][col].setText(String.valueOf(theGrid.getElement(
						row, col)));

			}
		}
	}
	
	/**
	 * Displays the content of the provided Array7 object on the right column
	 * @param theRow
	 */
	public void showRight(Array7 theRow) {
		
		for (int i = 0; i < theRow.getLenght(); i++) {
			JLabel lbl = new JLabel(String.valueOf(theRow.getElement(i)),
					SwingConstants.CENTER);
			lbl.setBackground(right_left_Color);

			customizeLabel(lbl);

			rightLabels[i] = lbl;
			rightPanel.add(lbl);
		}
	}
	
	/**
	 * Updates the right column with the content of the provided Array7 object
	 * @param theRow
	 */
	public void updateRight(Array7 theRow) {

		for (int i = 0; i < theRow.getLenght(); i++) {
			rightLabels[i].setText(String.valueOf(theRow.getElement(i)));
		}
	}
	
	/**
	 * Displays the content of the provided Array7 object on the left column
	 * @param theCol
	 */
	public void showleft(Array7 theCol) {

		for (int i = 0; i < theCol.getLenght(); i++) {
			JLabel lbl = new JLabel(String.valueOf(theCol.getElement(i)),
					SwingConstants.CENTER);
			lbl.setBackground(right_left_Color);			

			customizeLabel(lbl);

			leftLabels[i] = lbl;
			leftPanel.add(lbl);
		}

	}
	
	/**
	 * Updates the right column with the content of the provided Array7 object
	 * @param theCol
	 */
	public void updateleft(Array7 theCol) {

		for (int i = 0; i < theCol.getLenght(); i++) {
			leftLabels[i].setText(String.valueOf(theCol.getElement(i)));
		}
	}

	public void customizeLabel(JLabel lbl) {
		lbl.setPreferredSize(new Dimension(40, 40));
		lbl.setOpaque(true);
		lbl.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.BLACK), lbl.getBorder()));
	}

}
