package homeWork31;

public class Person {


   private String fullName;
   private int age;


    public Person() {

    }

    public Person(String fullName,  int age ) {
        this.fullName = fullName;
        this.age = age;

    }
    public void move() {
        System.out.println("Такой-то " + fullName + " ходит");

    }
    public  void  talk() {
        System.out.println("Такой-то " + fullName + " говорит");
    }


    public static void main(String[] arg) {
        Person person1 = new Person();
        person1.fullName = "Alex";
        person1.age = 38;
        person1.move();
        Person person2 = new Person();
        person2.fullName = "Jon";
        person2.age = 65;
        person2.talk();

    }





}
