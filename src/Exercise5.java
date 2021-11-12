import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int again = 9; // לטובת חישוב משכורת לעובד נוסף
        int userInput;
        double hour;
        int day;
        double salary;
        Scanner scanner = new Scanner(System.in);
        while (again == 9) {
            System.out.println("Pressure 0 for minor worker or enter 1 for senior employee");
            userInput = scanner.nextInt();
            while (userInput != 0 && userInput != 1) {
                System.out.println("Pressure 0 for minor worker or enter 1 for senior employee");
                userInput = scanner.nextInt();
            }
            System.out.println("Enter the number of hours of the employee "); // הכנס את כמות השעות
            hour = scanner.nextDouble();
            while (hour < 0) // בדיקת תקינות למספר שעות העבודה
            {
                System.out.println("The number of working hours cannot be negative");
                System.out.println("Enter the number of hours of the employee ");
                hour = scanner.nextInt();
            }
            System.out.println("Enter the number of days that reached the daily destination"); // כמות הימים שהגיע ליעד היומי
            day = scanner.nextInt();
            while (day < 0) // בדיקת תקינות למספר ימי תגמול
            {
                System.out.println("The number of daily destination cannot be negative");
                System.out.println("Enter the number of days that reached the daily destination");
                day = scanner.nextInt();
            }
            salary = salaryCalculation(userInput, hour, day);
            System.out.println("the salary is   " + salary);

            System.out.println("Would you like to calculate a salary for another employee? Press 9"); // חישוב שכר לעובד נוסף
            again = scanner.nextInt();
        }
        System.out.println("bye");
    }

    public static double salaryCalculation(int oneOrZero, double hourW, int dayW) {
        int hourMinorWorker = 50; // שכר עובד זוטר
        int hourSeniorWorker = 200; // שער עובד בכיר
        int daily = 250; // שכר ליום הגעה ליעד
        double salary;
        if (oneOrZero == 1) {
            salary = (hourSeniorWorker * hourW);
        } else {
            salary = (hourMinorWorker * hourW);
        }
        salary = salary + (daily * dayW);
        return salary;
    }
}