public class Turtle extends Reptile {

    Turtle() {
        this.type = "Turtle";
        this.legs = 4;
    }
     void move() {System.out.println("This animal crawls and swims");}
     void eat() {System.out.println("This animal is an omnivore");}
}