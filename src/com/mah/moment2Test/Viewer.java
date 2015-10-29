package com.mah.moment2Test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.*;

import com.mah.ScrollingLEDMessage.arrays.Array7;
import com.mah.ScrollingLEDMessage.arrays.Array7x7;

/**
 * It shows the grid that represent the Array7x7 objects and separate rows
 * and columns that stand for Array7 objects.
 * @author Andrea Schremm, Daniel Hertzman-Ericson, Feby Triana Bergman, Henrik Ahlqvist, Nawzad Bako, Tanya Souresrafil
 *
 */
public class Viewer extends JPanel {
	
	private JPanel gridPanel = new JPanel(new GridLayout(7, 7, 5, 5));
	private JPanel rowPanel = new JPanel(new GridLayout(1, 7, 5, 0));
	private JPanel colPanel = new JPanel(new GridLayout(7, 1, 0, 5));
	
	private Color gridColor;
	private Color row_col_Color;
	
	private JLabel[][] gridLabels = new JLabel[7][7];
	private JLabel[] rowLabels = new JLabel[7];
	private JLabel[] colLabels = new JLabel[7];
	
	
	public Viewer() {
		
		setLayout(new BorderLayout(50, 50));
		
		gridColor = Color.CYAN;
		row_col_Color = Color.GRAY;
		
		add(gridPanel, BorderLayout.CENTER);
		add(rowPanel, BorderLayout.SOUTH);
		add(colPanel, BorderLayout.WEST);
		
	}
	
	public void setInputPanel(UserInput input) {
		add(input, BorderLayout.EAST);
	}
	
	/**
	 * Visar alla element i matrisen/rutnätet enligt argumentet grafiskt. 
	 * 
	 * @param theGrid matrisen/rutnätet som ska visas. 
	 */
	public void showGrid(Array7x7 theGrid){
		
		for (int row = 0; row < theGrid.getNbrOfRows(); row++){
			
			for(int col = 0; col < theGrid.getNbrOfCols(row); col++){
				
				JLabel lbl = new JLabel(String.valueOf(theGrid.getElement(row, col)), SwingConstants.CENTER);			
				
				lbl.setBackground(gridColor);

				customizeLabel(lbl);
			  
				gridLabels[row][col] = lbl;
				
				gridPanel.add(lbl);
			}
		}
	}
	
	public void updateGrid(Array7x7 theGrid){
		
		for (int row = 0; row < theGrid.getNbrOfRows(); row++){
			
			for(int col = 0; col < theGrid.getNbrOfCols(row); col++){
		
				gridLabels[row][col].setText(String.valueOf(theGrid.getElement(row, col)));

			}
		}
	}
	
	/**
	 * Visar alla element i raden enligt argumentet grafiskt. 
	 * @param theRow Raden som ska visas.
	 */
	public void showRow(Array7 theRow){
		
		for (int i = 0; i < theRow.getLenght(); i++){
			JLabel lbl = new JLabel(String.valueOf(theRow.getElement(i)), SwingConstants.CENTER );
			lbl.setBackground(row_col_Color);
			
			customizeLabel(lbl);
		
			rowLabels[i] = lbl;
			rowPanel.add(lbl);			
		}
	}
	
	public void updateRow(Array7 theRow){
		
		for (int i = 0; i < theRow.getLenght(); i++){
			rowLabels[i].setText(String.valueOf(theRow.getElement(i)));		
		}
	}
	
	public void updateCol(Array7 theCol){
		
		for (int i = 0; i < theCol.getLenght(); i++){
			colLabels[i].setText(String.valueOf(theCol.getElement(i)));		
		}
	}
	
	/**
	 * Visar alla element i kolumnen enligt argumentet grafiskt. 
	 * 
	 * @param theCol Kolumnen som ska visas.
	 */
	public void showCol(Array7 theCol){
		
		for (int i = 0; i < theCol.getLenght(); i++){
			JLabel lbl = new JLabel(String.valueOf(theCol.getElement(i)), SwingConstants.CENTER  );
			lbl.setBackground(row_col_Color);;
			
			customizeLabel(lbl);
			
			colLabels[i] = lbl;
			colPanel.add(lbl);			
		}
		
	}
	public void customizeLabel(JLabel lbl){
		lbl.setPreferredSize(new Dimension(40, 40));
		lbl.setOpaque(true);
		lbl.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK), lbl.getBorder()));
	}

}
