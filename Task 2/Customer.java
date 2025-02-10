public class Customer {
    private int roomBooking;
    private String name;
    private int feedback;

    Customer(int roomBooking, String name) {
        this.roomBooking = roomBooking;
        this.name = name;
        this.feedback = 0;
    }
    void addFeedback(int amount){
        this.feedback += amount;
    }
    int getFeedback(){
       return feedback;
    }
    String getName(){
        return name;
    }
    int getRoomBooking(){
        return roomBooking;
    }
}