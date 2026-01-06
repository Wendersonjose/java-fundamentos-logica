package POO.polimorfismo2;

public class Main {

    public static void main(String[] args) {
        
        //Criar um objeto
        DescontoPadrao obj = new DescontoPadrao();
        System.out.println("Imposto de Renda: " + obj.impostoRenda(1000));
        System.out.println("Vale transporte: " + obj.valeTransporte(1000));

        //Criar um objeto gerente
        DescontoPadrao obj2 = new DescontoGerente();
        System.out.println("Imposto de Renda: " + obj2.impostoRenda(100000));
        System.out.println("Vale transporte: " + obj2.valeTransporte(100000));

        //Criar um objeto Desenvolvedor 
        DescontoPadrao obj3 = new DescontoDesenvolvedor();
        System.out.println("Imposto de Renda: " + obj.impostoRenda(10000));
        System.out.println("Vale transporte: " + obj.valeTransporte(10000));
    }
    }

    

