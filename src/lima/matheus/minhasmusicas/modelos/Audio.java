package lima.matheus.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalReproducoes;
    private int curtidas;
    private double classificacao;
    private int somaCurtidas;
    private int somaReproducoes;
    private int somaClassificacao;

    public void avalia(int nota) {
        somaClassificacao += nota;
        classificacao++;
    }

    public void curtidasSoma(int curtida) {
        somaCurtidas += curtidas;
        curtidas++;
    }

    public void reprocucoesSoma(int reproducao) {
        somaReproducoes += reproducao;
        totalReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome: " + this.titulo);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Total de reproduções: " + this.totalReproducoes);
        System.out.println("Total de curtidas: " + this.curtidas);
        System.out.println("Classificação: " + this.classificacao);
    }


}
