import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        double degHour = scanner.nextDouble();

        //Determines hours and the minutes
        double currMins = degHour % 30 * 2;

        //Detemines the angle of min hand
        int angOfMin = (int) currMins * 360 / 60;
        System.out.println(angOfMin);

        // closing the scanner object
        scanner.close();
    }
}
