package br.com.alura.screenmatch.modelos;

public abstract class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDasAvaliacoes;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDasAvaliacoes() {
        return totalDasAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = (int) duracaoEmMinutos;
    }

    public void exibeFichaDoFilme() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDasAvaliacoes++;
    }

    public double pegaMedia() {
        if (totalDasAvaliacoes == 0) {
            return 0;
        }
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }

    public abstract int getduracaoEmMinutos();
}

