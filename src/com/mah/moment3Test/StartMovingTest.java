package com.mah.moment3Test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import rolfFiles.ColorDisplay;

import com.mah.ScrollingLEDMessage.arrays.*;

public class StartMovingTest {
	
	public void action(final JPanel testView){
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame("Graphical test");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(testView);
				frame.pack();
				frame.setVisible(true);
				
			}
		});		
	}
	
	public static void main(String[] args) {
		
		StartMovingTest startTest = new StartMovingTest();
		
		MovingViewer testView = new MovingViewer();
		MovingController controller = new MovingController(testView);
		MovingInput userInput = new MovingInput(controller);
		testView.setInputPanel(userInput);	
		
		
		startTest.action(testView);		
	}

}
