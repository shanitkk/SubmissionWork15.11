import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        int open = 9;
        int close = 17;
        int openTuesday = 8;
        int closeTuesday = 12;
        int userEarlyHour;
        int userLateHour;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day you want to arrive");
        System.out.println("Pressure 1 - Sunday ,  2 - monday , 3 - tuesday  , 4 - wednesday , 5 - thursday");
        int userDay = scanner.nextInt();
        if (userDay < 1 || userDay > 7) {
            System.out.println("Weekdays are Sunday through Saturday");
        }
        if (userDay == 6 || userDay == 7) {
            System.out.println("On weekends the offices are closed");
        }

        if (userDay >= 1 && userDay <= 5 && userDay != 3) {
            System.out.println("Enter what is the earliest hour you can arrive between " + open + " until  " + close);
            userEarlyHour = scanner.nextInt();
            if (userEarlyHour >= 0 && userEarlyHour < 23) {
                if (userEarlyHour > 0) {
                    System.out.println("Enter what is the latest hour you can arrive");
                    userLateHour = scanner.nextInt();
                    if (userLateHour >= 0 && userLateHour <= 23) {
                        if (userLateHour > 0) {
                            if (userLateHour <= userEarlyHour) {
                                System.out.println(" Entering a valid value,The time range is incorrect");
                            } else if (userEarlyHour >= open && userLateHour < close) {
                                System.out.println("Confirmation notice - the offices are open ☺");
                            } else {
                                System.out.println("The offices are close - we are opening hours are:  " + open + " Until  " + close);
                            }
                        }
                    } else {
                        System.out.println("The time value you selected is invalid");
                    }
                }
            } else {
                System.out.println("The time value you selected is invalid");
            }
        }

        if (userDay == 3) {
            System.out.println("Enter what is the earliest hour you can arrive between " + openTuesday + " until  " + closeTuesday);
            userEarlyHour = scanner.nextInt();
            if (userEarlyHour >= 0 && userEarlyHour <= 23) {
                if (userEarlyHour > 0) {
                    System.out.println("Enter what is the latest hour you can arrive");
                    userLateHour = scanner.nextInt();
                    if (userLateHour >= 0 && userLateHour <= 23) {
                        if (userLateHour > 0) {
                            if (userLateHour <= userEarlyHour) {
                                System.out.println(" Entering a valid value,The time range is incorrect");
                            } else if (userEarlyHour >= openTuesday && userLateHour < closeTuesday) {
                                System.out.println("Confirmation notice - the offices are open ☺");
                            } else {
                                System.out.println("Opening hours are:  " + openTuesday + " Until  " + closeTuesday);
                            }
                        }
                    } else {
                        System.out.println("The time value you selected is invalid");
                    }
                }
            } else {
                System.out.println("The time value you selected is invalid");
            }
        }

    }

}
