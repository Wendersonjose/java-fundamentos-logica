package Exercicios;

/*
    Peça dois números inteiros e um tipo de cálculo.

    As opções de cálculos são:
    1 - Somar
    2 - Subtrair
    3 - Multiplicar
    4 - Dividir

    Em seguida, retorne o valor.
*/

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
         System.out.println("1 - Somar");

        System.out.println("2 - Subtrair");

        System.out.println("3 - Multiplicar");
        
        System.out.println("4 - Dividir");

        int tipoTeclado = teclado.nextInt();

        System.out.println("Digite o primeiro numero");

        double valor1 = teclado.nextDouble();

        System.out.println("Digite o segundo numero");

        double valor2 = teclado.nextDouble();

        double resultado = 0;

        switch (tipoTeclado) {
            case 1:
                resultado = valor1 + valor2;
                break;
            case 2:
                resultado = valor1 - valor2;
                break;
            case 3:
                resultado = valor1 * valor2;
                break;
            case 4:
                resultado = valor1 / valor2;
                break;
            default:
                System.out.println("Operacao invalida");
                teclado.close();
                return;
        }

        System.out.println("Resultado: " + resultado);

        teclado.close();
    }
}
