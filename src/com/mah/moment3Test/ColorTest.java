package com.mah.moment3Test;
import javax.swing.JOptionPane;

import resources.InOut;
import rolfFiles.Color;
import rolfFiles.ColorDisplay;

import java.util.*;

import com.mah.ScrollingLEDMessage.arrays.Array7;
import com.mah.ScrollingLEDMessage.arrays.Array7x7;
import com.mah.message.Characters;

/**
 * Test class for the ColorDisplay
 * @author Andrea Schremm, Daniel Hertzman-Ericson, Feby Triana Bergman, Henrik Ahlqvist, Nawzad Bako, Tanya Souresrafil
 *
 */
public class ColorTest {
	
	private Timer timer = new Timer();
	private int[][] arr = {{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED},
			{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED},
			{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED},
			{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED},
			{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED},
			{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED},
			{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED}};
	
	private int[] colorHex =  {Color.CYAN,Color.CYAN,Color.CYAN,Color.CYAN,Color.CYAN,Color.CYAN,Color.CYAN};
	private int[] colorBlack =  {Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK,Color.BLACK};
	private ColorDisplay d = new ColorDisplay(1,1,Color.WHITE,Color.BLACK,1,10);
	
	private Array7x7 arr7x7 = new Array7x7(arr);
	private Array7 arr7 = new Array7(colorHex);
	private Array7 blackArr7 = new Array7(colorBlack);
	private Array7x7 testArray7x7;
	
	public ColorTest() {		
			
		
		//d.setDisplay(arr7x7.getGrid(),0,0); // arr har röd-värde i samtliga element
		testArray7x7 = Characters.getChar('°');
		int[][] testChar = charToRedColor(testArray7x7);
		testArray7x7 = new Array7x7(testChar);
		d.setDisplay(testArray7x7.getGrid(),0,0); 
		d.updateDisplay();

		
		//timer.schedule(new ToDo(), 2000, 2000);
		timer.schedule(new ShiftChar(), 1000, 500);
		
	}
	
	public void action() {
		JOptionPane.showMessageDialog(null,d);
	}
	
	public int[][] charToRedColor(Array7x7 testChar) {
		
		int[][] character = new int[testChar.getNbrOfRows()][testChar.getNbrOfCols(0)];
		
		for (int i = 0; i < testChar.getNbrOfRows(); i++) {
			for (int y =0; y < testChar.getNbrOfCols(i); y++) {
				if (testChar.getElement(i, y) == 1) {
					character[i][y] = Color.RED;
				}
				else {
					character[i][y] = Color.BLACK;
				}
			}
		}
		return character;
		
	}
	
	
	public static void main(String[] args) {

		ColorTest test = new ColorTest();
		test.action();
		
						
	}
	private class ToDo extends TimerTask{

		@Override
		public void run() {
			arr7x7.moveRight(arr7);
			d.setDisplay(arr7x7.getGrid(),0,0);
			d.updateDisplay();
		}
		
	}
	
	private class ShiftChar extends TimerTask{

		@Override
		public void run() {
			testArray7x7.moveLeft(blackArr7);
			d.setDisplay(testArray7x7.getGrid(),0,0);
			d.updateDisplay();
		}
		
	}

}
