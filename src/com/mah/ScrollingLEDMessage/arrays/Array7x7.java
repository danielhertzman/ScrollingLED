package com.mah.ScrollingLEDMessage.arrays;

/**
 * Klassen fungerar som ett rutnät/matris
 * 
 * @author Daniel Hertzman-Ericson & Andrea Schremm & Henrik Ahlqvist & Feby
 *         Bergman
 *
 */
public class Array7x7 {

	private int[][] array2D; // rutnät

	/**
	 * Initierar en 7x7 matris med värdet noll i alla positioner.
	 */
	public Array7x7() {
		array2D = new int[7][7];
	}

	/**
	 * Konstruktorn initierar array2D till en färdig matris som skickas in.
	 * 
	 * @param array2D
	 *            En färdig matris som skickas in, i detta fallet en kommande
	 *            bokstav.
	 */
	public Array7x7(int[][] array2D) {

		this.array2D = array2D;

		if (array2D == null) {
			this.array2D = new int[7][7];
		}

	}

	/**
	 * Retunerar värdet i elementet man refarerar till som finns i matrisen.
	 * 
	 * @param row
	 *            Raden i matrisen.
	 * @param col
	 *            Kolumnen i raden.
	 * @return Värdet som finns i det refarerade elementet.
	 */
	public int getElement(int row, int col) {
		if (!interval(col))
			throw new IndexOutOfBoundsException(
					"Column index is out of range 0 - 6");

		if (!interval(row))
			throw new IndexOutOfBoundsException(
					"Row index is out of range 0 - 6");

		return array2D[row][col];

	}

	/**
	 * Sätter/redigerar värdet i det refarerade elementet.
	 * 
	 * @param row
	 *            Raden i matrisen.
	 * @param col
	 *            Kolumnen i raden.
	 * @param value
	 *            Det nya värdet elementet får.
	 */
	public void setElement(int row, int col, int value) {

		if (!interval(col))
			throw new IndexOutOfBoundsException(
					"Column index is out of range 0 - 6");

		if (!interval(row))
			throw new IndexOutOfBoundsException(
					"Row index is out of range 0 - 6");

		array2D[row][col] = value;

	}

	/**
	 * Kontrollerar att värdet användaren matar in är ok.
	 * 
	 * @param value
	 *            Heltalet användaren matar in.
	 * @return Sant/falskt.
	 */
	private boolean interval(int value) {

		return value >= 0 && value < 7;

	}

	/**
	 * Retunerar elementen i den refarerade raden som finns i matrisen.
	 * 
	 * @param row
	 *            Raden man refarerar till i matrisen.
	 * @return Alla element som finns i den refarerade raden.
	 */
	public Array7 getRow(int row) {
		if (!interval(row))
			throw new IndexOutOfBoundsException(
					"Row index is out of range 0 - 6");

		int[] res = new int[7];

		for (int i = 0; i < res.length; i++) {
			res[i] = array2D[row][i];
		}

		return new Array7(res);

	}

	/**
	 * Ersätter den refarerade raden med en ny rad man skickar in.
	 * 
	 * @param row
	 *            Den raden man vill ersätta i matrisen.
	 * @param theRow
	 *            Den nya raden.
	 */
	public void setRow(int row, Array7 theRow) {
		if (!interval(row))
			throw new IndexOutOfBoundsException(
					"Row index is out of range 0 - 6");

		for (int i = 0; i < theRow.getLenght(); i++) {

			array2D[row][i] = theRow.getElement(i);

		}

	}

	/**
	 * Ersätter den refarerade kolumnen med en ny kolumn man skickar in.
	 * 
	 * @param col
	 *            Den kolumnen man vill ersätta i matrisen.
	 * @param theCol
	 *            Den nya kolumnen.
	 */
	public void setCol(int col, Array7 theCol) {
		if (!interval(col))
			throw new IndexOutOfBoundsException(
					"Column index is out of range 0 - 6");

		for (int i = 0; i < theCol.getLenght(); i++) {

			array2D[i][col] = theCol.getElement(i);

		}
	}

	/**
	 * Retunerar elementen i den refarerade kolumnen som finns i matrisen.
	 * 
	 * @param col
	 *            Kolumnen man refarerar till i matrisen.
	 * @return Alla element som finns i den refarerade kolumnen.
	 */
	public Array7 getCol(int col) {
		if (!interval(col))
			throw new IndexOutOfBoundsException(
					"Column index is out of range 0 - 6");

		int[] res = new int[array2D.length];

		for (int i = 0; i < array2D.length; i++) {

			res[i] = array2D[i][col];

		}

		return new Array7(res);
	}

	/**
	 * Retunerar antalet rader i matrisen/rutnätet
	 * 
	 * @return Antal rader i matrisen/rutnätet
	 */
	public int getNbrOfRows() {
		return array2D.length;
	}

	/**
	 * Retunerar antalet columner i den specifika raden argumentet hänvisar
	 * till.
	 * 
	 * @param row
	 *            Den rad i matrisen/rutnätet man vill åt.
	 * @return Antalet kolumner som finns i den angivna raden.
	 */
	public int getNbrOfCols(int row) {
		return array2D[row].length;
	}

	/**
	 * Skiftar innehållet i matrisen åt vänster.
	 * 
	 * @param array7
	 *            columnen som ska kopieras in till höger
	 * @return Array7:n som innehåller kolumnen som "trillade över kanten"
	 */
	public Array7 moveLeft(Array7 array7) {

		Array7 leftmost = getCol(0);

		for (int i = 0; i < 6; i++) {
			setCol(i, getCol(i + 1));
		}
		setCol(6, array7);


		return leftmost;
	}

	/**
	 * Skiftar innehållet i matrisen åt höger.
	 * 
	 * @param array7
	 *            columnen som ska kopieras in till vänster
	 * @return Array7:n som innehåller kolumnen som "trillade över kanten"
	 */
	public Array7 moveRight(Array7 array7) {

		Array7 rightmost = getCol(6);

		for (int i = 5; i >= 0; i--) {
			setCol(i + 1, getCol(i));
		}

		setCol(0, array7);

		return rightmost;
	}

	 /**
	 * Retunerar hela matrisen/rutnätet.
	 * @return matrisen/rutnätet.
	 */
	 public int[][] getGrid(){
		 return array2D;
	 }

}
