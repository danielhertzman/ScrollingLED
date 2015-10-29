package com.mah.moment2Test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.mah.ScrollingLEDMessage.arrays.Array7;
import com.mah.ScrollingLEDMessage.arrays.Array7x7;

/**
 * 
 * @author Andrea Schremm, Daniel Hertzman-Ericson, Feby Triana Bergman, Henrik Ahlqvist, Nawzad Bako, Tanya Souresrafil
 *
 */
public class StartTest {
	
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
		
		StartTest startTest = new StartTest();
		
		Viewer testView = new Viewer();
		Controller controller = new Controller(testView);
		UserInput userInput = new UserInput(controller);
		testView.setInputPanel(userInput);		
		
		startTest.action(testView);
		
	}

}
