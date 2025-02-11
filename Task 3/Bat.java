public class Bat extends Mammal {

    Bat() {
        super();
        this.type = "Bat";
        this.tail = true;
        this.legs = 2;
        this.wings = 2;
        this.hibernates = true;
    }
    void move() {
        System.out.println("This animal flies");
    }
    void eat() {
        System.out.println("This animal is an omnivore");
    }

}
