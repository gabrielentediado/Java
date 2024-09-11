package br.desafio;

public class Animal {
    String nome;
    float peso;

    Animal(String nome, float peso){
        this.nome=nome;
        this.peso=peso;
    }

    static void comer(float pesoAlimento, float pesoAnimal, String nome){
        float resultado =  pesoAlimento+pesoAnimal;
        System.out.println(nome);
        System.out.println("Peso resultante:"+resultado+"kg");
    }

}
