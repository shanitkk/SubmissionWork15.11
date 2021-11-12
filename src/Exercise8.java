import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int numberOfAsterisk = number();
        asterisk(numberOfAsterisk);
    }

    public static int number() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter number between 5 until 20");
            num = scanner.nextInt();
        } while (num < 5 || num > 20);

        return num;
    }

    public static void asterisk(int star) {
        for (int j = 1; j <= star; ++j) {
            for (int i = 1; i <= j; ++i) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
