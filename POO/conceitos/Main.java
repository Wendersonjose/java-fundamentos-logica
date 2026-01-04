package POO.conceitos;

public class Main {
    
    
     public static void main(String[] args) {

        Pessoa p = new Pessoa();

        p.nome="Eduardo";
        p.idade=35;
        p.apresentacao();

        String situacao = p.situacaoIdade();
        System.out.println("A situacao da idade é: " + situacao);
        
    }
}
