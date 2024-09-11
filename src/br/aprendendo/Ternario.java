package br.aprendendo;

//para variaveis usa o commumCase e para classe usa o PascalCase

import javax.swing.*;
import java.util.Arrays;

public class Ternario {
    public static void main(String[] args){
        int[] array={5,6,2,1,3,4,10,12,11};

        String nome = JOptionPane.showInputDialog("Digete seu nome");
        String resultado = nome.isEmpty() ? "nome vazio": "nome com dados";
        String resultado2 = nome.toUpperCase();

        System.out.println(resultado);
        System.out.println(resultado2);

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for(int i=array.length-1; i>0; i--){

            System.out.println(array[i]);

        }

    }
}
