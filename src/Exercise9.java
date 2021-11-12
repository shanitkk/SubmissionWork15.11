import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int number = positiveNumber();
        System.out.print("The prime numbers are ");

        for (int i = 1; i <= number; ++i) {
            if (primeNumber(i)== false) {
                System.out.print(i + " , ");
            }
        }
    }

    public static boolean noResidue(int num1, int num2) {
        boolean answer;
        answer = (num1 % num2 == 0);
        return answer;
    }

    public static boolean primeNumber(int num) {
        boolean answerPrime = false;

        for (int i = 2; i < num; ++i) {
            answerPrime = noResidue(num, i);
            if (answerPrime == true) {
                break;
            }
        }

        return answerPrime;
    }

    public static int positiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int num;
        do {
            System.out.println("Enter positive number");
            num = scanner.nextInt();
        } while (num <= 0);

        return num;
    }
}
