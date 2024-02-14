package projeto.minhasmusicas.principal.principal;

import projeto.minhasmusicas.principal.modelos.Musicas;
import projeto.minhasmusicas.principal.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();

        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();

        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
            
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();

        }

    }

}
