package models;

public class TecAdm extends Usuario{
    private int  siape;
    private String nivelInstrucao;
    
    public TecAdm(String nome, String cpf, int idade, String email_pessoal, int siape, String nivelInstrucao){
        super(nome, cpf, idade, email_pessoal);
        this.siape = siape;
        this.nivelInstrucao = nivelInstrucao;
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
