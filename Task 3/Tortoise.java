public class Tortoise extends Reptile {

    Tortoise() {
        this.type="Tortoise";
        this.coldBlooded = true;
        this.skinType = "scales";
        this.tail = true;
        this.legs = 4;
        this.arms = 0;
        this.wings = 0;
    }

    private void move() {
        System.out.println("This animal walks");
    }

    private void eat() {
        System.out.println("This animal is a herbivore");
    }

    private void birth() {
        System.out.println("This animal lays eggs");
    }

    private void hibernate() {
        System.out.println("This animal hibernates");
    }

    public void getInfo() {
        System.out.println("Tortoise:");
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
        this.hibernate();
        System.out.println();
    }
}