package ex06;

public class Loja extends Pagamento {

    @Override
    public void verificarDesconto(String formaPagamento, double valor) {
        
        if( formaPagamento == "À vista" && valor >= 100){
            System.out.println("R$ " + valor * 0.9);
        }else {
            System.out.println("R$ " + valor);
        }
    }
    


}
