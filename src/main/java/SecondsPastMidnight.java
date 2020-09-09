import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int number = scanner.nextInt();

        int secInMin = 60;
        int secInHour = 3600;
        int hourPassed = number / secInHour;
        int minPassed = number / secInMin;
        System.out.print(hourPassed + " " + minPassed);


        // closing the scanner object
        scanner.close();
    }
}
