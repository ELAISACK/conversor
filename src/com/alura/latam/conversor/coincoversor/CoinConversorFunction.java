package com.alura.latam.conversor.coincoversor;

import javax.swing.JOptionPane;

public class CoinConversorFunction {
	
	ColonToCoin Coins = new ColonToCoin();
	CoinToColon Colon = new CoinToColon();
	
    public void CoinConverter(double MyInput) {
    	String option = (JOptionPane.showInputDialog(null, 
    			"Choose the coin you would like to convert to ", "Coins", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"From Colones to Dolars", "From Colones to Euros", "From Colones to British Punds", "From Colones to Yens","From Colones to Korean Wongs",
    			"From Dolars to Colones", "From Euro to Colones", "From British Punds to Colones","From Yens to Colones","From Korean Wongs to Colones"}, 
    			"Selection")).toString();
    	
        switch(option) {
        case "From Colones to Dolars":
        	Coins.ConvertColonToDolars(MyInput);
        	break;
        case "From Colones to Euros":
        	Coins.ConvertColonToEuros(MyInput);
        	break;
        case "From Colones to British Punds":
        	Coins.ConvertColonToPounds(MyInput);
        	break;
        case "From Colones to Yens":
        	Coins.ConvertColonToYen(MyInput);
        	break;
        case "From Colones to Korean Wongs":
        	Coins.ConvertColonToWon(MyInput);
        	break;    	    	                          
        case "From Dolars to Colones":
        	Colon.ConvertDolarsToColon(MyInput);
        	break;
        case "From Euro to Colones":
        	Colon.ConvertEurosToColon(MyInput);
        	break;
        case "From British Punds to Colones":
        	Colon.ConvertPundsToColon(MyInput);
        	break;
        case "From Yens to Colones":
        	Colon.ConvertYenToColon(MyInput);
        	break;
        case "From Korean Wongs to Colones":
            Colon.ConvertWonToColon(MyInput);
            break;
        }      
    }
	
}
