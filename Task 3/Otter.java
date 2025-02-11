public class Otter extends Mammal {

    Otter() {
        this.type = "Otter";
        this.tail = true;
        this.legs = 4;
    }
     void move() {
        System.out.println("This animal walks and swims");
    }
    void eat() {
        System.out.println("This animal is an omnivore");
    }
}