import java.util.ArrayList;

public class Room {
    private int number;
    private int size;
    private ArrayList<Customer> occupants;
    private boolean clean;

    Room(int number, int size, boolean clean) {
        this.number = number;
        this.size = size;
        this.occupants = new ArrayList<Customer>();
        this.clean = clean;
    }

    void addOccupant(Customer occupant) {
        if(occupants.size()<size) {
            occupants.add(occupant);
            occupant.addFeedback(1);
        }
        else{
            occupant.addFeedback(-1);
            return;
        }
        if(clean){
            occupant.addFeedback(1);
        }
        else{
            occupant.addFeedback(-1);
        }
        clean=false;
    }

    void removeOccupant(Customer occupant) {
        if(occupants.contains(occupant)) {
            occupants.remove(occupant);
        }
    }
    void setClean(boolean input) {
        clean=input;
    }
    ArrayList<Customer> getOccupants() {
        return occupants;
    }
    int getNumber(){
        return number;
    }
}