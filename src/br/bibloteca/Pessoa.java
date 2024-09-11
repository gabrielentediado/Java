package br.bibloteca;
//array de objetos
public class Pessoa {
    String nome;
    int idade;

    public static void main(String[] str){
        Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = new Pessoa("Gabriel", 20);
        pessoas[1] = new Pessoa("Victor", 30);
    }
    //lembrar que isso é um construtor
    Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

}
