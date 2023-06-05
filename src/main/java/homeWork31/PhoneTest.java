package homeWork31;

public class PhoneTest {
    public static void main(String[] args) {

        Phone phone1 = new Phone(54525425,"Samsung", 150);
        Phone phone2 = new Phone(65235,"Sony", 150);
        Phone phone3 = new Phone(15684,"HTS", 150);

        phone1.receive(" Алекс");

        System.out.println("phone1 " + phone1.getNumber() + " model " + phone1.model);



    }
}
