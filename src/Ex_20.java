import java.util.Locale;
import java.util.Scanner;

public class Ex_20 {

//Simule um cálculo de reajuste salarial com operadores aritméticos e percentuais.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double salarioBruto = sc.nextDouble();

        double inss = salarioBruto * 0.075;
        System.out.printf("\nDesconto INSS (7,5%%): %.2f", inss);

        double fgts = salarioBruto * 0.08;
        System.out.printf("\nDesconto INSS (8%%): %.2f", fgts);

        double valeTransporte = salarioBruto * 0.06;
        System.out.printf("\nDesconto INSS (6%%): %.2f", valeTransporte);

        double planoDeSaude = salarioBruto * 0.05;
        System.out.printf("\nDesconto INSS (5%%): %.2f", planoDeSaude);

        double descontos = inss + fgts + valeTransporte + planoDeSaude;
        double salarioLiquido = salarioBruto - descontos;

        System.out.printf("\nSalario liquido: %.2f", salarioLiquido);

    }
}