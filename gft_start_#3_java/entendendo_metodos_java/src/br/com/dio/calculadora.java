package br.com.dio;

import java.util.Scanner;

public class calculadora {

    public static void obter() {

        Scanner scan = new Scanner(System.in);
        int a, b;
        String operador ;
//        double valorInicial = 0;

        //System.out.println(mensagemPrimaria(oldRun,valorInicial));
        System.out.println("Bem vindo à calculadora do Diogo!");
        System.out.println("Primeiro...");
        System.out.println("Insira um valor. Só vale números hein? ;)");
        a = scan.nextInt();
        System.out.println(a);
        System.out.println("A seguir: some(+), subtraia(-), multiplique(*) ou divida (/)");
        operador = scan.next();
        System.out.println(a + " " +operador);
        b = scan.nextInt();
        System.out.println("Seu resultado é: " + calcular(a, b, operador));

    }

    //Dropped feature :c  Não pude fazer o main executar de novo

    //checa se o programa já calculou anteriormente ou se é novo
    /*private static Object mensagemPrimaria(boolean oldRun, double valorInicial) {
        if (oldRun) {
            return (valorInicial);
        }else{
            return ("Insira um novo valor!");
        }
    }*/

    //método para calcular: Checa qual operador foi inserido pelo usuário(com/company/Mensagem.java:21)
    private static double calcular(int a, int b, String operador){
        return switch (operador) {
            case "*" -> (a * b);
            case "/" -> (a / b);
            case "+" -> (a + b);
            case "-" -> (a - b);
            default -> 0;
        };
    }


}
