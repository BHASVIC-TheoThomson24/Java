public class Tortoise extends Reptile {

    Tortoise() {
        this.type = "Tortoise";
        this.legs = 4;
    }
    void move() {
        System.out.println("This animal walks");
    }
    void eat() {
        System.out.println("This animal is a herbivore");
    }
}