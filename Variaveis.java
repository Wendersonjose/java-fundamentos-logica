/*Regras de Variaiveis em Java
 * 1=> Nao conter caracteres especiais (Exceto _ e $)
 * 2=> Nao pode começar com numero
 * 3=> Nao pode ter espacos
 * 4=> Nao pode ser uma palavra reservada exemplos: int, double, float, public, static, void, class, etc.
 * 5=> Nao iniciar com letra maiuscula (Por convenção)
 */




public class Variaveis {
    
    public static void main(String[] args) {

        int idade = 25; // Variável válida
        char letra = 'A'; // Variável válida
        double salarioMensal = 3500.50; // Variável válida
        String nome_completo = "João Silva"; // Variável válida
        boolean isAtivo = true; // Variável válida

        // Exemplos de variáveis inválidas (comentadas para evitar erros de compilação)
        // int 1idade = 30; // Inválida: começa com número
        // double salario mensal = 4000.00; // Inválida: contém espaço
        // String class = "Teste"; // Inválida: palavra reservada

        System.out.println("Idade: " + idade);
        System.out.println("Salário Mensal: " + salarioMensal);
        System.out.println("Nome Completo: " + nome_completo);
        System.out.println("Está Ativo: " + isAtivo);
        System.out.println("Letra: " + letra);
        
    }
}
