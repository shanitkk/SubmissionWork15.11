import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        int amountNum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number in series ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the difference between the numbers in series ");
        int difference = scanner.nextInt();

        do {
            System.out.println("Enter the number of organs in the series  ");
            amountNum = scanner.nextInt();
        } while (amountNum <= 0);

        series(firstNum, difference, amountNum);
    }

    public static void series(int numFirst, int difference, int amountNum) {
        System.out.print("The invoice series is: ");
        for (int i = 1; i <= amountNum; ++i) {
            System.out.print(numFirst + " , ");
            numFirst += difference;
        }
    }

}
