
public class PlaneSeat{

    private int seatId;
    private int customerId;
    private boolean assigned;

    public PlaneSeat(){
        this(0);
    }

    public PlaneSeat(int seatid){
        this.seatId = seatid;
        this.assigned = false;
        this.customerId = 0;
    }

    public int getSeatID(){
        return this.seatId;
    }

    public int getCustomerID(){
        return this.customerId;
    }

    public boolean isOccupied(){
        return this.assigned;
    }

    public void assign(int cust_id){
        this.customerId = cust_id;
        this.assigned = true;
    }

    public void unAssign(){
        this.assigned = false;
    }
}