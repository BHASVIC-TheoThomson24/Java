public abstract class Mammal extends Animal {
    public Mammal() {
        super();
        this.skinType = "fur";
        this.coldBlooded = false;
    }
    void birth(){
            System.out.println("This animal gives birth to live young");
    }
}
