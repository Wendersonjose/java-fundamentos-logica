import java.util.Stack;

public class ExemploStack {
    public static void main(String[] args) {
        
        //Stack

        Stack<String> paginas = new Stack<>();

        //Cadastro
        paginas.push("www.google.com");
        paginas.push("www.bol.com");
        paginas.push("www.youtube.com");

        //Exibir registros
        System.out.println(paginas);

        //Excluir
        paginas.pop();
        System.out.println(paginas);

        // Peek
     
        System.out.println(paginas.peek());
    }
}
