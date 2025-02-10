import java.util.ArrayList;

public class Main {

    public Main() {
        Room room1 = new Room(1, 1, false);
        Room room2 = new Room(2, 2, false);
        Room room3 = new Room(3, 1, false);


        ArrayList<Room> hotel = new ArrayList<Room>();
        hotel.add(room1);
        hotel.add(room2);
        hotel.add(room3);
        Hotel myHotel=new Hotel(hotel);

        Customer customer1 = new Customer(1, "Mrs. White");
        Customer customer2 = new Customer(2, "Mr. Green");
        Customer customer3 = new Customer(2, "Miss. Scarlett");
        Customer customer4 = new Customer(3, "Mrs. Peacock");
        Customer customer5 = new Customer(2, "Prof. Plum");
        Customer customer6 = new Customer(3, "Col. Mustard");

        Receptionist receptionist = new Receptionist("Jane");
        Cleaner cleaner = new Cleaner("Michael");
        Manager manager = new Manager("Janhavi");

        receptionist.checkIn(myHotel, customer1);
        receptionist.checkIn(myHotel, customer2);
        receptionist.checkIn(myHotel, customer3);
        receptionist.checkOut(myHotel, customer1, manager);

        myHotel.cleanRooms(cleaner);

        receptionist.checkIn(myHotel, customer4);
        receptionist.checkOut(myHotel, customer4, manager);
        receptionist.checkIn(myHotel, customer5);
        receptionist.checkOut(myHotel, customer5, manager);
        receptionist.checkOut(myHotel, customer2, manager);
        receptionist.checkOut(myHotel, customer3, manager);

        myHotel.cleanRooms(cleaner);

        receptionist.checkIn(myHotel, customer6);
        receptionist.checkOut(myHotel, customer6, manager);
        Console.readLine();
    }

    public static void main(String[] args) {
        new Main();
    }
}