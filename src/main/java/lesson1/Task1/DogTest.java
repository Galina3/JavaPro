package lesson1.Task1;

public class DogTest {

    public static void main(String[] args) {
        // объявление переменной
        int value;
        // инициализация переменной
        value = 5;
        // объявление переменной
        Dog smallDog;
        //инициализация переменной ( с созданием объекта)
        smallDog = new Dog();
        // объявление и инициализация
        Dog bigDog  = new Dog();

        smallDog.color = " черный";
        bigDog.color = " белый";

        System.out.println("Цвет маленькой собаки");
        System.out.println(smallDog.color);
        System.out.println("Цвет большой собаки" + bigDog.color);

        smallDog.sleep();
        bigDog.eat();

        Dog dog = new Dog(7);
       // System.out.println("возраст: " + dog.age);
        Dog dog1 = new Dog("Овчарка", 3.54);

        System.out.println(dog1.breed + "" + dog1.weight);

        Dog dog3 = new Dog();

         dog3.setAge(-3);
        System.out.println(dog3.getAge());

        dog3.setAge(9);
        System.out.println(dog3.getAge());
        System.out.println(dog.getAge());








    }
}
