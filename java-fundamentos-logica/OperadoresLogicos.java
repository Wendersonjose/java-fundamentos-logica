public class OperadoresLogicos {

    public static void main(String[] args) {
       
        //Variaveis 
        String formaPagamento = "à vista";
        double valor = 200;


        System.out.println( formaPagamento == "à prazo" || valor >= 100);

    }
    
}


//tabela verdade E (AND)
//V E V = V
//V E F = F
//F E V = F
//F E F = F 
//tabela verdade OU (OR)
//V OU V = V
//V OU F = V
//F OU V = V
//F OU F = F    

//tabela verdade NÃO (NOT)
//NÃO V = F
//NÃO F = V 

//Exemplos de uso dos operadores lógicos
//int idade = 20;
//boolean possuiCarteiraDeMotorista = true;
//boolean podeAlugarCarro = (idade >= 18) && possuiCarteiraDeMotorista; // operador E (AND)
//boolean estaChovendo = false;
//boolean podeDirigir = podeAlugarCarro && !estaChovendo; // operador E (AND) e NÃO (NOT)
