import java.util.Locale;
import java.util.Scanner;

public class Ex_11 {

//Calcule o valor de uma expressão combinando &&, || e !.

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean resultado = (a && b) || !c;
        System.out.println(resultado);
    }
}