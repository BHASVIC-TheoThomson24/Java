public class Cleaner {
    private String name;

    Cleaner(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void cleanRoom(Room room) {
        room.setClean(true);
        System.out.println(name + " has cleaned room " + room.getNumber());
    }
}