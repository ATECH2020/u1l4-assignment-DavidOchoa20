import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int degInHour;
        int currHour;
        int currMins;
        int angOfMin;
        int degHour = scanner.nextInt();

        //Determines hours and the minutes
        degInHour = 30;
        currHour = degHour / degInHour;
        currMins = degHour % degInHour * 2;

        //Detemines the angle of min hand
        angOfMin = currMins * 360 / 60;
        System.out.println(angOfMin);

        // closing the scanner object
        scanner.close();
    }
}
