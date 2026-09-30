import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmetch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmetch.calculos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme novoFilme = new Filme();

        novoFilme.setNome("Gato de Botas");;
        novoFilme.setAnoDeLancamento(2021);
        novoFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + novoFilme.getDuracaoEmMinutos());

        novoFilme.exibeFichaDoFilme();

        novoFilme.avalia(8);
        novoFilme.avalia(6);
        novoFilme.avalia(7);

        System.out.println("Média das avaliações: " + novoFilme.pegaMedia());

        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.setNumero(666);
        contaBancaria.setSaldo(500);
        contaBancaria.titular="Nicole";

        System.out.println("Número da conta: " + contaBancaria.getNumero());
        System.out.println("Saldo da conta: " + contaBancaria.getSaldo());
        System.out.println("Titular da conta: " + contaBancaria.titular);

        contaBancaria.setSaldo(1500);
        System.out.println("Novo Saldo da conta: " + contaBancaria.getSaldo());

        IdadePessoa idadePessoa1 = new IdadePessoa();

        idadePessoa1.setIdade(18);
        idadePessoa1.setNome("Nicole");

        IdadePessoa idadePessoa2 = new IdadePessoa();

        idadePessoa2.setIdade(15);
        idadePessoa2.setNome("Vitória");

        System.out.println(idadePessoa1.getNome() + " tem " + idadePessoa1.getIdade() + " anos");
        idadePessoa1.verIdadePessoa();

        System.out.println(idadePessoa2.getNome()+ " tem " + idadePessoa2.getIdade() + " anos");
        idadePessoa2.verIdadePessoa();

        Livro livro1 = new Livro();
        livro1.setTitulo("Verity");

        Livro livro2 = new Livro();
        livro2.setTitulo("O lado feio do amor");

        Aluno aluno1 = new Aluno("Guilherme", 7.5,8.0,9.2);
        Aluno aluno2 = new Aluno("Rebeca", 7.0,5.0,3.2);

        System.out.println("Aluno 1: " + aluno1.getNome());
        System.out.println("Nota da primeira prova: " + aluno1.getNota1());
        System.out.println("Nota da segunda prova: " + aluno1.getNota2());
        System.out.println("Nota da terceira prova: " + aluno1.getNota3());
        System.out.println("Média final: " + aluno1.calcularMedia());
        System.out.println("Aluno 2: " + aluno2.getNome());
        System.out.println("Nota da primeira prova: " + aluno2.getNota1());
        System.out.println("Nota da segunda prova: " + aluno2.getNota2());
        System.out.println("Nota da terceira prova: " + aluno2.getNota3());
        System.out.println("Média Final: " + aluno2.calcularMedia());

        Serie greysAnatomy = new Serie();
        greysAnatomy.setNome("Greys Anatomy");
        greysAnatomy.setEpisodiosPorTemporadas(10);
        greysAnatomy.setAnoDeLancamento(2006);
        greysAnatomy.setDuracaoEmMinutos(100);
        greysAnatomy.setTemporadas(19);
        greysAnatomy.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Greys Anatomy: " + greysAnatomy.getduracaoEmMinutos());


        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar");;
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(outroFilme);
        calculadora.inclui(greysAnatomy);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro= new FiltroRecomendacao();
        filtro.filtra(new Filme());

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(greysAnatomy);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
        
    }
}
