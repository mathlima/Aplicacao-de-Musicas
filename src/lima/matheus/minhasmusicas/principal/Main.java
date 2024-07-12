package lima.matheus.minhasmusicas.principal;

import lima.matheus.minhasmusicas.modelos.MinhasPreferidas;
import lima.matheus.minhasmusicas.modelos.Podcasts;
import lima.matheus.minhasmusicas.modelos.Musicas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instanciando podcast
        Podcasts podcasts1 = new Podcasts();
        podcasts1.setTitulo("Os sócios");
        podcasts1.setDuracao(120);
        podcasts1.setClassificacao(8);

        for (int i = 0; i < 1800; i++) {
            podcasts1.reproduzir();
        }

        for (int i = 0; i < 300; i++) {
            podcasts1.curtir();
        }

        for (int i = 0; i < 147; i++) {
            podcasts1.compartilhar();
        }
        podcasts1.exibeFichaTecnica();

        // Instanciando musica
        Musicas musica1 = new Musicas();
        musica1.setTitulo("A que saudades");
        musica1.setDuracao(4);
        musica1.setClassificacao(9);

        for (int i = 0; i < 2500; i++) {
            musica1.reproduzir();
        }

        for (int i = 0; i < 567; i++) {
            musica1.curtir();
        }

        for (int i = 0; i < 147; i++) {
            musica1.compartilhar();
        }

        musica1.exibeFichaTecnica();


        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica1);
        preferidas.inclui(podcasts1);

    }
}