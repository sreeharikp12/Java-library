import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (!book.isIssued()) {
                    book.issueBook();
                    System.out.println("Book issued: " + book.getTitle());
                } else {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book returned: " + book.getTitle());
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void showBooks() {
        System.out.println("\n----- Book List -----");
        for (Book book : books) {
            System.out.println(book.getId() + " - " + book.getTitle() + 
                (book.isIssued() ? " (Issued)" : " (Available)"));
        }
        System.out.println("---------------------\n");
    }
}
