package com.mah.moment3Test;

import resources.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.mah.ScrollingLEDMessage.arrays.*;

/**
 * 
 * @author Andrea Schremm, Daniel Hertzman-Ericson, Feby Triana Bergman, Henrik Ahlqvist, Nawzad Bako, Tanya Souresrafil
 *
 */
public class MovingInput extends JPanel {
	private MovingController testController;

	private JButton moveLeftBtn = new JButton("moveleft");
	private JButton moveRightBtn = new JButton("moveright");

	public MovingInput(MovingController testController) {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.testController = testController;

		ButtonListener btnListener = new ButtonListener();

		add(moveLeftBtn);
		moveLeftBtn.addActionListener(btnListener);

		add(moveRightBtn);
		moveRightBtn.addActionListener(btnListener); 
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			// shift the content of the grid to the left and copy the leftmost column to the separate left-column
			if (e.getSource() == moveLeftBtn) {
				int[] i = InOut.readArray("Mata in");
				Array7 arr7 = new Array7(i);
				testController.moveLeft(arr7);
			}
			
			// shift the content of the grid to the right and copy the rightmost column to the separate right-column
			if (e.getSource() == moveRightBtn) {
				int[] i = InOut.readArray("Mata in");
				Array7 arr7 = new Array7(i);
				testController.moveRight(arr7);
			
			}
		}
	}

}
