/*
 * Peça tres numeros inteiros, em seguida retorne o menor informado 
 */

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Digite Primeiro numnero inteiro");
        int number1 = obj.nextInt();

        System.out.println("Digite o Segundo numero inteiro");
        int number2 = obj.nextInt();

        System.out.println("Digite o Terceiro numero inteiro");
        int number3 = obj.nextInt();

        obj.close();

        if(number1 < number2 && number1 < number3){
            System.out.println("O menor numero é o numero : " + number1);
        }else if(number2 < number1 && number2 < number3){
            System.out.println("O menor numero é o numero : " + number2);
        }else{
            System.out.println("O menor numero é o numero : " + number3);
        }


        
    }
}
