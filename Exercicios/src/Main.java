import java.util.Scanner;

public class Main {

    public static int pedirMenu(String mensagem, int minItem, int maxItem) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println(mensagem);
            opcao = scan.nextInt();
        } while ((opcao < minItem) || (opcao > maxItem));

        return opcao;
    }

    public static double pedirNumero(String mensagem) {
        Scanner scan = new Scanner(System.in);
        System.out.println(mensagem);
        double num;
        num = scan.nextDouble();

        return num;
    }

    public static void main(String[] args) {
        int opcaoMenu = 4;

        do {
            opcaoMenu = pedirMenu("Qual exercício deseja ver: 1-Calculadora; 2-Mensagem; 3-Empréstimo; 4-Encerrar", 1, 4);

            if (opcaoMenu == 1) {
                double num01, num02;
                int operacaoCalc = pedirMenu("Qual operação deseja fazer (digite o número de 1-4): 1-Soma;2-Subtração; 3-Divisão; 4-Multiplicação", 1, 4);

                num01 = pedirNumero("Informe o primeiro número:");

                do {
                    num02 = pedirNumero("Informe o segundo número:");
                } while (num02 == 0 && operacaoCalc == 3);

                switch (operacaoCalc) {

                    case (1):
                        Calculadora.soma(num01, num02);
                        break;
                    case (2):
                        Calculadora.subtracao(num01, num02);
                        break;
                    case (3):
                        Calculadora.divisao(num01, num02);
                        break;
                    case (4):
                        Calculadora.multiplicacao(num01, num02);
                        break;
                }
            } else if (opcaoMenu == 2) {
                System.out.println("Exercício Mensagem");

                int hora = pedirMenu("Que horas são? (Apenas o valor inteiro da hora, 00 a 24):", 0, 24);

                Mensagem.mensagem(hora);

            } else if (opcaoMenu == 3) {
                System.out.println("Exercício empréstimo");
                double valorTotal = 0;
                do {
                    valorTotal = pedirNumero("Qual o valor que você deseja financiar?");
                } while (valorTotal < 0);

                int parcelas = pedirMenu("Em quantas parcelas deseja fazer?", 0, 10000);
                Emprestimo.calcular(valorTotal, parcelas);
            }

        } while (opcaoMenu != 4);

        System.out.println("Obrigada! :)");
    }
}


