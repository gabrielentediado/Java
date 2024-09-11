package br.aprendendo;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
//classe calculadora
//da para colocar várias funções dentro da classe

//operador ternario: ex:. String resultado = media >= 7 ? "Aprovado": "Reprovado";

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //JOptionPane mostra uma janela
        String menu_dialog = JOptionPane.showInputDialog("Digite:\n1-Calculadora de área\n2-Calculadora\n3-Velocidade média\n4-Matriz\n5-IMC\n6-temperatura\n7-calcular media do aluno\n8-sair");
        int menu =  Integer.parseInt(menu_dialog);
        escolha(menu);
    }
    public static void escolha(int menu){
        Scanner scanner = new Scanner(System.in);
        switch (menu){
            case 1:
                calculador_area();
                break;
            case 2:
                calcular();
                break;
            case 3:
                velocidade_media();
                break;
            case 4:
                System.out.println("Digite a altura da matriz");
                int altura = scanner.nextInt();
                System.out.println("Digite a largura da matriz");
                int largura = scanner.nextInt();
                scanner.close();
                Matriz novamatriz = new Matriz(altura, largura);
                break;

            case 5:
                imc();
                break;

            case 6:
                temperatura();
                break;
            case 7:
                media();
                break;
            case 8:
                System.out.println("Obrigado!");
                break;
        }

    }

    public static void media(){

        int [] notas = new int[0];
        String n = JOptionPane.showInputDialog("Digite a quantidade de notas:");
        int quantidade= Integer.parseInt(n);

        for (int i=0; i<quantidade;i++){
            String nota = JOptionPane.showInputDialog("Digite a: "+(i+1)+"° nota");
            int notaint = Integer.parseInt(nota);
            notas[i]=notaint;
        }
        String menu = JOptionPane.showInputDialog("Digite\n1-para mostrar notas\n2-calcular notas:");
        int menuNav= Integer.parseInt(menu);

        switch (menuNav){
            case 1:
                for (int i=0; i<quantidade; i++){
                    JOptionPane.showMessageDialog(null, "Nota:"+notas[i]);
                }
                break;
            case 2:
                int soma = 0;
                for (int i = 0; i < quantidade; i++) {
                    soma += notas[i];
                }
                double media = (double) soma / quantidade;
                JOptionPane.showMessageDialog(null, "Média: " + media);
                break;
        }

    }

    public static void imc(){
        String peso = JOptionPane.showInputDialog("Digite o peso:");
        double peso_1 =  Double.parseDouble(peso);
        String altura = JOptionPane.showInputDialog("Digite a altura:");
        double altura_1 = Double.parseDouble(altura);

        double resultado_imc = peso_1/(altura_1*2);

        DecimalFormat imc_valor = new DecimalFormat("#.###");

        if (resultado_imc < 18.5){
            JOptionPane.showMessageDialog(null, "Magreza\nResultado:" + imc_valor.format(resultado_imc));
        }else if(resultado_imc >= 18.5 && resultado_imc < 25.0){
            JOptionPane.showMessageDialog(null, "Normal\nResultado:" + imc_valor.format(resultado_imc));
        }else if(resultado_imc >= 25.0 && resultado_imc < 30.0){
            JOptionPane.showMessageDialog(null, "Sobrepeso\nResultado:" + imc_valor.format(resultado_imc));
        }else if(resultado_imc >= 30 && resultado_imc < 35){
            JOptionPane.showMessageDialog(null, "Obesidade grau I\nResultado:" + imc_valor.format(resultado_imc));
        }else if(resultado_imc >= 35 && resultado_imc < 40){
            JOptionPane.showMessageDialog(null, "Obesidade grau II\nResultado:" + imc_valor.format(resultado_imc));
        }else{
            JOptionPane.showMessageDialog(null, "Obesidade grau III\nResultado:" + imc_valor.format(resultado_imc));
        }

    }

    public static void calculador_area(){
        double raio;
        final double pi = 3.14159;
        System.out.println("Digite o raio:");
        Scanner scanner = new Scanner(System.in);
        raio = scanner.nextDouble();

        double area = pi * raio * raio;
        System.out.println("Área: " + area);
    }
    public static void calcular() {
        System.out.println("Digite o primeiro valor");
        Scanner scanner = new Scanner(System.in);
        double valor_1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor");
        double valor_2 = scanner.nextDouble();

        System.out.println("Digite a operação:\n1-somar\n2-subtrair\n3-multiplicar\n4-dividir");
        int operacao = scanner.nextInt();
        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = valor_1 + valor_2;
                break;
            case 2:
                resultado = valor_1 - valor_2;
                break;
            case 3:
                resultado = valor_1 * valor_2;
                break;
            case 4:
                if (valor_2 != 0) {
                    resultado = valor_1 / valor_2;
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }
    }
    public static void velocidade_media(){
        System.out.println("Digite a distância(em km)");
        Scanner scanner = new Scanner(System.in);
        double distancia = scanner.nextDouble();
        System.out.println("Digite o tempo(em horas)");
        double tempo = scanner.nextDouble();
        if (tempo != 0){
            double velocidade_media= distancia/tempo;
            System.out.println("velocidade média: " + velocidade_media + " km/h");
        }else{
            System.out.println("Digite um número que não seja 0");
        };
    }

    public static void temperatura(){

        String dialog = JOptionPane.showInputDialog("Digite\n'1' para calcular Fahrenheit\n'2' Para Celsius");
        int menu1 =  Integer.parseInt(dialog);
        switch (menu1){
            case 1:
                String celsiusD = JOptionPane.showInputDialog("Digite o valor em celsius \n");
                int Celsius =  Integer.parseInt(celsiusD);
                int Fahrenheit = (Celsius * 9/5) + 32;
                JOptionPane.showMessageDialog(null,"Resultado: " + Fahrenheit);
                break;
            case 2:
                String FarenD = JOptionPane.showInputDialog("Digite o valor em celsius \n");
                Fahrenheit =  Integer.parseInt(FarenD);
                Celsius = (Fahrenheit-32)*5/9;
                JOptionPane.showMessageDialog(null,"Resultado: " + Celsius);
                break;
        }
    }
}