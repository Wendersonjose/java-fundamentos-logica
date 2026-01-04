package Extras;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    
    public static void main(String[] args) {
        
        //Queue

        Queue<String> nomes = new LinkedList<>();
        
        //Cadastrar 

        nomes.offer("Ana");
        nomes.offer("Beatriz");
        nomes.offer("Carla");
        nomes.offer("Daniel");
        nomes.offer("Ester");
        nomes.offer("Fabiano");

        //Exibir
        System.out.println(nomes);

        //Excluir

        nomes.poll();
        System.out.println(nomes);
    }
}
