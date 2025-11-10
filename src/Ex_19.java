import java.util.Locale;
import java.util.Scanner;

public class Ex_19 {

//Converta temperatura de Celsius para Fahrenheit.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double temp = sc.nextDouble();

        double f = (temp * 1.8) + 32;

        System.out.printf("Essa temperatura em Fahrenheit é: %.2f", f);
        sc.close();
    }
}