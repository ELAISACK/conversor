package com.alura.latam.conversor.app;

import javax.swing.JOptionPane;

import com.alura.latam.conversor.coincoversor.CoinConversorFunction;
import com.alura.latam.conversor.temperaturecoversor.TemperatureConversorFunction;

public class App {
	public static void main(String[] args) {

		CoinConversorFunction coins = new CoinConversorFunction();
		TemperatureConversorFunction temperature = new TemperatureConversorFunction();
		
		  while(true) {
	        	
			  String options = (JOptionPane.showInputDialog(null, "Choose one type of conversion ", 
					  "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {
							  "Coin converter", "Temperature converter"}, "Selection")).toString();

			  switch(options) {
			  
	        	case "Coin converter":
	        		 String input = JOptionPane.showInputDialog("What is the amount of money you would like to convert? ");
	                 if(ValidateNumber(input) == true) {
	                     double MyInput = Double.parseDouble(input);
	                     coins.CoinConverter(MyInput);

	                     int answer = JOptionPane.showConfirmDialog(null,"Would you like to do another conversion?");
	                     if (JOptionPane.OK_OPTION == answer){
	                     	System.out.println("Select the affirmative option");
	                     }else{
	                        	JOptionPane.showMessageDialog(null, "Program ended");                         
	                     }

	                    } else {
	                        JOptionPane.showMessageDialog(null, "Invalid value");                
	                    }
	                     	break;
	        	

	        	 case "Temperature converter":
	        	 input = JOptionPane.showInputDialog("Enter the temperature value you would like to convert ");
	             if(ValidateNumber(input) == true) {
	                 double MyInput = Double.parseDouble(input);
	                 temperature.TemperatureConverter(MyInput);

	                 int respuesta = 0;
	                 respuesta = JOptionPane.showConfirmDialog(null, "Would you like to continue?");
	                 if((respuesta == 0) && (ValidateNumber(input) == true)) { 
	                 } else {
	                     JOptionPane.showMessageDialog(null, "Program ended");                     
	                 }

	             } else {
	                 JOptionPane.showMessageDialog(null, "Invalid value");                
	             }
	             break;
	        }                
	    }
	}
		  
		  public static boolean ValidateNumber(String input) {
		        try {
		            double x = Double.parseDouble(input);
		            if(x >= 0 || x < 0);
		                return true;
		            } catch (NumberFormatException e) {
		                return false;
		            }
		    
	}
		  
}
