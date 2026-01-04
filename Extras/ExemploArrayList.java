package Extras;

import java.util.ArrayList;

public class ExemploArrayList {

    public static void main(String[] args) {
        //ArrayList

        ArrayList<String> nomes = new ArrayList<>();

        //Cadastrar nomes

        nomes.add("Wellington");
        nomes.add("Vanessa");
        nomes.add("Ricardo");

        //Alterar nomes 
        nomes.set(1, "Paulo");

        //Remover nome
        nomes.remove(0);

        //Adicionar nome
        nomes.add("Felipe");

        //Quantidade de registros
        System.out.println("Registros: " + nomes.size());

        
        //Laço de repeticao para exibir os nomes

        for(String n : nomes){
            System.out.println(n);

        }
    }
}
