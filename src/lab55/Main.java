package lab55;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Tom", "grey", 5);
        Cat secondCat = new Cat("Garfield", "orange", 8);

        firstCat.play();
        firstCat.feed();
        firstCat.sleep();

        firstCat.niau();

        firstCat.getAge();
        firstCat.getName();
        firstCat.getColour();

        Employee e = new Employee();

    Scanner input = new Scanner(System.in);
    System.out.println("Introduceti datele angajatului: ");

    System.out.println("Introduceti numele: ");
    e.setName(input.nextLine());

    System.out.println("Introduceti mail: ");
    e.setEmail(input.nextLine());

    System.out.println("Introduceti hour rate: ");
    e.setHourRate(input.nextInt());

    System.out.println("Introduceti capacity: ");
    e.setCapacity(input.nextInt());

    System.out.println("Introduceti free days: ");
    e.setFreeDays(input.nextInt());


    }
}
