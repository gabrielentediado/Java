package br.collections;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<User> usuarios = new ArrayList<>();
        User u1 = new User("gabriel", "grilo", "gabriel@gmail.com");
        usuarios.add(u1);
        //pode ser feito sem variável
        usuarios.add(new User("gab", "grilado","grilado@gmail.com"));
        System.out.println(usuarios.stream().count());
        System.out.println(usuarios.get(1).nome);

        for (User usuario : usuarios){
            System.out.println("nome "+ usuario.nome);
        }
    }
}
