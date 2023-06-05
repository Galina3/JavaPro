package lesson2.Tast1;

public final class Dog  extends  LandAnimal{

    @Override
    public void move() {
        System.out.println("Собака бежит");
    }

    public  void bark() {
        System.out.println("Woof!");
    }

    @Override
    public void feed() {

        System.out.println("Собака ест мясо");
    }
}

