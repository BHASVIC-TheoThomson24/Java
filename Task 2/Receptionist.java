import java.util.ArrayList;

public class Receptionist {
    private String name;

    Receptionist(String name) {
        this.name = name;
    }
    void checkIn(Hotel hotel, Customer customer) {
        hotel.getRooms().get(customer.getRoomBooking() - 1).addOccupant(customer);
        System.out.println(name + " checked in " + customer.getName());
    }
    void checkOut(Hotel hotel, Customer customer, Manager manager) {
        Room room=hotel.getRooms().get(customer.getRoomBooking() - 1);
        room.removeOccupant(customer);
        System.out.println(name + " checked out " + customer.getName());
        manager.takeFeedback(customer);
    }
}