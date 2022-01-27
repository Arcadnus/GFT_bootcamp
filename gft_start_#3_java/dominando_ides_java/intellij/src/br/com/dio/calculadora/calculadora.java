package br.com.dio.calculadora;

import org.w3c.dom.ls.LSInput;

import java.text.MessageFormat;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;

        System.out.println("Digite o primeiro valor:");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        b = scan.nextInt();

        int somar = somar(a,b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("Somar: " +somar);
        System.out.println("Subtração: "+subtrair);
        System.out.println("Multiplicação: "+multiplicar);
        System.out.println("Divisão: " + dividir);

    }



    public static int somar(int a, int b){
        return a+b;
    }
    public static int subtrair(int a, int b){
        return a-b;
    }
    public static int multiplicar(int a, int b){
        return a*b;
    }
    public static int dividir(int a, int b){
        return a/b;
    }



}
