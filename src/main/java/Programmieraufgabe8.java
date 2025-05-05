public class Programmieraufgabe8 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("     ");
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int Zeilen = 3;
        int maxBreite = 20;
        for (int i = 1; i <= Zeilen; i++) {
            if (i < Zeilen) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                int leerzeichen = maxBreite - 2 * i;
                for (int j = 0; j < leerzeichen; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            } else {
                for ( int j = 0; j < maxBreite; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}