package lima.matheus.principal;

import lima.matheus.modelos.Musicas;
import lima.matheus.modelos.Podcasts;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Podcasts podcasts1 = new Podcasts();
        podcasts1.setTitulo("Os sócios");
        podcasts1.setDuracao(120);
        podcasts1.setTotalReproducoes(10000);
        podcasts1.setCurtidas(120);
        podcasts1.setClassificacao(8);
        podcasts1.setClassificacao(9);
        podcasts1.setClassificacao(5);
        podcasts1.curtir();
        podcasts1.reproduzir();
        podcasts1.exibeFichaTecnica();

        Musicas musica1 = new Musicas();
        musica1.setTitulo("A que saudades");
        musica1.setDuracao(4);
        musica1.setTotalReproducoes(24632);
        musica1.setCurtidas(4743);
        musica1.setClassificacao(4);
        musica1.setClassificacao(8);
        musica1.setClassificacao(10);
        musica1.curtir();
        musica1.reproduzir();
        musica1.exibeFichaTecnica();

    }
}