package lima.matheus.modelos;

public class Podcasts extends Audio implements Acoes {


    @Override
    public void reproduzir() {
        System.out.println("O podcast " + getTitulo() + "esta sendo reproduzido!");
        reprocucoesSoma(1);
    }

    @Override
    public void curtir() {
        System.out.println("Você curtiu " + getTitulo());
        curtidasSoma(1);
    }
}
