public class Gorilla extends Mammal{

    Gorilla() {
        this.type="Gorilla";
        this.coldBlooded = false;
        this.skinType = "fur";
        this.tail = false;
        this.legs = 2;
        this.arms = 2;
        this.wings = 0;
    }

    private void move() {
        System.out.println("This animal walks and climbs");
    }

    private void eat() {
        System.out.println("This animal is a herbivore");
    }

    private void birth() {
        System.out.println("This animal gives birth to live young");
    }

    public void getInfo() {
        System.out.println("Gorilla:");
        if (this.coldBlooded)
            System.out.println("This animal is cold-blooded");
        else
            System.out.println("This animal is warm-blooded");
        if (this.skinType != null)
            System.out.println("This animal is covered in " + this.skinType);
        if (this.tail)
            System.out.println("This animal has a tail");
        if (this.legs > 0)
            System.out.println("This animal has " + this.legs + " legs");
        if (this.arms > 0)
            System.out.println("This animal has " + this.arms + " arms");
        if (this.wings > 0)
            System.out.println("This animal has " + this.wings + " wings");
        this.move();
        this.eat();
        this.birth();
        System.out.println();
    }
}