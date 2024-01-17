public class Print {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
            if (i > 5) {
                System.out.print("X");
            }
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
    }
}