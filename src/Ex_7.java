import org.w3c.dom.ranges.Range;

import java.util.Scanner;

public class Ex_7 {

// Calcule o IMC (peso / altura²) e exiba se está dentro da faixa ideal.

    public static void main(String[] args) {

        double peso;
        double altura;
        double imc;


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        peso = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();

        imc =  peso / (altura * altura);

        System.out.printf("Seu imc é: %.2f " + rangeDePeso(imc), imc);
        sc.close();
    }

    public static String rangeDePeso(double imc){
        if(imc <= 18.5){
            return "Baixo peso";
        }else if(imc >= 18.5 && imc <= 24.9){
            return "Peso normal";
        }else if(imc >= 25 && imc <= 29.9){
            return "Sobrepeso";
        }else if(imc >= 30 && imc <= 34.9){
            return "Obesidade grau 1";
        }else if(imc >= 35 && imc <= 39.9){
            return "Obesidade grau 2";
        }
        return "Obesidade grau 3";
    }
}
