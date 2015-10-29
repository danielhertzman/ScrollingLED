package com.mah.ScrollingLEDMessage.arrays;
/**
 * Klassen representerar rader och kolumner från 7x7-arrayen
 * 
 * @author Daniel Hertzman-Ericson & Andrea Schremm & Henrik Ahlqvist & Feby
 *         Bergman
 *
 */
public class Array7 {
	
	private int[] array7;
	
	/**
	 * Initierar en rad eller kolumn som bara innehåller noller.
	 */
	public Array7() {
		array7 = new int[7];
	}
	/**
	 * Initierar array7 till en färdig rad/kolumn man skickar in.
	 * 
	 * @param array7 En rad eller kolumn som skickas in.
	 */
	public Array7(int[] array7) {

		this.array7 = array7;

		if (array7 == null) {
			this.array7 = new int[7];
		}

	}
	/**
	 * Retunerar värdet i det refarerade  elementet från raden/kolumnen. 
	 * 
	 * @param index Det elementet man vill hämta värdet från.
	 * @return Elementets värde.
	 */
	public int getElement(int index) {
		if (!interval(index))
			throw new IndexOutOfBoundsException("Array index is out of range 0 - 6");
		
		return array7[index];

	}
	/**
	 * Sätter/redigerar värdet i det refarerade elementet från raden/kolumnen.
	 * 
	 * @param index Det element man vill ändra på i raden/kolumnen. 
	 * @param value Det nya värdet elementet ska få.
	 */
	public void setElement(int index, int value) {
		if (!interval(index))
			throw new IndexOutOfBoundsException("Array index is out of range 0 - 6");
		
		array7[index] = value;

	}

	private boolean interval(int value) {

		return value >= 0 && value < 7;

	}
	/**
	 * Retunerar hur många element det finns i raden/kolumnen(array7). 
	 * 
	 * @return Längden på raden/kolumnen.
	 */
	public int getLenght() {
		return array7.length;
	}

}
