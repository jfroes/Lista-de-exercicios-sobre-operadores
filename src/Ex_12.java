public class Ex_12 {

//Use +=, -=, *=, /= para atualizar valores dentro de um loop.

    public static void main(String[] args) {
        System.out.print("Loop 1: ");


        for (int i = 1; i <= 10; i++) {
            int count = i;
            System.out.println( count += i) ;

        }
        System.out.print("\nLoop 2: ");

        for(int j = 1; j <= 10; j++) {
            int count = j;
            System.out.println(count -= j) ;
        }

        System.out.print("\nLoop 3: ");
        for (int k = 1; k <= 10; k++) {
            int count = k;
            System.out.println(count *= k ) ;
        }

        System.out.print("\nLoop 4: ");
        for (int l = 1; l <= 10; l++) {
            int count = l;
            System.out.println(count /= l ) ;
        }
    }
}