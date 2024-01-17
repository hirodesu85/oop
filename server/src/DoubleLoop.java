public class DoubleLoop {
  public static void main(String[] args) {
      int i = 0;
      while (i < 10) {
          int j = 0;
          while (j < 10) {
              if (i == j) {
                  System.out.print("X");
              } else {
                  System.out.print("-");
              }
              j++;
          }
          System.out.println("");
          i++;
      }
  }
}