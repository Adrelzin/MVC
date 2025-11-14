package models;

public class Aluno extends Usuario {
    private String matricula;
    private int anoConclusaoFundamental;
    private Escola escolaOrigem;

    public Aluno(String nome, String cpf, int idade, String matricula, String email_pessoal) {
        super(nome, cpf, idade, email_pessoal);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoConclusaoFundamental() {
        return anoConclusaoFundamental;
    }

    public void setAnoConclusaoFundamental(int anoConclusaoFundamental) {
        this.anoConclusaoFundamental = anoConclusaoFundamental;
    }

    public Escola getEscolaOrigem() {
        return escolaOrigem;
    }

    public void setEscolaOrigem(Escola escolaOrigem) {
        this.escolaOrigem = escolaOrigem;
    }
}
