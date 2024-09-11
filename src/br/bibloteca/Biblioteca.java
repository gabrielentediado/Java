package br.bibloteca;

//com o construtor padrão

public class Biblioteca {
    String nomeLivro;
    String autorNome;
    int id;

    public static void main(String[] args){
        Biblioteca livro1 = new Biblioteca();

        livro1.nomeLivro = "Harry potter";
        livro1.autorNome = "Jk";
        livro1.id = 1234;

        System.out.println(livro1.id);

        Biblioteca livro2 = new Biblioteca();

        livro2.nomeLivro = "1984";
        livro2.autorNome = "Orwell";
        livro2.id = 5555;


        System.out.println(livro2.id);

    }

}
