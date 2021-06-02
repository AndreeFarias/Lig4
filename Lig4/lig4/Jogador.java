package lig4;

public class Jogador extends Pessoa{
    //Atributos de Jogador
    private int numero;

    //Getter e Setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Construtor
    public Jogador(String nome, int numero) {
        super(nome);
        this.numero = numero;
    }
    
    //Sobrescreve método toString
    @Override
    public String toString(){
        return "(" + numero + ") " + super.toString();
    }
}
