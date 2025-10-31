public class Escolha {

    public static void main(String[] args) {

        String cidade = "São Paulo";

        //Switch express

        String mensagem = switch(cidade){
            case "São Paulo"-> "maior cidade do pais";
            case "Rio de Janeiro" -> "Cidade de belas praias";
            default -> "cidade nao encontrada";

       
        };
             System.out.println(mensagem);

        // Estrutura de Escolha
     /*/   switch (cidade) {
            case "São Paulo":
                System.out.println("A maior cidade do pais");

                break;

            case "Rio de Janeiro":
                System.out.println("Cidade de belas praias");

            default:
                System.out.println("Cidade nao encontrada");
                break;
        }*/



    }
}
