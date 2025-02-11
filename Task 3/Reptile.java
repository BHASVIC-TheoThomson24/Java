public abstract class Reptile extends Animal {

    public Reptile(){
        super();
        this.coldBlooded=true;
        this.skinType="scales";
        this.tail=true;
        this.hibernates=true;
    }
    void birth(){
        System.out.println("This animal lays eggs");
    }
}
