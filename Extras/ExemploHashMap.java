import java.util.HashMap;

public class ExemploHashMap {

    public static void main(String[] args) {

        //HAshMap

        HashMap<String, String> linguagens = new HashMap<>();

        //Cadastros
        linguagens.put("Java","Linguagem Multiplataforma.");
        linguagens.put("Html","Linguagem de marcação.");
        linguagens.put("CSS","Linguagem de stilos");

        //Exibir informações referente a linguagem Java

        System.out.println(linguagens.get("Java"));

        //Remoçao
        linguagens.remove("CSS");

        System.out.println(linguagens);

        
    }
}