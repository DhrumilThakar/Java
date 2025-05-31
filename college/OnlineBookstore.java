import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineBookstore {
    private HashMap<Integer, Book> bookCatalog = new HashMap<>();
    private ArrayList<Book> cart = new ArrayList<>();

    public OnlineBookstore() {
        bookCatalog.put(1, new Book("Java Programming", 20.00));
        bookCatalog.put(2, new Book("Python Crash Course", 30.00));
        bookCatalog.put(3, new Book("Data Structures and Algorithms", 40.00));
    }
    public void browseBooks() {
        System.out.println("Available Books:");
        for (int id : bookCatalog.keySet()) {
            System.out.println(id + ". " + bookCatalog.get(id).getTitle());
        }
    }
    public void addToCart(int bookId) {
        if (bookCatalog.containsKey(bookId)) {
            cart.add(bookCatalog.get(bookId));
            System.out.println("Book added to cart!");
        } else {
            System.out.println("Book not found!");
        }
    }
    public void checkout() {
        double totalCost = 0.0;
        System.out.println("Checking out...");
        for (Book book : cart) {
            totalCost += book.getPrice();
        }
        System.out.println("Total cost: $" + totalCost);
    }

    public static void main(String[] args) {
        OnlineBookstore bookstore = new OnlineBookstore();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the online bookstore!");
            System.out.println("1. Browse books");
            System.out.println("2. Add book to cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookstore.browseBooks();
                    break;
                case 2:
                    System.out.println("Enter the book ID to add to cart:");
                    int bookId = scanner.nextInt();
                    bookstore.addToCart(bookId);
                    break;
                case 3:
                    bookstore.checkout();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}