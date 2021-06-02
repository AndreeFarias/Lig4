package lig4;

public class Pessoa {
    //Atributo de pessoa
    protected String nome;

    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    //Sobrescreve método toString    
    @Override
    public String toString(){
        return "O nome do jogador é " + nome + ".";
    }
}
