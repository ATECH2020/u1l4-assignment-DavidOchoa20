import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        System.out.println("Students in group 1: ");
        int group1Count = scanner.nextInt();
        System.out.println("Students in group 2: ");
        int group2Count = scanner.nextInt();
        System.out.println("Students in group 3: ");
        int group3Count = scanner.nextInt();

        //Calcs desks Needed
        int deskSpace = 2;
        int deskNeeded = (group1Count / deskSpace + group2Count / deskSpace + group3Count / deskSpace);
        if (group1Count % deskSpace != 0) deskNeeded++;
        if (group2Count % deskSpace != 0) deskNeeded++;
        if (group3Count % deskSpace != 0) deskNeeded++;

        //Outputs
        System.out.println("Desks Needed: " + deskNeeded);
        

        // closing the scanner object
        scanner.close();
    }
}
