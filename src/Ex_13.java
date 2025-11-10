import java.util.Locale;
import java.util.Scanner;

public class Ex_13 {

//Calcule média ponderada com operadores aritméticos.

    public static void main(String[] args) {
        int peso1 = 20;
        int peso2 = 30;
        int peso3 = 50;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble() * peso1;

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble()  * peso2;

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble() * peso3;

        double somaNotas = nota1 + nota2 + nota3;
        int somaPesos = peso1 + peso2 + peso3;

        double mediaNotas = somaNotas / somaPesos;

        System.out.printf("A média ponderada é: %.2f", mediaNotas);

        sc.close();
    }
}