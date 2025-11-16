import java.util.LinkedList;

public class ExemploLinkedList {
    
    public static void main(String[] args) {
        //ArrayList: mais rapido e performatico, Leitura e melhor para grande dados

        //LinkedList: foco for cadastros e remocoes (First e Last) sempre que for remover primeiro e ultimo.

        //LinkedList
        LinkedList<String> cores = new LinkedList<>();

        // Cadastro
        cores.add("Azul");
        cores.add("Amarelo");
        cores.add("Verde");

        System.out.println(cores);

        //Alterar
        cores.set(1, "Branco");
        System.out.println(cores);

        //Remover
        cores.removeFirst();
        cores.removeLast();

        System.out.println(cores);
    }
}
