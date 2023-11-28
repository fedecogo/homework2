package es2;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero:");
        int numero = scanner.nextInt();
        switch (numero) {
            case 0:
                System.out.println("Il numero inserito è zero");
                break;

            case 1:
                System.out.println("Il numero inserito è uno");
                break;

            case 2:
                System.out.println("Il numero inserito è due ");
                break;

            case 3:
                System.out.println("Il numero inserito è tre");
                break;

            default:
                System.out.println("Il numero inserito è diverso da 0,1,2,3");

        }
    }
}

