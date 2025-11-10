import java.util.Locale;
import java.util.Scanner;

public class Ex_10 {

// Crie uma expressão que retorne true se o número for múltiplo de 3 ou 5.
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n % 3 == 0 ||  n % 5 == 0 ) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }


        sc.close();
    }
}