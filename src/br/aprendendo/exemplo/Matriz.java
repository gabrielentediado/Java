package br.aprendendo.exemplo;

public class Matriz {
    private int linhas;
    private int colunas;
    private int[][] elementos;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.elementos = new int[linhas][colunas];
    }

    public void setElemento(int linha, int coluna, int valor) {
        this.elementos[linha][coluna] = valor;
    }

    public int getElemento(int linha, int coluna) {
        return this.elementos[linha][coluna];
    }

    public void imprimir() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(elementos[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matriz transpor() {
        Matriz transposta = new Matriz(colunas, linhas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta.setElemento(j, i, this.elementos[i][j]);
            }
        }
        return transposta;
    }
}

