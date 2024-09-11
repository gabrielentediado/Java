public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("testes");

        String hello = "Hello world!!";

        char primeiroCaractere = hello.charAt(0);
        String concat = hello.concat(hello);

        System.out.println(concat);

        for (int i = 1; i <= 5; i++){

            System.out.println(i);

        }
    }

    public static void matriz(){
        int rows = 4;
        int columns = 4;
        int[][] array = new int[rows][columns];
        int valor = 1;
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array[i][j] = valor;
                valor++;
            };
        };
    }


}