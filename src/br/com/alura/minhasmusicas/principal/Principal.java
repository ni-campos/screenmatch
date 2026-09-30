package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Blue Eyes");
        musica.setCantor("Limp Bizkit");

        for (int i = 0; i<1000; i++){
            musica.reproduz();
        }
        for (int i = 0; i<50; i++){
            musica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setHost("Marcus Mendes");

        for (int i = 0; i<5000; i++){
            meuPodcast.reproduz();
        }
        for (int i = 0; i<1000; i++){
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(musica);
    }
}
