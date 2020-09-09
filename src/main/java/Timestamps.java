import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int secInHour = 3600;
        int secInMin = 60;

        //Calcs seconds passed between both time stamps
        int secPassed = ((hours2 - hours1) * secInHour) + ((minutes2 - minutes1) * secInMin) + (seconds2 - seconds1);

        //Prints outcome
        System.out.print(secPassed);

        // closing the scanner object
        scanner.close();
    }
}
