public class Filme {
    String nome;
    int anoDeLancamento;
    double duracaoEmMinutos;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDasAvaliacoes;

    void exibeFichaDoFilme() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDasAvaliacoes++;
    }

    double pegaMedia() {
        if (totalDasAvaliacoes == 0) {
            return 0;
        }
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }
}
