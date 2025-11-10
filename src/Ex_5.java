import java.util.Scanner;

public class Ex_5 {

// Faça uma expressão lógica que retorne true se uma pessoa for maior de idade e tiver CNH.

    public static void main(String[] args) {
        int idade;
        String possuiCnh;
        boolean result;


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.print("voce possui CNH? Digite S ou N: ");
        possuiCnh = sc.next();

        System.out.println(possuiCnh.toUpperCase());

        result = idade >= 18 && possuiCnh.toUpperCase().equals("S");

        System.out.println(result);


        sc.close();
    }
}
