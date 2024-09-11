package br.bibloteca;
//uma classe pode ter vários construtores
//o construtor não podem ter argumentos iguais, mas podem ter varios argumentos e objetos
public class BibliotecaConstructor {
    String nome;
    double preço;

    public static void main(String[] args){
        BibliotecaConstructor novolivro = new BibliotecaConstructor("Harry Potter");
        BibliotecaConstructor novolivropreco = new BibliotecaConstructor(50.00);

        //mostrarlivro(novolivro.nome);
        //ao usar o static não precisa instanciar, pode acessar o métedo da classe
        // se usar "final" não pode mudar o valor
        BibliotecaConstructor.mostrarlivro(novolivro.nome);
        System.out.println("Nome: " + novolivropreco.preço);
    }
    BibliotecaConstructor(String nome){
        this.nome = nome;
    }
    BibliotecaConstructor(double preço){
        this.preço = preço;
    }
    static void mostrarlivro(String Novolivro){
        System.out.println("Nome: " + Novolivro);
    }
}
