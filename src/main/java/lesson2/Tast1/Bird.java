package lesson2.Tast1;

public class Bird  extends  Animal implements Flyable{
    @Override
    public void feed() {
        System.out.println("Птица клюет корм");

    }

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}
