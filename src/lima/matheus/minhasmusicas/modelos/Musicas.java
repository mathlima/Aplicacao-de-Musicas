package lima.matheus.minhasmusicas.modelos;

public class Musicas extends Audio implements Acoes {
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void reproduzir() {
        System.out.println("\nVocê está ouvindo " + getTitulo() + " do artista " + getArtista());
        System.out.println("\n");
        reprocucoesSoma(1);
    }

    @Override
    public void curtir() {
        System.out.println("\nVocê acabou de curtir " + getTitulo() + " do artista " + getArtista());
        System.out.println("\n");
        curtidasSoma(1);
    }

    @Override
    public void compartilhar() {
        System.out.println("\nVocê acabou de compartilhar " + getTitulo() + " do artista " + getArtista());
        System.out.println("\n");
            somaCompartilhar(1);
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
