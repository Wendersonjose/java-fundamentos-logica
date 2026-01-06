package POO.polimorfismo2;

public class DescontoDesenvolvedor extends DescontoPadrao{
      // Impoto de Renda
      @Override
    public double impostoRenda(double salario){
        return salario * 0.12;

    }
}
