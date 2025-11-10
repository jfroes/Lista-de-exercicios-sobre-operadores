import java.util.Scanner;

public class Ex_6 {

// Inverta o valor de um booleano usando !

    public static void main(String[] args) {
        int idade;
        String possuiCnh;
        boolean result;


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.print("voce possui CNH? Digite S ou N: ");
        possuiCnh = sc.next();

        result = idade >= 18 && possuiCnh.toUpperCase().equals("S");
        System.out.println(!result);


        sc.close();
    }
}
