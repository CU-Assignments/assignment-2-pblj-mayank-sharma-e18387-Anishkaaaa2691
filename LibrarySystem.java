class Book {
    String title;
    String author;
    double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nFiction Book Details:");
        super.displayDetails();
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nNon-Fiction Book Details:");
        super.displayDetails();
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Fiction f = new Fiction("Harry Potter", "J.K. Rowling", 500);
        NonFiction nf = new NonFiction("Sapiens", "Yuval Noah Harari", 700);

        f.displayDetails();
        nf.displayDetails();
    }
}
