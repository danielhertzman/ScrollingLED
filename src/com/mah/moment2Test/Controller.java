package com.mah.moment2Test;

import com.mah.ScrollingLEDMessage.arrays.Array7;
import com.mah.ScrollingLEDMessage.arrays.Array7x7;

/**
 * Controller handles all logic in GraphicalTest and mediates between the GUI
 * and the Array objects. It has an Array7x7 object represented as a grid on the
 * GUI and two Array7 objects represented as a single column and a single row.
 * It has methods to change the content in specific rows and columns in array7x7
 * as well as to change the content of the row and the column Array7 so that
 * they reflect specific rows or columns in array7x7. It invokes methods in its
 * Viewer-object in order to display and update the grid, row and the column on
 * the GUI with the actual content of the appropriate Array objects.
 * 
 * @author Andrea Schremm, Daniel Hertzman-Ericson, Feby Triana Bergman, Henrik Ahlqvist, Nawzad Bako, Tanya Souresrafil
 *
 */
public class Controller {

	private Viewer viewer;
	private Array7 theRow, theCol;
	private Array7x7 arr7x7;

	/**
	 * Constructor that initiates the Array objects to their default values and
	 * invokes methods that display them on the GUI through the Viewer-object.
	 * 
	 * @param viewer
	 */
	public Controller(Viewer viewer) {
		this.viewer = viewer;
		theRow = new Array7();
		theCol = new Array7();
		arr7x7 = new Array7x7();
		viewer.showGrid(arr7x7);
		viewer.showRow(theRow);
		viewer.showCol(theCol);
	}

	/**
	 * Sends the actual content of array7x7 to the Viewer-object for display on
	 * the GUI.
	 * 
	 * @param arr7x7
	 */
	public void updateGrid() {

		viewer.updateGrid(arr7x7);

	}

	/**
	 * Sends the actual content of the row Array7 for display on Viewer.
	 * 
	 * @param theRow
	 */
	public void showRow() {

		viewer.updateRow(theRow);

	}

	/**
	 * Reads the specified row of Array7x7 into the row-Array7 and sends it for
	 * display to the Viewer.
	 * 
	 * @param row
	 *            The row of the grid that should be read into the theRow array
	 */
	public void readRowOfGrid(int row) {
		theRow = arr7x7.getRow(row);
		viewer.updateRow(theRow);
	}

	/**
	 * Sends the actual content of the column Array7 for display on Viewer.
	 * 
	 * @param theCol
	 */
	public void showCol() {

		viewer.updateCol(theCol);

	}

	/**
	 * Reads the specified column of Array7x7 into the column Array7 and sends
	 * it for display to the Viewer.
	 * 
	 * @param col
	 *            The column of the grid that should be read into the theCol
	 *            array
	 */
	public void readColOfGrid(int col) {
		theCol = arr7x7.getCol(col);
		viewer.updateCol(theCol);
	}

	/**
	 * Sets the specified row of the Array7x7 object to the content of the
	 * rowString parameter. The string is first converted into an integer array
	 * wrapped up in an Array7 object. After setting the row of the Array7x7
	 * object, a method for updating the grid on the GUI is called.
	 * 
	 * @param rowString
	 *            String representation of an array of 7 integers, elements
	 *            separated by commas
	 * @param rowNbr
	 *            The row of the Array7x7 object to set
	 */
	public void setRowOfGrid(String rowString, int rowNbr) {

		int[] newRow = splitString(rowString);
		Array7 newArr = new Array7(newRow);

		arr7x7.setRow(rowNbr, newArr);
		updateGrid();
	}

	/**
	 * Sets the specified column of the Array7x7 object to the content of the
	 * colString parameter. The string is first converted into an integer array
	 * wrapped up in an Array7 object. After setting the column of the Array7x7
	 * object, a method for updating the grid on the GUI is called.
	 * 
	 * @param colString
	 *            String representation of an array of 7 integers, elements
	 *            separated by commas
	 * @param colNbr
	 *            The column of the Array7x7 object to set
	 */
	public void setColOfGrid(String colString, int colNbr) {

		int[] newCol = splitString(colString);
		Array7 newArr = new Array7(newCol);

		arr7x7.setCol(colNbr, newArr);
		updateGrid();
	}

	/**
	 * Converts the provided string into an integer array.
	 * 
	 * @param arrayString
	 *            The string to convert into an integer array, elements
	 *            separated by commas
	 * @return Integer array
	 */
	private int[] splitString(String arrayString) {

		String[] array = arrayString.split(",");
		int[] temp = new int[array.length];
		try {

			for (int i = 0; i < array.length; i++) {
				temp[i] = Integer.parseInt(array[i]);
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

		return temp;
	}

	public void moveLeft(Array7 array7) {
		arr7x7.moveLeft(array7);
		viewer.updateGrid(arr7x7);
	}

	public void moveRight(Array7 array7) {
		arr7x7.moveRight(array7);
		viewer.updateGrid(arr7x7);

	}


}
