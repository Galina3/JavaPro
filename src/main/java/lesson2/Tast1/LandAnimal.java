package lesson2.Tast1;

public  abstract class LandAnimal extends Animal{

    public  LandAnimal() {
        System.out.println("вызван конструктор");
    }

    public abstract void move();

    @Override
    public void feed() {
        System.out.println("Животное питается");
    }
}


