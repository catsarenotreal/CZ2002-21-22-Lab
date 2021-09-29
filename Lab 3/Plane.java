
import java.util.Scanner;

public class Plane{

    private PlaneSeat[] seat = new PlaneSeat[12];    
    
    private int numEmptySeat;

    public Plane(){
        for (int i = 0; i < 12; i++){
            seat[i] = new PlaneSeat(i + 1);
            // System.out.println("SeatID " + seat[i].getSeatID());
        };
    }

    private PlaneSeat[] sortSeats(){ // done
        PlaneSeat dummy; int dummyid;
        PlaneSeat[] sorted = seat.clone();

        for (int i = 0; i < 12; i++){
            for (int j = i; j > 0; j--){
                if (sorted[j].getCustomerID() < sorted[j-1].getCustomerID()){
                    dummy = sorted[j];
                    sorted[j] = sorted[j-1];
                    sorted[j-1] = dummy;
                }
                else break;
            }
        }

        return sorted;
    }

    public void showNumEmptySeats(){ // done
        numEmptySeat = 0;
        for (int i = 0; i < 12; i++){
            if (seat[i].isOccupied() == false){
                numEmptySeat++;                
            }
        }
        System.out.println("There are " + numEmptySeat + " empty seats");
    }

    public void showEmptySeats(){ // done
        System.out.println("The following seats are empty: ");
        for (int i = 0; i < 12; i++){
            if (seat[i].isOccupied() == false){
                System.out.println("SeatID " + seat[i].getSeatID());                
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId){ // done
        if (bySeatId == true){
            for (int i = 0; i < 12; i++){
                if (seat[i].isOccupied() == true){
                    System.out.println("SeatID " + seat[i].getSeatID() + " assigned to CustomerID " + seat[i].getCustomerID());
                }
            }
        }
        else{
            PlaneSeat[] sorted = sortSeats();
            for (int i = 0; i < 12; i++){                
                if (sorted[i].isOccupied() == true){
                    System.out.println("SeatID " + sorted[i].getSeatID() + " assigned to CustomerID " + sorted[i].getCustomerID());
                }
            }
        }
    }

    public void assignSeat(int seatId, int cust_id){ // done
        if (seat[seatId - 1].isOccupied() == true){
            System.out.println("\nSeat already assigned to a customer.");
        }
        else{
            seat[seatId - 1].assign(cust_id);
            System.out.println("\nSeat assigned!");
        }
    }

    public void unAssignSeat(int seatId){ // done
        if (seat[seatId - 1].isOccupied() == true){
            seat[seatId - 1].unAssign();
            System.out.println("\nSeat unassigned!");
        }
        else{
            System.out.println("Seat is already not assigned.");
        }
    }
}