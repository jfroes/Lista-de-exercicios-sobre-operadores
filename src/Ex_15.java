import java.util.Locale;
import java.util.Scanner;

public class Ex_15 {

//Use o operador ternário para classificar uma nota como “Aprovado” ou “Reprovado”.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma nota (corte >= 6): ");
        int n = sc.nextInt();

        System.out.println((n >= 6 ) ? "aprovado" : "reprovado");

        sc.close();
    }
}