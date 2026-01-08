import java.util.ArrayList;

public class Pessoa implements Padrao{
    ArrayList<String> nomes = new ArrayList<>(); 

    @Override
    public void cadastrar(String nome) {
       
        nomes.add(nome);
    }
    @Override
    public void listar() {
        
        for (String nome : nomes){
            System.out.println(nome);
        }
    }

}