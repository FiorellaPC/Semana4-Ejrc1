import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número entero entre 1 al 5: ");
        int numero = scan.nextInt();

        switch (numero){
            case 1: System.out.println("uno");break;
            case 2: System.out.println("dos");break;
            case 3: System.out.println("tres");break;
            case 4: System.out.println("cuatro");break;
            case 5: System.out.println("cinco");break;
        }
    }
}
