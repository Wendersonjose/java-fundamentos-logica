package POO.heranca;

public class Colaborador extends Pessoa {

    private String cargo;
    private double salario;

    public Colaborador(String nome, int idade, String cargo, double salario) {
        super(nome, idade); // 👈 herança correta
        this.cargo = cargo;
        this.salario = salario;
    }

    protected void mensagemColaborador() {
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }

    public void exibirDados() {
        mensagemPessoa();
        mensagemColaborador();
    }
}
