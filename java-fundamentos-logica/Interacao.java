import java.util.Scanner;

public class Interacao {
    
    public static void main(String[] args) {
        
        // Criar um objeto da classe Scanner 

        Scanner obj = new Scanner(System.in);

        // Obter nome do usuário
        System.out.println("Digite seu nome: ");
        String nome = obj.nextLine();

        // Obter idade do usuário
        System.out.println("Digite sua idade: ");
        int idade = obj.nextInt();

        // Finalizar o objeto Scanner
        obj.close();

        // Concatenar e exibir a mensagem
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
    }
}
