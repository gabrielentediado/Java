package br.aprendendo;
import java.util.Scanner;
//a classe consegue conter em si várias funções

//a difereça de colocar var e o tipo de dado, é que por inferência o programa não sabe qual o tipo de dado

public class Matriz {
    //esses são os atributos
    private int linhas;
    private int colunas;
    private int [][] elementos;
    //objeto para o scanner
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //a diferença é que no C, as structs não criam objetos, mas algo semelhante a registros
        //armazenam em um tipo de dados, várias variáveis
        //o new serve para instanciar, semelhante ao (struct Aluno aluno[];) ou (Struct Matriz matriz[][];)

        Matriz minhamatriz = new Matriz(3,3);
        minhamatriz.AdicionarElementos();
        minhamatriz.mostrarMatriz();
    }

    //parece as structs do C
    //contrutor
    public Matriz(int linhas, int colunas) {
        //o this serve para criar os objetos e apontar para os atributos
        this.linhas = linhas;
        this.colunas = colunas;
        this.elementos = new int[linhas][colunas];
    }

    public void AdicionarElementos(){

        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                System.out.println("Digite o número da linha:"+ i + "e coluna:" + j);
                elementos[i][j]= scanner.nextInt();
            };

        };
        scanner.close();

    }
    public void mostrarMatriz(){
        for (int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.print(elementos[i][j]);
            };
        System.out.println();
        };
    }

}
