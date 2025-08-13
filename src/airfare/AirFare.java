package airfare;
import java.util.Scanner;

public class AirFare {

    
    public static void economic(int distance) {
        int epm = 250; 
        int tfare = epm * distance;
        if (distance > 1000) {
        int discount = (int)(tfare * 0.10); 
        tfare = tfare - discount;
        
    }
        System.out.println("Total Fare (Economic): " + tfare);
    }

    
    public static void business(int distance) {
    int bpm = 500; 
    int tfare = bpm * distance;

    if (distance > 1000) {
        int discount = (int)(tfare * 0.10); 
        tfare = tfare - discount;
        
    }

    System.out.println("Total Fare (Business): " + tfare);
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance;
        String travel;

        System.out.print("Distance (km): ");
        distance = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Class: ");
        travel = scanner.nextLine();

        if (travel.equals("1")) {
            economic(distance);
        } else if (travel.equals("2")) {
            business(distance);
        } else {
            System.out.println("Invalid class selected.");
        }

        scanner.close();
    }
}
