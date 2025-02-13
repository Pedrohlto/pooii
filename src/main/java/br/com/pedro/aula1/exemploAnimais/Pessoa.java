package br.com.pedro.aula1.exemploAnimais;

public class Pessoa {

    private String nome;
    private String telefone;
    private AdotavelInterface adotavel;

    public void adotar(AdotavelInterface adotavel){
        this.adotavel = this.adotavel;
    }

    public AdotavelInterface getAnimalAdotado(){
        return this.adotavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
