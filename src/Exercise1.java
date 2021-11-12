import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number  ");
        int userInput = scanner.nextInt();
        if (userInput > 0) {
            System.out.println("The Absolute value is " + userInput);
        } else if (userInput == 0) {
            System.out.println("The Absolute value is " + userInput);
        } else {
            userInput *= -1;
            System.out.println("The Absolute value is " + userInput);
        }
    }
}
