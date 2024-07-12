package lima.matheus.minhasmusicas.modelos;

public class Podcasts extends Audio implements Acoes {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void reproduzir() {
        reprocucoesSoma(1);
    }

    @Override
    public void curtir() {
        curtidasSoma(1);
    }

    @Override
    public void compartilhar() {
        somaCompartilhar(1);
    }

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
