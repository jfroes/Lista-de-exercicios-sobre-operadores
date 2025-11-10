import java.util.Scanner;

public class Ex_3 {

// Leia dois valores e mostre qual é o maior usando operador ternário.

    public static void main(String[] args) {
        int n1;
        int n2;
        int maior;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        n2 = sc.nextInt();
        maior = (n1 > n2) ? n1 : n2;
        System.out.println("o maior é: " + maior );

        sc.close();
    }
}
