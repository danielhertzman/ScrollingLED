package com.mah.message;

import com.mah.ScrollingLEDMessage.arrays.Array7x7;

/**
 * This class represents the characters as an integer 2D-arrays
 * @author Andrea Schremm, Daniel Hertzman-Ericson, Feby Triana Bergman, Henrik Ahlqvist, Nawzad Bako, Tanya Souresrafil
 *
 */
public class Characters {
	
	
	//Numbers
    private static int[][] char0 = {
        {0,0,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,0,1,1,1,0,0}};
        
    private static int[][] char1 = {
        {0,0,0,1,0,0,0},
        {0,0,1,1,0,0,0},
        {0,0,0,1,0,0,0},
        {0,0,0,1,0,0,0},
        {0,0,0,1,0,0,0},
        {0,0,0,1,0,0,0},
        {0,0,1,1,1,0,0}};
    
    private static int[][] char2 = {
        {0,0,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,0,0,0,0,1,0},
        {0,0,0,0,1,0,0},
        {0,0,0,1,0,0,0},
        {0,0,1,0,0,0,0},
        {0,1,1,1,1,1,0}};

    private static int[][] char3 = {
        {0,0,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,0,0,0,0,1,0},
        {0,0,0,1,1,1,0},
        {0,0,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,0,1,1,1,0,0}};

