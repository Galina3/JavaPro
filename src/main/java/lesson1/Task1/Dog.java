package lesson1.Task1;

public class Dog {

    String breed;
  private   int age;
    String color;
    double weight;

    public Dog() {
        System.out.println("Вызван конструктор класса Dog");
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String breed, int age, String color, double weight) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Ошибка! Возраст не может быть отрицательным");
        }
        this.age = age;
    }

    public Dog(String  breed, double weight) {
        this.breed = breed;
        this.weight = weight;
    }


     public void sleep() {
        System.out.println("Собака спит");
    }

   public void eat() {
        System.out.println("Собака ест");
    }


}
