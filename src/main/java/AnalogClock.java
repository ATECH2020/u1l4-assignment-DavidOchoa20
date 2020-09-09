import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        System.out.println("Degree of the hour hand: ");
        int degHour = scanner.nextInt();

        //Determines hours and the minutes
        int degInHour = 30;
        int currHour = degHour / degInHour;
        int currMins = degHour % degInHour * 2;
        System.out.println("Current Time: " + currHour + ":" + currMins);

        //Detemines the angle of min hand
        int angOfMin = currMins * 360 / 60;
        System.out.println("Angle of minute hand: " + angOfMin);

        // closing the scanner object
        scanner.close();
    }
}
