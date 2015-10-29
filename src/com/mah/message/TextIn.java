package com.mah.message;

import javax.swing.JOptionPane;

import rolfFiles.Color;

import com.mah.ScrollingLEDMessage.arrays.Array7x7;

/**
 * Reads in a text from the user and sets the color.
 * @author Andrea Schremm, Daniel Hertzman-Ericson, Feby Triana Bergman, Henrik Ahlqvist, Nawzad Bako, Tanya Souresrafil
 *
 */
public class TextIn {
	
	/**
	 * Lets you enter a text 
	 * @return the text as a collection of Array7x7 objects, each representing a character in a specific color 
	 */	
	public static Array7x7[] textIn() {
		Array7x7[] text = null;
		String inputText = JOptionPane.showInputDialog("Skriv text");

		if (inputText != null) {
			
			inputText = checkInputText(inputText);

			text = new Array7x7[inputText.length()];
			
			// gets the Array7x7 representation of the character and copies it into 'text'
			for (int i = 0; i < text.length; i++) {
				text[i] = new Array7x7();
				
				Array7x7 character = Characters.getChar(inputText.charAt(i));
				
				for (int row = 0; row < character.getNbrOfRows(); row++) {
					
					for (int col = 0; col < character.getNbrOfCols(row); col++) {
						
						text[i].setElement(row, col,
								character.getElement(row, col));
					}
				}

				charToRedColor(text[i]);
			}
		}

		return text;
	}
	
	/**
	 * Checks if the text has less than 7 characters, and if so, it adds more space
	 * @param inputText
	 * @return the edited text
	 */
	private static String checkInputText(String inputText) {
		
		if (inputText.length() < 7) {
		
			for (int i = inputText.length(); i < 7; i++) {
			
				inputText += " ";
			
			}
		
		}
		
		else
		
			inputText += " ";
		
		return inputText;
	
	}

	/**
	 * Sets the color of the text
	 * @param oneChar every piece of character 
	 */
	public static void charToRedColor(Array7x7 oneChar) {
		
		for (int i = 0; i < oneChar.getNbrOfRows(); i++) {
			
			for (int y =0; y < oneChar.getNbrOfCols(i); y++) {
			
				if (oneChar.getElement(i, y) == 1) {
				
					oneChar.setElement(i, y, Color.RED);
				
				}
				
				else if (oneChar.getElement(i, y) == 0)  {
					
					oneChar.setElement(i, y, Color.BLACK);
				
				}
			}
		}
		
	}

}
