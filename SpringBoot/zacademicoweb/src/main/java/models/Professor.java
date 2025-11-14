package models;

public class Professor extends Usuario{
    private String areaFormacao;
    private int siape;
    private String nivelInstrucao;

    public Professor(String nome, String cpf, int idade, String email_pessoal, String areaFormacao, int siape, String nivelInstrucao){
        super(nome, cpf, idade, email_pessoal);
        this.areaFormacao = areaFormacao;
        this.siape = siape;
        this.nivelInstrucao = nivelInstrucao;
    }

    public String getAreaFormacao() {
        return this.areaFormacao;
    }

    public void setAreaFormacao(String areaFormacao) {
        this.areaFormacao = areaFormacao;
    }

    public int getSiape() {
        return this.siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public String getNivelInstrucao() {
        return this.nivelInstrucao;
    }

    public void setNivelInstrucao(String nivelInstrucao) {
        this.nivelInstrucao = nivelInstrucao;
    }
}
