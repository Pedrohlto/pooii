package br.com.pedro.aula1.exemploAnimais;

public class Animal {

    private String raca;
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String cor;
    private boolean disponivelParaAdocao;

    public void comer(String comida){
        System.out.println("Comendo " + comida);
    }

    public String getNome() {
        return nome;
    }

    public void emitirSom(){
        System.out.println("Emitindo som");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isDisponivelParaAdocao() {
        return disponivelParaAdocao;
    }

    public void setDisponivelParaAdocao(boolean disponivelParaAdocao) {
        this.disponivelParaAdocao = disponivelParaAdocao;
    }
}