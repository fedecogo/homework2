package es3;

        import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //parola ins

        do {
            System.out.println("Inserisci una parola:");
            String parolaDaDiv = scanner.nextLine();
            if (parolaDaDiv != (":q")){
                String[] lettere = parolaDaDiv.split(" ");
                System.out.println(String.join("",lettere));
            }

        } while (!parolaDaDiv != (":q"));
        System.out.println("ciao");

    }}



import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parolaDaDiv;

        do {
            System.out.println("Inserisci una parola:");
            parolaDaDiv = scanner.nextLine();

            if (!parolaDaDiv.equals(":q")) {
                String[] characters = parolaDaDiv.split("");
                System.out.println(String.join(",", characters));
            }
        } while (!parolaDaDiv.equals(":q"));

        System.out.println("Hai inserito ':q'. Il programma si è concluso.");
    }
}
