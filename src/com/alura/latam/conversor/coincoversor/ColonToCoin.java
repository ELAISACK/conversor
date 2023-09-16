package com.alura.latam.conversor.coincoversor;

import javax.swing.JOptionPane;

public class ColonToCoin {

	public void ConvertColonToDolars(double value) {
		double coinDolar = value * 0.0019;
		coinDolar = (double) Math.round(coinDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "You have $ " + coinDolar + " Dolars");
	}
	
	public void ConvertColonToEuros(double value) {
		double coinEuro = value * 0.0018;
		coinEuro = (double) Math.round(coinEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "You have € " + coinEuro + " Euros");
	}
	
	public void ConvertColonToPounds(double value) {
		double coinPunds = value * 0.0015;
        coinPunds = (double) Math.round(coinPunds *100d)/100;
        JOptionPane.showMessageDialog(null, "You have £ " + coinPunds + " British Pounds");
	}
	
	public void ConvertColonToYen(double value) {
		double coinYen = value * 0.28;
        coinYen = (double) Math.round(coinYen *100d)/100;
        JOptionPane.showMessageDialog(null, "You have ¥ " + coinYen + " Yen");
	}
	
	public void ConvertColonToWon(double value) {
		double coinWon = value * 2.51;
        coinWon = (double) Math.round(coinWon *100d)/100;
        JOptionPane.showMessageDialog(null, "You have ₩ " + coinWon + " Wons");
	}
	
}
