package br.com.dio;

import java.time.LocalDateTime;

public class Mensagem {
    public static void obterMensagem() {
        int hora = 9; //de manhã

        if (hora < 12){
            System.out.println("Bom dia!");
        }else if (hora<18){
            System.out.println("Boa tarde!");
        }else{
            System.out.println("Boa noite!");
        };

    }

}
