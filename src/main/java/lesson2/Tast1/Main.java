package lesson2.Tast1;

public class Main {
    public static void main(String[] args) {
        System.out.println("вызван конструктор");

        Dog dog = new Dog();
        dog.weight = 25;

        System.out.println(dog.weight);
        dog.move();


        System.out.println("Создаем кошку");
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();


        // Приватные поля не наследуются
//        dog.privateField = "asd";

        // И приватные методы тоже
//        dog.privateMethod();

       //  Через геттер можно
        dog.getPrivateField();

        // НЕльзя создать объект абстрактного класса
        // LandAnimal  landAnimal = new LandAnimal();

        int[] array = new int[5];
        array[0] = 7;
        // Нельзя добавить в массив данные другого типа
//        array[1] = "Hello";

        Cat[] cats = new Cat[5];
        cats[0] = new Cat();
        // Нельзя добавить в массив данные другого типа
//        cats[1] = new Dog();

        LandAnimal[] animals = new LandAnimal[4];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Snake();
        animals[3] = new Elephant();

        System.out.println("Работа с массивом сухопутных животных:");

        for (LandAnimal animal : animals) {
            animal.move();
        }

        Flyable[] flyingObjects = new Flyable[4];
        flyingObjects[0] = new Bird();
        flyingObjects[1] = new Airplane();
        flyingObjects[2] = new Airplane();
        flyingObjects[3] = new Bird();

        System.out.println("Работа с массивом летающих объектов:");

        for (Flyable currentObject : flyingObjects) {
            currentObject.fly();
        }






            }
        }



