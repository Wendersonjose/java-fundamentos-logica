public class Matriz {
    
    public static void main(String[] args) {
        
        String[][] clientes = {
            {"Pedro", "São Paulo"},
            {"Maria", "Curitiba"},
            {"Joaquim","Campinas"}
        };

        //System.out.println(clientes[0][0]);

        for(int indice = 0; indice <3; indice++){
            System.out.println("Nomes: " + clientes[indice][0]);
            System.out.println("Cidade: " + clientes[indice][1]);
            System.out.println();
        }
    }
}