    private static int[][] char4 = {
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,1,1,1,1,0},
        {0,0,0,0,0,1,0},
        {0,0,0,0,0,1,0},
        {0,0,0,0,0,1,0}};

    private static int[][] char5 = {
        {0,1,1,1,1,1,0},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,0,0},
        {0,1,1,1,1,1,0},
        {0,0,0,0,0,1,0},
        {0,0,0,0,0,1,0},
        {0,1,1,1,1,1,0}};

    private static int[][] char6 = {
        {0,0,1,1,1,1,0},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,0,0},
        {0,1,1,1,1,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,1,1,1,1,0}};

    private static int[][] char7 = {
        {0,1,1,1,1,1,0},
        {0,0,0,0,0,1,0},
        {0,0,0,0,0,1,0},
        {0,0,0,0,1,0,0},
        {0,0,0,1,0,0,0},
        {0,0,1,0,0,0,0},
        {0,1,0,0,0,0,0}};
    

    private static int[][] char8 = {
        {0,0,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,0,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,0,1,1,1,0,0}};

    private static int[][] char9 = {
        {0,0,1,1,1,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,0,1,1,1,1,0},
        {0,0,0,0,0,1,0},
        {0,0,0,0,0,1,0},
        {0,0,0,0,0,1,0}};


    private static int[][] charA = {
        {0,0,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,1,1,1,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0}};
    
    private static int[][] charB = {
        {0,1,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,1,1,1,0,0}};
    
    private static int[][] charC = {
        {0,0,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,1,0},
        {0,0,1,1,1,0,0}};
    
    private static int[][] charD = {
        {0,1,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,1,1,1,0,0}};
    
    private static int[][] charE = {
        {0,1,1,1,1,1,0},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,0,0},
        {0,1,1,1,1,0,0},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,0,0},
        {0,1,1,1,1,1,0}};
    
    private static int[][] charF = {
        {0,1,1,1,1,1,0},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,0,0},
        {0,1,1,1,1,0,0},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,0,0}};
    
    
    
    private static int[][] charG = {
    	{0,1,1,1,1,1,0},
    	{0,1,0,0,0,0,0},
    	{0,1,0,0,0,0,0},
    	{0,1,0,1,1,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,1,1,1,1,0}};
    
    private static int[][] charH = {
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,1,1,1,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0}};
    
    private static int[][] charI = {
    	{0,1,1,1,1,1,0},
    	{0,0,0,1,0,0,0},
    	{0,0,0,1,0,0,0},
    	{0,0,0,1,0,0,0},
    	{0,0,0,1,0,0,0},
    	{0,0,0,1,0,0,0},
    	{0,1,1,1,1,1,0}};
    
    
    private static int[][] charJ = {
    	{0,1,1,1,1,1,0},
    	{0,0,0,0,0,1,0},
    	{0,0,0,0,0,1,0},
    	{0,0,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,1,1,1,1,0}};
    
    private static int[][] charK = {
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,1,0,0},
    	{0,1,0,1,0,0,0},
    	{0,1,1,0,0,0,0},
    	{0,1,0,1,0,0,0},
    	{0,1,0,0,1,0,0},
    	{0,1,0,0,0,1,0}};
    
    
    private static int[][] charL = {
    	{0,1,0,0,0,0,0},
    	{0,1,0,0,0,0,0},
    	{0,1,0,0,0,0,0},
    	{0,1,0,0,0,0,0},
    	{0,1,0,0,0,0,0},
    	{0,1,0,0,0,0,0},
    	{0,1,1,1,1,1,0}};

    
    private static int[][] charM = {
        {0,1,0,0,0,1,0},
        {0,1,1,0,1,1,0},
        {0,1,0,1,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0}};

    private static int[][] charN = {
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,1,0,0,1,0},
        {0,1,0,1,0,1,0},
        {0,1,0,1,0,1,0},
        {0,1,0,0,1,1,0},
        {0,1,0,0,0,1,0}};

    private static int[][] charO = {
        {0,0,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,0,1,1,1,0,0}};


    private static int[][] charP = {
        {0,1,1,1,1,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,1,1,1,1,0},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,0,0}};

    private static int[][] charQ = {
        {0,0,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,1,0,0},
        {0,0,1,1,0,1,0},
        {0,0,0,0,0,0,1}};
    
    private static int[][] charR = {
        {0,1,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,1,1,1,0,0},
        {0,1,0,0,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0}};

    private static int[][] charS = {
        {0,0,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,0,0},
        {0,0,1,1,1,0,0},
        {0,0,0,0,0,1,0},
        {0,0,0,0,0,1,0},
        {0,0,1,1,1,0,0}};

    private static int[][] charT = {
        {0,1,1,1,1,1,0},
        {0,0,0,1,0,0,0},
        {0,0,0,1,0,0,0},
        {0,0,0,1,0,0,0},
        {0,0,0,1,0,0,0},
        {0,0,0,1,0,0,0},
        {0,0,0,1,0,0,0}};

    private static int[][] charU = {
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,0,1,1,1,0,0}};

    private static int[][] charV = {
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,0,1,0,1,0,0},
        {0,0,1,0,1,0,0},
        {0,0,0,1,0,0,0}};
    
    
    private static int[][] charW = {
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,1,0,1,0},
    	{0,1,1,0,1,1,0},
    	{0,1,0,0,0,1,0}};
    
    private static int[][] charX = {
    	{0,1,0,0,0,1,0},
    	{0,0,1,0,1,0,0},
    	{0,0,1,0,1,0,0},
    	{0,0,0,1,0,0,0},
    	{0,0,1,0,1,0,0},
    	{0,0,1,0,1,0,0},
    	{0,1,0,0,0,1,0}};
    
    private static int[][] charY = {
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,0,1,0,1,0,0},
    	{0,0,0,1,0,0,0},
    	{0,0,0,1,0,0,0},
    	{0,0,0,1,0,0,0},
    	{0,0,0,1,0,0,0}};
    
    private static int[][] charZ = {
    	{0,1,1,1,1,1,0},
    	{0,0,0,0,0,1,0},
    	{0,0,0,0,1,0,0},
    	{0,0,0,1,0,0,0},
    	{0,0,1,0,0,0,0},
    	{0,1,0,0,0,0,0},
    	{0,1,1,1,1,1,0}};
    
    private static int[][] charÅ = {
    	{0,0,0,1,0,0,0},
    	{0,0,1,1,1,0,0},
    	{0,1,0,0,0,1,0},
    	{0,1,1,1,1,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0}};

    	    
     private static int[][] charÄ = {
    	{0,0,1,0,1,0,0},
    	{0,0,1,1,1,0,0},
    	{0,1,0,0,0,1,0},
    	{0,1,1,1,1,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0}};
     
     private static int [][] charÖ={
    	{0,0,1,0,1,0,0},
    	{0,0,1,1,1,0,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,1,0,0,0,1,0},
    	{0,0,1,1,1,0,0}};
    
     private static int[][] SPACE = {
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0}};
    
    private static int[][] DOT = {
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {1,0,0,0,0,0,0}};
    
    private static int[][] COMMA = {
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,1,0,0,0,0,0},
        {1,0,0,0,0,0,0}};
    
    private static int[][] EXCLAMATION = {
        {0,0,1,1,0,0,0},
        {0,0,1,1,0,0,0},
        {0,0,1,1,0,0,0},
        {0,0,1,1,0,0,0},
        {0,0,1,1,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,1,1,0,0,0}};
    
    private static int[][] QUESTION = {
        {0,0,1,1,0,0,0},
        {0,1,0,0,1,0,0},
        {0,0,0,0,1,0,0},
        {0,0,0,1,0,0,0},
        {0,0,0,1,0,0,0},
        {0,0,0,0,0,0,0},
        {0,0,0,1,0,0,0}};
    
    private static int[][] EQUAL = {
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0},
        {0,1,1,1,1,1,0},
        {0,0,0,0,0,0,0},
        {0,1,1,1,1,1,0},
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0}};
    
    private static int[][] PARANTHESISOPEN = {
        {0,0,0,1,1,0,0},
        {0,0,1,0,0,0,0},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,0,0},
        {0,1,0,0,0,0,0},
        {0,0,1,0,0,0,0},
        {0,0,0,1,1,0,0}};
    
    private static int[][] PARANTHESISCLOSE = {
        {0,0,1,1,0,0,0},
        {0,0,0,0,1,0,0},
        {0,0,0,0,0,1,0},
        {0,0,0,0,0,1,0},
        {0,0,0,0,0,1,0},
        {0,0,0,0,1,0,0},
        {0,0,1,1,0,0,0}};
    
    private static int[][] SLASH = {
        {0,0,0,0,0,0,0},
        {0,0,0,0,0,1,0},
        {0,0,0,0,1,0,0},
        {0,0,0,1,0,0,0},
        {0,0,1,0,0,0,0},
        {0,1,0,0,0,0,0},
        {0,0,0,0,0,0,0}};
    
    
    private static int[][] DOLLAR = {
        {0,0,0,1,1,0,0},
        {0,0,1,1,0,1,0},
        {0,1,0,1,0,0,0},
        {0,0,1,1,0,0,0},
        {0,0,0,1,1,0,0},
        {0,1,0,1,0,1,0},
        {0,0,1,1,1,0,0}};
    
    
    private static int[][] UNKNOWN = {
        {0,1,1,1,1,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,1,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,0},
        {0,1,1,1,1,1,0}};
 
	
	public static Array7x7 getChar(char chr) {
	    Array7x7 res;
	    chr = Character.toUpperCase(chr);
	    switch(chr) {
	        case 'A' : res = new Array7x7(charA); 
	        break;
	        case 'B' : res = new Array7x7(charB); 
	        break;
	        case 'C' : res = new Array7x7(charC); 
	        break;
	        case 'D' : res = new Array7x7(charD); 
	        break;
	        case 'E' : res = new Array7x7(charE); 
	        break;
	        case 'F' : res = new Array7x7(charF); 
	        break;
	        case 'G' : res = new Array7x7(charG); 
	        break;
	        case 'H' : res = new Array7x7(charH); 
	        break;
	        case 'I' : res = new Array7x7(charI); 
	        break;
	        case 'J' : res = new Array7x7(charJ); 
	        break;
	        case 'K' : res = new Array7x7(charK); 
	        break;
	        case 'L' : res = new Array7x7(charL); 
	        break;
	        case 'M' : res = new Array7x7(charM);
	        break;
	        case 'N' : res = new Array7x7(charN);
	        break;
	        case 'O' : res = new Array7x7(charO);
	        break;
	        case 'P' : res = new Array7x7(charP);
	        break;
	        case 'Q' : res = new Array7x7(charQ);
	        break;
	        case 'R' : res = new Array7x7(charR);
	        break;
	        case 'S' : res = new Array7x7(charS);
	        break;
	        case 'T' : res = new Array7x7(charT);
	        break;
	        case 'U' : res = new Array7x7(charU);
	        break;
	        case 'V' : res = new Array7x7(charV);
	        break;
	        case 'W' : res = new Array7x7(charW); 
	        break;
	        case 'X' : res = new Array7x7(charX); 
	        break;
	        case 'Y' : res = new Array7x7(charY); 
	        break;
	        case 'Z' : res = new Array7x7(charZ); 
	        break;
	        case 'Å' : res = new Array7x7(charÅ); 
	        break;
	        case 'Ä' : res = new Array7x7(charÄ); 
	        break;
	        case 'Ö' : res = new Array7x7(charÖ); 
	        break;
	        
	        //Numbers
	        case '0' : res = new Array7x7(char0);
	        break;
	        case '1' : res = new Array7x7(char1);
	        break;
	        case '2' : res = new Array7x7(char2);
	        break;
	        case '3' : res = new Array7x7(char3);
	        break;
	        case '4' : res = new Array7x7(char4);
	        break;
	        case '5' : res = new Array7x7(char5);
	        break;
	        case '6' : res = new Array7x7(char6);
	        break;
	        case '7' : res = new Array7x7(char7);
	        break;
	        case '8' : res = new Array7x7(char8);
	        break;
	        case '9' : res = new Array7x7(char9);
	        break;
	        
	        //Special
	        case ' ' : res = new Array7x7(SPACE);
	        break;
	        case '.' : res = new Array7x7(DOT);
	        break;
	        case ',' : res = new Array7x7(COMMA);
	        break;
	        case '!' : res = new Array7x7(EXCLAMATION);
	        break;
	        case '?' : res = new Array7x7(QUESTION);
	        break;
	        case '=' : res = new Array7x7(EQUAL);
	        break;
	        case '(' : res = new Array7x7(PARANTHESISOPEN);
	        break;
	        case ')' : res = new Array7x7(PARANTHESISCLOSE);
	        break;
	        case '/' : res = new Array7x7(SLASH);
	        break;
	        case '$' : res = new Array7x7(DOLLAR);
	        break;
	    
	        // övriga tecken, det blir en lång metod
	        default : res = new Array7x7(UNKNOWN); 	
	    }
	    return res; 
	}

}
