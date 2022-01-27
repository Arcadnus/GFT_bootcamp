package br.com.dio;

import br.com.dio.model.Gato;

public class primeiro_programa {
    public static void main(String[] args) {



        Gato gato = new Gato();

        System.out.println(gato);

        livro livro1 = new livro("O pistoleiro", 300);
        System.out.println(livro1);

    }

}

class livro{
    private final String nome;
    private final Integer numPaginas;

    public livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

