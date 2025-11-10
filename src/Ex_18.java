import java.util.Locale;
import java.util.Scanner;

public class Ex_18 {

//Mostre o maior entre três números usando operadores lógicos.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um número: ");
        int n1 = sc.nextInt();
        System.out.print("digite outro: ");
        int n2 = sc.nextInt();
        System.out.print("só mais um: ");
        int n3 = sc.nextInt();

        int maior;

        if (n1 > n2 &&  n1 > n3) {
            maior = n1;
        }else  if (n2 > n1 &&  n2 > n3) {
            maior = n2;
        }else{
            maior = n3;
        }

        System.out.println("o maior é: " + maior);

        sc.close();
    }
}