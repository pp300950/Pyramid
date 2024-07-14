public class StarPattern {
    public static void main(String[] args) {
        int myInput = 5;

        for (int i = 1; i <= myInput; i++) {
            if (i != 1) {
                for (int j = 1; j < i; j++) {
                    System.out.print("*");
                }
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
