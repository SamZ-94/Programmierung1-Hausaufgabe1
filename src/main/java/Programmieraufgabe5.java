public class Programmieraufgabe5 {
    public static void main(String[] args) {
      int max = 5;

      for (int i = 1; i <= max; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
      for (int i = max - 1; i >= 1; i--) {
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
    }
}




