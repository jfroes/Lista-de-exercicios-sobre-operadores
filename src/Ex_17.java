import java.util.Locale;
import java.util.Scanner;

public class Ex_17 {

//Compare duas strings com equals e mostre se são iguais.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira frase: ");
        String f1 = sc.next();

        System.out.print("Digite a segunda frase: ");
        String f2 = sc.next();

        System.out.println("As frases: \n" + f1 + "\n" + f2 + "\n" + "são iguais?");
        System.out.println("Resposta: " + (f1.equals(f2) ? "sim" : "nao"));

        sc.close();
    }
}