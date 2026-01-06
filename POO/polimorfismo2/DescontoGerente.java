package POO.polimorfismo2;

public class DescontoGerente extends DescontoPadrao{
    
      // Impoto de Renda
      @Override
    public double impostoRenda(double salario){
        return salario * 0.15;

    }
}
