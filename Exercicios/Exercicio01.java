package Exercicios;

/*
 * Peça duas notas, exiba a média e a situacao
 * 
 * Media 7 ou superior  = Aprovado
 * Media inferior a 7 = Reprovado
*/

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        //Objeto da classe scanner
        Scanner obj = new Scanner(System.in);

        //Obter primeira nota 
        System.out.println("Informe a primeira nota");

        double nota1 = obj.nextDouble();

        //Obter segunda nota
        System.out.println("Informe a segunda nota");

        double nota2 = obj.nextDouble();

        //Fecha o Scanner e libera os recursos associados ao stream de entrada(System.in)
        obj.close();

        //Realizar a média
        double media = (nota1 + nota2) / 2;

        // Situacao

        if(media >=7 ){
            System.out.println("Aprovado com média: " + media);
        }else{System.out.println("Reprovado com média: " + media);

        }




    }
}
