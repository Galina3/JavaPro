package lesson2.Tast1;

public abstract class Animal {
    int weight;
    private String privateField;

    public  Animal() {
        System.out.println("вызван конструктор");
    }

    public  abstract  void feed();

    private  void privateMethod() {
        System.out.println("Test");
    }

    public String getPrivateField() {
        return privateField;
    }

}
