package br.desafio;

public class Fazenda {
    public static void main(String[] str){
        Alimento feno = new Alimento("Feno", 18);
        Alimento carne = new Alimento("Carne", 9);

        Animal porco = new Animal("Porco", 80);
        Animal vaca = new Animal("Vaca", 200);

        Animal.comer(carne.peso, vaca.peso, vaca.nome);
        Animal.comer(feno.peso, porco.peso, porco.nome);
        Animal.comer(8, 50, "bode");
    }

}
