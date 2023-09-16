package com.alura.latam.conversor.coincoversor;

import javax.swing.JOptionPane;

public class CoinToColon {
	
	public void ConvertDolarsToColon(double value) {
		double coinDolar = value * 530.10;
		coinDolar = (double) Math.round(coinDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "You have $ " + coinDolar + " Colones");
	}
	
	public void ConvertEurosToColon(double value) {
		double coinEuro = value * 565.80;
		coinEuro = (double) Math.round(coinEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "You have $ " + coinEuro + " Colones");
	}
	
	public void ConvertPundsToColon(double value) {
		double coinPunds = value * 656.58;
        coinPunds = (double) Math.round(coinPunds *100d)/100;
        JOptionPane.showMessageDialog(null, "You have $ " + coinPunds + " Colones");
	}
	
	public void ConvertYenToColon(double value) {
		double coinYen = value * 3.59;
        coinYen = (double) Math.round(coinYen *100d)/100;
        JOptionPane.showMessageDialog(null, "You have $ " + coinYen + " Colones");
	}
	
	public void ConvertWonToColon(double value) {
		double coinWon = value * 0.40;
        coinWon = (double) Math.round(coinWon *100d)/100;
        JOptionPane.showMessageDialog(null, "You have $ " + coinWon + " Colones");
	}
	
}
