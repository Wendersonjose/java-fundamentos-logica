package ex03;

public class Media {

    //Construtor 
    public Media(double nota1, double nota2){
        double media = (nota1+nota2)/2;
        System.out.println("A média é " + media);
    }
     //Construtor 
    public Media(double nota1, double nota2,double nota3){
        double media = (nota1+nota2+nota3)/3;
        System.out.println("A média é " + media);
    }
     //Construtor 
    public Media(double nota1, double nota2,double nota3, double nota4){
        double media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("A média é " + media);
    }
}
