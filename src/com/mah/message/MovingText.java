package com.mah.message;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import rolfFiles.Color;
import rolfFiles.ColorDisplay;
import java.util.*;
import com.mah.ScrollingLEDMessage.arrays.Array7;
import com.mah.ScrollingLEDMessage.arrays.Array7x7;

/**
 * Displays the provided text as a moving message on a colorDisplay
 * @author Andrea Schremm, Daniel Hertzman-Ericson, Feby Triana Bergman, Henrik Ahlqvist, Nawzad Bako, Tanya Souresrafil
 *
 */
public class MovingText {

	private Timer timer = new Timer();
	
	private ColorDisplay d = new ColorDisplay(1, 7, Color.BLACK, Color.BLACK,
			1, 10);
	
	private Array7x7[] text;

	public MovingText(Array7x7[] text) {
		
		if (text != null) {
			this.text = text;
			timer.schedule(new Move(), 50, 75);
		}
		
		else {
			System.exit(0);
		}
	}

	/**
	 * Moves the text one step to the left
	 */
	public void moveOne() {

		Array7 result = text[0].getCol(0);

		for (int i = text.length - 1; i >= 0; i--) {

			result = text[i].moveLeft(result);
		}
	}

	/**
	 * Shows the updated portion of the text on the display. 7 characters are shown at the time
	 */
	public void showOnDisplay() {

		for (int i = 0; i < 7; i++) {
			d.setDisplay(text[i].getGrid(), 0, i);
		}

		d.updateDisplay();

	}

	/**
	 * The TimerTask that invokes the method that moves the text one step at a time
	 * @author Andrea
	 *
	 */
	private class Move extends TimerTask {

		@Override
		public void run() {
			moveOne();
			showOnDisplay();

		}

	}
	
	/**
	 * The action-method for the ColorDisplay which is shown as a JFrame
	 */
	public void action() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame("Scrolling LED Message");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(d);
				frame.pack();
				frame.setVisible(true);

			}
		});
	}


	public static void main(String[] args) {

		MovingText test = new MovingText(TextIn.textIn());
		test.action();

	}

}
