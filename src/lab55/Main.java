package lab55;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5);
        Square square = new Square(6);
        triangle.desen();
        square.desen();

        List<Book> listaDeCarti = new ArrayList<>();

        listaDeCarti.add(new Book("Book1", "Author1", "121534"));
        listaDeCarti.add(new Book("Book2", "Author2", "121534"));
        listaDeCarti.add(new Book("Book3", "Author3", "dsdsfd34"));


        Book book1 = listaDeCarti.get(1); // element pozitia 2

        listaDeCarti.contains(book1); //true sau false

        listaDeCarti.forEach(element -> {
            System.out.println(element.getName());
        });

        listaDeCarti.stream()
                .filter(e -> e.getISBN().length() > 10)
                .map(e -> e.getAuthor())
                .collect(Collectors.toList());

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
