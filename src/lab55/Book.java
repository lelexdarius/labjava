package lab55;

public class Book {
    public String name;
    public String author;
    public String ISBN;

    public Book(String name, String author, String ISBN) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
