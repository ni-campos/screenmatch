package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmetch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return 0;
    }

    @Override
    public int getduracaoEmMinutos() {
        return 0;
    }

    @Override
    public int getClassificao() {
        return (int) pegaMedia() / 2;
    }
}
