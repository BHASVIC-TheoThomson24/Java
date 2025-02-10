import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;

    Hotel(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    void cleanRooms(Cleaner cleaner){
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getOccupants().isEmpty()) {
                cleaner.cleanRoom(rooms.get(i));
            }
        }
    }
    ArrayList<Room> getRooms() {
        return rooms;
    }
}