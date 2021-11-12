import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number  ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter a second number  ");
        int secondNum = scanner.nextInt();
        int sum = firstNum + secondNum;
        if (sum % 2 == 0) {
            System.out.println("The num " + sum + " is dual");
        } else {
            System.out.println("The num " + sum + " is odd number");
        }

    }

}
