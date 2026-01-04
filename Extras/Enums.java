package Extras;

enum Pagamentos{
    CARTAO_CREDITO,CARTAO_DEBITO,PIX
}


public class Enums {
    
    public static void main(String[] args) {
        
        Pagamentos pagamento = Pagamentos.CARTAO_CREDITO;
        
        System.out.println("Método de pagamento selecionado: " + pagamento);
        
            // enum e utilizado para selecionar algo predefinido, 
            //por exemplo os metodos de pagamentos 


    }
}
