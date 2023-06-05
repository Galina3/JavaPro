package homeWork31;

public class Phone {
    int number;
    String model;
    double weight;

    public  Phone( int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

    }

    public int getNumber() {

        return number;
    }

   public void receive(String caller) {

        System.out.println("Звонит" + caller);
    }








}
