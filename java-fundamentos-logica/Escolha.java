public class Escolha {

    public static void main(String[] args) {

        String cidade = "São Paulo";

    //Switch express

    String mensagem;
    switch(cidade){
        case "São Paulo":
            mensagem = "maior cidade do pais";
            break;
        case "Rio de Janeiro":
            mensagem = "Cidade de belas praias";
            break;
        default:
            mensagem = "cidade nao encontrada";
            break;
    }
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
