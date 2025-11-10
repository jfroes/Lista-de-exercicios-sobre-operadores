import java.util.Scanner;

public class Ex_4 {

// Verifique se um número é par ou ímpar.

    public static void main(String[] args) {
        int n1;
        int sobra;
        String result;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o um numero: ");
        n1 = sc.nextInt();
        sobra = (n1 % 2);

        result = (sobra == 0) ? "par" : "Impar";
        System.out.println(n1 + " é: " + result);

        sc.close();
    }
}
