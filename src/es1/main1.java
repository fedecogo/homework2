package es1;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //parola ins
        System.out.println("Inserisci una parola:");
        String parola = scanner.nextLine();

        if (stringaPariDispari(parola)) {
            System.out.println("PARI!! la parola: '" + parola + "' è lunga " + parola.length() + " lettere");
        } else {
            System.out.println("DISPARI!!! la parola: '" + parola + "' è lunga " + parola.length() + " lettere");
        }


        System.out.println("inserisci anno:");
        int anno =  scanner.nextInt();

        if (annoBisestile(anno)){
            System.out.println("l'anno inserito è bisesitile ");
        } else  { System.out.println("l'anno inserito è non bisesistile");
        }
        scanner.close();
    }

    public static boolean stringaPariDispari(String s) {
        System.out.println(s.length() % 2 == 0); //true o false
        return s.length() % 2 == 0;
    }

    public static boolean annoBisestile (int n) {
        return  n % 4 == 0 ;

    }

}
