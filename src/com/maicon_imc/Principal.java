package com.maicon_imc;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		double peso,altura,imc;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Cálculo do IMC");
		
		System.out.print("Digite o seu peso: ");
		peso = teclado.nextDouble();
		System.out.print("Digite a sua altura: ");
		altura = teclado.nextDouble();
		
		imc = peso / (altura *  altura);
		
		System.out.println("IMC: "+ formatador.format(imc));
		teclado.close();
	}
}
