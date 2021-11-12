import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        double firstNum = scanner.nextDouble();
        System.out.println("Enter second number ");
        double secondNum = scanner.nextDouble();
        System.out.println("Enter third number ");
        double thirdNum = scanner.nextDouble();
        if (firstNum >= secondNum && firstNum >= thirdNum) {
            if (secondNum >= thirdNum) {
                System.out.println(firstNum + " , " + secondNum + " , " + thirdNum);
            } else {
                System.out.println(firstNum + " , " + thirdNum + " , " + secondNum);
            }
        } else if (secondNum >= firstNum && secondNum >= thirdNum) {
            if (firstNum >= thirdNum) {
                System.out.println(secondNum + " , " + firstNum + " , " + thirdNum);
            } else {
                System.out.println(secondNum + " , " + thirdNum + " , " + firstNum);
            }
        } else if (firstNum >= secondNum) {
            System.out.println(thirdNum + " , " + firstNum + " , " + secondNum);
        } else {
            System.out.println(thirdNum + " , " + secondNum + " , " + firstNum);
        }

    }
}
