package lima.matheus.modelos;

public class Musicas extends Audio implements Acoes {

    @Override
    public void reproduzir() {
        System.out.println("A musica " + getTitulo() + "esta sendo reproduzida!");
        reprocucoesSoma(1);
    }

    @Override
    public void curtir() {
        System.out.println("Você curtiu " + getTitulo());
        curtidasSoma(1);
    }

}
