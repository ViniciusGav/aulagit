package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculadora minha = new Calculadora();

        System.out.println("Digite um numero");
        double num1 = ler.nextDouble();

        System.out.println("Digite um numero");
        double num2 = ler.nextDouble();

        System.out.println("Digite a operação desejada: 1-somar 2-subtrair 3-multiplicar 4-dividir");
        int ver = ler.nextInt();

        switch (ver){
            case 1:
                double resultSoma = minha.somar(num1,num2);
                System.out.println("Resultado da Soma é... " + resultSoma);
                break;
            case 2:
                double resultSub = minha.subtrair(num1,num2);
                System.out.println("Resultado da Subtração é... " + resultSub);
                break;
            case 3: double resultMultiplicacao = minha.multiplicar(num1,num2);
                System.out.println("Resultado da Multiplicação é... " +resultMultiplicacao);
                break;

            case 4: double resultDividir = minha.dividir(num1,num2);
                System.out.println("Resultado da Divisão é..." + resultDividir);
                break;

            default:
                System.out.println("Digite um numero entre 1 e 4");
        }
    }
}
