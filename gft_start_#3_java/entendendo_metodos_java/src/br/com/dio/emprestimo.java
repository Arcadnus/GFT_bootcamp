package br.com.dio;

public class emprestimo {
    public static void calculoEmprestimo() {
        int qtdParcela = 2;
        int valorEmprestimo = 5000;
        double totalPagar = calculoTotal(parcelaPagar(valorEmprestimo, qtdParcela), qtdParcela);
        System.out.println("Quantidade emprestada: " + valorEmprestimo);
        System.out.println("Quantidade de parcelas: " + qtdParcela);
        System.out.println("Será pago "
                + qtdParcela + " parcelas de "
                + parcelaPagar(valorEmprestimo, qtdParcela)+ " cada, por um total de "
                + totalPagar);
    }

    public static double calculoTotal(double parcela, int qtdParcela) {
        return parcela*qtdParcela;
    }
    public static double parcelaPagar(int valorEmprestimo, int qtdParcela) {
        return (valorEmprestimo/qtdParcela)*jurosSobreParcela(qtdParcela);
    }

    public static double jurosSobreParcela(int qtdParcela){
        return switch (qtdParcela){
            case 1 -> 1.05;
            case 2 -> 1.1;
            case 3 -> 1.15;
            default -> 1.05;
        };
    }
}
