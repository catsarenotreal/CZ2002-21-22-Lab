
import java.util.Scanner;


public class PlaneApp{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int choice;

        Plane plane = new Plane();

        do{
            System.out.println("\n(1) Show number of empty seats");
            System.out.println("(2) Show the list of empty seats");
            System.out.println("(3) Show the list of seat assignments by seat ID");
            System.out.println("(4) Show the list of seat assignments by customer ID");
            System.out.println("(5) Assign a customer to a seat");
            System.out.println("(6) Remove a seat assignment");
            System.out.println("(7) Exit");
            System.out.println("\nEnter the number of your choice: ");

            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    plane.showNumEmptySeats();
                    break;
                case 2:
                    plane.showEmptySeats();
                    break;
                case 3:
                    plane.showAssignedSeats(true);   
                    break;
                case 4:
                    plane.showAssignedSeats(false);
                    break;
                case 5:
                    int seatid, custid;
                    System.out.println("    Assigning Seat..");
                    System.out.print("Please enter SeatID: ");
                    seatid = sc.nextInt();
                    System.out.print("\nPlease enter Customer ID: ");
                    custid = sc.nextInt();
                    plane.assignSeat(seatid, custid);
                    break;
                case 6: 
                    System.out.print("Enter SeatID to unassign customer from: ");
                    seatid = sc.nextInt();
                    plane.unAssignSeat(seatid);
                    break;
                case 7:
                    break;    
            } 
        } while (choice < 7);
    }
}