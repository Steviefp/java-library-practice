import java.util.ArrayList;
import java.util.Objects;

public class User {
    private ArrayList<Book> currentBooks = new ArrayList<Book>();
    private Library lib = null;

    public User(Library lib) {
        this.lib = lib;
    }

    public ArrayList<Book> getCurrentBooks() {
        return currentBooks;
    }

    public void borrowBook(String bookString){
        Book book = lib.userBorrowBook(bookString);
        if(book == null){
            System.out.println("Book is currently not available");
        }
        currentBooks.add(book);
    }

    public Book searchBook(String bookString){
        //boolean found = books.contains(bookString)
        for (Book book :currentBooks){
            if (Objects.equals(book.getTitle(), bookString)){
                return book;
            }
            else if (Objects.equals(book.getAuthor(), bookString)){
                return book;
            }
        }
        return null;
    }
    public void returnBook(String bookString){
        Book book = searchBook(bookString);
        book.setBorrowed(false);
        currentBooks.remove(book);
    }

    public void displayBooks(){
        if(currentBooks.isEmpty()){
            System.out.println("User currently does not have any borrowed books");
            return;
        }
        for (Book book:currentBooks){
            System.out.println(book.getTitle());
        }
    }
}
