import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the A number ");
        double a = scanner.nextDouble();
        System.out.println("Enter the B number ");
        double b = scanner.nextDouble();
        System.out.println("Enter the C number ");
        double c = scanner.nextDouble();
        double newB = b * b;
        double root = newB - 4.0D * a * c;
        double denominator = 2.0D * a;
        if (root < 0.0D) {
            System.out.println("No solution to a negative root");
        } else if (root == 0.0D) {
            newB = b * -1.0D;
            System.out.println("There is " + newB / denominator);
        } else {
            root = Math.sqrt(root);
            newB = b * -1.0D;
            System.out.println("There is 2 answer: ");
            double x1 = (newB + root) / denominator;
            double x2 = (newB - root) / denominator;
            System.out.println("x1 = " + x1 + "  , x2 = " + x2);
        }

    }
}
