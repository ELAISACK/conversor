package com.alura.latam.conversor.temperaturecoversor;

import javax.swing.JOptionPane;

public class TemperatureConversorFunction {
	
TemperatureConversor Temperature = new TemperatureConversor();
	
	public void TemperatureConverter(double MyInput) {
    	String option = (JOptionPane.showInputDialog(null, "Choose an option to convert", "Temperature", JOptionPane.PLAIN_MESSAGE, null, new Object[] {
    			"From Celcius to Farenheit","From Celcius to Kelvin", "From Farenheit to Celcius",
    			"From Kelvin to Celcius","From Kelvin to Farenheit"}, "Selection")).toString();
        switch(option) {
        case "From Celcius to Farenheit":
        	Temperature.ConvertCelciusToFarenheit(MyInput);
        	break;
        case "From Celcius to Kelvin":
            Temperature.ConvertCelciusToKelvin(MyInput);
            break;
        case "From Farenheit to Celcius":
           Temperature.ConvertFarenheitToCelcius(MyInput);
           break;
        case "From Kelvin to Celcius":
           Temperature.ConvertKelvinToCelcius(MyInput);
           break;
        case "From Kelvin to Farenheit":
        	Temperature.ConvertKelvinToFarenheit(MyInput);
        	break;
        }
	}
}
