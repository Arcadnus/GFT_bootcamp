package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			int a, b;
			
			System.out.println("digite o primeiro valor");
			a= scan.nextInt();
			System.out.println("digite o segundo valor");
			b= scan.nextInt();
			
			int soma = soma(a,b);
			int subtracao = subtracao(a,b);
			int multiplicacao = multiplicacao(a,b);
			double divisao = divisao(a,b);

			System.out.println("Soma: "+a+"+"+b+" = "+soma);
			System.out.println("Subtracao: "+a+"-"+b+" = "+subtracao);
			System.out.println("Multiplicacao: "+a+"*"+b+" = "+multiplicacao);
			System.out.println("Divisao: "+a+"/"+b+" = "+divisao);
		}
		
	}
	
	public static int soma(int a, int b) {
		return a+b;
	}
	
	public static int subtracao(int a, int b) {
		return a-b;
	}
	
	public static double divisao(double a, double b) {
		return a/b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a*b;
	}
	
}
