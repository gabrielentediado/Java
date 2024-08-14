package br.aprendendo;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu_dialog = JOptionPane.showInputDialog("Digite:\n1-Calculadora de área\n2-Calculadora\n3-Velocidade média\n4-Matriz\n5-IMC\n6-sair");
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
                System.out.println("Obrigado!");
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
}