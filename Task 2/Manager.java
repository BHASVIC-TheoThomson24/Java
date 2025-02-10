public class Manager {
    private String name;

    Manager(String name) {
        this.name = name;
    }
    void takeFeedback(Customer customer){
        int feedback = customer.getFeedback();
        if(feedback > 0){
            System.out.println(name+" says: " + customer.getName() + " Was happy with their stay");
        }
        if(feedback < 0){
            System.out.println(name+" says: " + customer.getName() + " Was unhappy with their stay");
        }
        if(feedback == 0){
            System.out.println(name+" says: " + customer.getName() + " found their stay ok");
        }
    }
}