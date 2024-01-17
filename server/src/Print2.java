public class Print2 {
    public static void main(String[] args) {
        String line = "ABC";
        for (int i = 1; i <= 10; i++) {
            System.out.print(line.charAt(i % 3));
            if (i % 4 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
    }
}