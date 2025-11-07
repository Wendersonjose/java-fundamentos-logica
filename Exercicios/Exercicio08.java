
/*
    Peça um número, em seguida exiba a tabuada.
*/

import java.util.Scanner;

public class Exercicio08 {

    void main() {
        
        // Scanner
        Scanner obj = new Scanner(System.in);

        // Obter um número
        System.out.println("Informe um número");
        int numero = obj.nextInt();

        // Fecha o Scanner e libera os recursos associados ao stream de entrada (System.in)
        obj.close();

        // Tabuada
        int indice = 0;
        while(indice < 11){
            System.out.println(numero + " X " + indice + " = " + (numero * indice));
            indice++;
        }

    }
    
}