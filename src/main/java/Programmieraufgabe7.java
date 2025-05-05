import java.util.Scanner;
public class Programmieraufgabe7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Gib die erste Zahl ein:");
        int zahl = scan.nextInt();
        System.out.print("Gib die zweite Zahl ein:");
        int zahl2 = scan.nextInt();
        System.out.print("Gib die dritte Zahl ein:");
        int zahl3 = scan.nextInt();

        int groesste;

        if (zahl >= zahl2 && zahl2 >= zahl3) {
            groesste = zahl;
        } else if (zahl2 >= zahl && zahl2 >= zahl3) {
            groesste = zahl2;
        } else {
            groesste = zahl3;
        }
        System.out.println("Die groesste Zahl ist:" + groesste);
        }
    }
