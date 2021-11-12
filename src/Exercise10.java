import java.util.Random;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Random random = new Random();
        int rnd = random.nextInt(1000) + 1;
        Scanner scanner = new Scanner(System.in);
        int counterA = 0;
        int counterB = 0;

        int userB;
        do {
            System.out.println("user A - Enter the number you think was drawn");
            int userA = scanner.nextInt();
            hint(rnd, userA);
            ++counterA;
            if (userA == rnd) {
                break;
            }

            System.out.println("user B - Enter the number you think was drawn");
            userB = scanner.nextInt();
            hint(rnd, userB);
            ++counterB;
        } while(userB != rnd);

        if ((counterA + counterB) % 2 == 0) {
            System.out.println("The winner is user B after " + counterB + " attempts");
        } else {
            System.out.println("The winner is user A after " + counterA + " attempts");
        }

    }

    public static void hint(int rnd, int answerUser) {
        if (answerUser > rnd) {
            System.out.println("The number " + answerUser + " is bigger than the number drawn");
        } else if (answerUser < rnd) {
            System.out.println("The number " + answerUser + " is smaller than the number drawn");
        }

    }
}
