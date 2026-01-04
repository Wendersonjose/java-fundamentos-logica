package Exercicios;


/*
    Crie um conversor de moedas.

    O cliente informa o tipo de conversão e o valor.

    Opções para conversão:
    1 - Dólar para Real.
    2 - Real para Dólar.
    3 - Euro para Real.
    4 - Real para Euro.

    Cotação sugerida:
    1 Dólar = R$5,50
    1 Euro  = R$6,00
*/

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner conversor = new Scanner(System.in);

        System.out.println("1 - Dólar para Real");

        System.out.println("2 - Real para Dólar");

        System.out.println("3 - Euro para Real");
        
        System.out.println("4 - Real para Euro");

        int tipoConversao = conversor.nextInt();

        System.out.println("Digite o Valor");


        double valor = conversor.nextDouble();

        conversor.close();

        switch(tipoConversao){
            case 1:
                System.out.println("R$" + (valor * 5.50));
            break;

            case 2:
                System.out.println("US$ " + (valor / 5.50));
            break;

            case 3:
                System.out.println("R$ " + (valor * 6));
            break;

            case 4:
                System.out.println("€ " + (valor / 6));
            break;
        }



     }
}