public class StarPattern {
    public static void main(String[] args) {
        int myInput = 5;

        for (int i = 1; i <= myInput; i++) {
            for (int j = 0; j < myInput - i; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }
            if (i > 1) {
                for (int o = 0; o < i - 1; o++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
