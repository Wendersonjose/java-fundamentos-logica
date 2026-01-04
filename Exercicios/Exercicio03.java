package Exercicios;

/*
 * Peça dois números inteiros.
 * Se forem iguais, faça a soma, caso contrario faça a multiplicação.
 */

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int number1 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        int number2 = scanner.nextInt();

        scanner.close();

       int resultado = number1 == number2 ? number1 + number2 : number1 * number2;

       System.out.println(resultado);
        
    }
}