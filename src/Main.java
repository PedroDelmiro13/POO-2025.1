import java.util.Scanner;
public class Main {
    public static double calculaImc(double peso, double altura){
        Scanner sc = new Scanner(System.in);
         
           
        return peso/(altura * altura);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu peso");
        double peso = sc.nextDouble();
        System.out.println("Informe sua altura");
        double altura = sc.nextDouble();
    double result = calculaImc(peso, altura);
    System.out.println("O seu imc é " + result);
    }
}
