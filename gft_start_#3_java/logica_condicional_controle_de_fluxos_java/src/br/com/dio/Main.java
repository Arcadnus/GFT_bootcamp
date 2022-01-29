package br.com.dio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mes;

        //pede ao usuario inserir o numero para o mes
        Scanner scan = new Scanner(System.in);
        System.out.println("Diga qual é 0 mês atualmente. (Em número)");
        mes = scan.nextInt();

        //dar nome ao mes e checar se é mes de ferias
        System.out.println(nomeMes(mes));
        System.out.println(checkFerias(mes));

        String semana = "quarta";

        System.out.println(checkSemana(semana));
        validadeSemana();

    }

    public static String checkFerias(int m){
        if (m == 1 || m == 12 || m == 7){
            return "Você está de férias!";
        }else{
            return "Você não está de férias...";
        }
    }

    public static String nomeMes(int m){ //int m se refere ao Mês
        return switch (m){
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Número Inválido";
        };
    }

    public static String  checkSemana( String semana) {
        return switch (semana){
            case "domingo" -> "1";
            case "segunda" -> "2";
            case "terça" -> "3";
            case "quarta" -> "4";
            case "quinta" -> "5";
            case "sexta" -> "6";
            case "sabado" -> "7";
            default -> "Data Inválida";
        };
    }

    public static void validadeSemana() {
        int semana = 4;
        switch (semana){
            case 1:
            case 2:
            case 3: {
                System.out.println("Certo");
            }
            case 4: {
                System.out.println("Errado");
            }
            case 5:{
                System.out.println("Talvez");
            }
        }
    }

}
