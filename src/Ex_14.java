import java.util.Locale;
import java.util.Scanner;

public class Ex_14 {

//Calcule média ponderada com operadores aritméticos.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        System.out.println((n >= 10 && n <= 20) ? true : false);

        sc.close();
    }
}