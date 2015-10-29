package resources;

import java.io.StringWriter;

import javax.swing.JOptionPane;

/**
 * Class with utility-methods for reading different types of inputs from the user,
 * while controlling for invalid inputs.
 * @author Andrea Schremm, Daniel Hertzman-Ericson, Feby Triana Bergman, Henrik Ahlqvist, Nawzad Bako, Tanya Souresrafil
 *
 */
public class InOut {
	
	/**
	 * Shows an input-dialog to read user-input and then tries to convert it to integer.
	 * @return The user-input, if it is an integer, 0 otherwise
	 */
	public static int readInt() {
		int value = 0;
		boolean inputOK = false;
		do {
			try {
				value = Integer.parseInt(JOptionPane.showInputDialog("Mata in ett heltal"));
				inputOK = true;
			} catch (NumberFormatException ex) {}
			catch (NullPointerException ex) {}
			
		} while (inputOK == false);
		
		return value;
	}
	
	/**
	 * Shows an input-dialog with the specified message to read user-input and then tries to convert it to integer.
	 * @param txt The message to show in the input-dialog
	 * @return The user-input, if it is an integer, 0 otherwise
	 */
	public static int readInt(String txt) {
		int value = 0;
		boolean inputOK = false;
		do {
			try {
				value = Integer.parseInt(JOptionPane.showInputDialog(txt));
				inputOK = true;
			} catch (NumberFormatException ex) {}
			catch (NullPointerException ex) {}
			
		} while (inputOK == false);
		
		return value;
	}
	
	/**
	 * Shows an input-dialog with the specified message to read user-input and then tries to convert it to a double.
	 * @param txt The message to show in the input-dialog
	 * @return The user-input, if it is a double, 0 otherwise
	 */
	public static double readDouble(String txt) {
		double value = 0;
		boolean inputOk = false;
		
		do {
			try {
				value = Double.parseDouble(JOptionPane.showInputDialog(txt));
				inputOk = true;
			} 
			catch (NumberFormatException ex1) {}
			catch (NullPointerException ex2) {}
		} while (!inputOk);
		
		return value;
		
	}
	
	/**
	 * Shows an input-dialog to read user-input and then tries to convert it to double.
	 * @return The user-input, if it is a double, 0 otherwise
	 */
	public static double readDouble() {
		double value = 0;
		boolean inputOk = false;
		
		do {
			try {
				value = Double.parseDouble(JOptionPane.showInputDialog("Mata in ett decimaltal"));
				inputOk = true;
			} 
			catch (NumberFormatException ex1) {}
			catch (NullPointerException ex2) {}
		} while (!inputOk);
		
		return value;
		
	}
	
	/**
	 * Reads in a string and converts it into an integer array.
	 * @param arrayString The string to convert into an integer array, elements separated by commas
	 * @return Integer array
	 */
	public static int[] readArray(String txt) {
		
		int[] temp = new int[7];			//Tom int array med 7 element
		boolean inputArrayOk = false;    //Boolean om inmatningsarrayen är ok
		int counter_valid = 0;			//En räknare som ökar++ om inmatningsarrayens index är en interger
		
		do{
			try {				
				
				String str = JOptionPane.showInputDialog(txt);
				String[] stringArray = str.split(",");        //
				
				//Kontrollerar om stringArray är en korrekt array(som bara innehåller integers)
				
				if (stringArray.length == 7){					
					
					for(int i = 0; i < temp.length; i++){	
						
						String s = stringArray[i].replaceAll("\\s","");
						stringArray[i] = s;
						stringArray[i].replaceAll("\\s","");//tar bort alla blanka tecken ""
						
						//System.out.println(stringArray[i]);
						
						if(isInteger(stringArray[i])){		//kontrollerar om det är siffror i stringArrayen
							counter_valid ++;				//i så fall ökar räknaren
						}
					}
					
					if (counter_valid == 7){				//Om alla värden i stringArrayen är integers är stringArrayen korrekt.
						
						for (int i = 0; i < temp.length; i++){
							temp[i] = Integer.parseInt(stringArray[i]);		//temp arrayen får alla integers som finns i stringArrayen(konventeras).
						}
						inputArrayOk = true;
						counter_valid = 0;						
					}
					counter_valid = 0;
				}				
			}
			catch (Exception e) {
				System.out.print(e.getMessage());
			}
		} while(!inputArrayOk);
				
		return temp;
	}
	
	private static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	    	System.out.println(e + "ErroR");
	        return false; 
	    }
	    return true;
	}
	
}
