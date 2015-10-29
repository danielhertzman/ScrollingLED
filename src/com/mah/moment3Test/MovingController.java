package com.mah.moment3Test;

import resources.InOut;

import com.mah.ScrollingLEDMessage.arrays.*;
import com.mah.moment2Test.Viewer;

/**
 * Controller handles the logic in MovingGraphicalTest and mediates between the GUI
 * and the Array objects. It has an Array7x7 object represented as a grid on the
 * GUI and two Array7 objects represented as a single column and a single row.
 * It has methods that moves columns entered by the user into 
 * the grid from the left or the right, while shifting the whole content of the grid.
 * 
 * @author Andrea Schremm, Daniel Hertzman-Ericson, Feby Triana Bergman, Henrik Ahlqvist, Nawzad Bako, Tanya Souresrafil
 *
 */
public class MovingController {
	
	private MovingViewer viewer;
	private Array7 rightColPanel, leftColPanel;
	private Array7x7 arr7x7;
	
	public MovingController(MovingViewer viewer) {
		this.viewer = viewer;
		
		rightColPanel = new Array7();
		leftColPanel = new Array7();
		arr7x7 = new Array7x7();
		viewer.showGrid(arr7x7);
		viewer.showRight(rightColPanel);
		viewer.showleft(leftColPanel);
	}
	
	public void updateGrid() {

		viewer.updateGrid(arr7x7);
	}	
	
	public void moveLeft(Array7 array7) {
		
		Array7 left_out = arr7x7.moveLeft(array7);
		viewer.updateGrid(arr7x7);	
		viewer.updateleft(left_out);
		
	}
	
	public void moveRight(Array7 array7) {
		Array7 right_out = arr7x7.moveRight(array7);
		viewer.updateGrid(arr7x7);	
		viewer.updateRight(right_out);
		
	}

}
