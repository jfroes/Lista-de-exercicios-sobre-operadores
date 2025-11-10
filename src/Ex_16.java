import java.util.Locale;
import java.util.Scanner;

public class Ex_16 {

//Simule um desconto de 10% sobre o preço final de um produto.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto : ");
        double preco = sc.nextDouble();

        double desconto = preco - preco * 0.10;

        System.out.printf("o valor com desconto de 10%% é: %.2f", desconto);

        sc.close();
    }
}