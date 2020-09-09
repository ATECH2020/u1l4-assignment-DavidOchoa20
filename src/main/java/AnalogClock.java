import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        double degHour = scanner.nextDouble();

         /*
         *  your code goes here
         */
        double currMins = (degHour % 30) * 2;
        
        int angOfMin = (int) currMins * 6;
        
        System.out.print(angOfMin);

        // closing the scanner object
        scanner.close();
    }
}
