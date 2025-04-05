public class Dinossauro {
    private String nome;
    private String nomeCientifico;
    private String periodo;
    private String clado;
    private String familia;
    private String tribo;
    private String genero;

    private String descricao;

    public Dinossauro(String nome, String nomeCientifico, String periodo, String clado, String familia, String tribo, String genero, String descricao) {
        this.nome = nome;
        this.nomeCientifico = nomeCientifico;
        this.periodo = periodo;
        this.clado = clado;
        this.familia = familia;
        this.tribo = tribo;
        this.genero = genero;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getClado() {
        return clado;
    }

    public void setClado(String clado) {
        this.clado = clado;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getTribo() {
        return tribo;
    }

    public void setTribo(String tribo) {
        this.tribo = tribo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
