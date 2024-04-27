import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();



    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public Book searchBook(String bookString){
        //boolean found = books.contains(bookString)
        for (Book book :books){
            if (Objects.equals(book.getTitle(), bookString)){
                return book;
            }
            else if (Objects.equals(book.getAuthor(), bookString)){
                return book;
            }
        }
        return null;
    }

    public Book userBorrowBook(String bookString){
        Book book = searchBook(bookString);
        if(!book.isBorrowed()){
            book.setBorrowed(true);
            System.out.println("You borrowed the book: " + book.getTitle() + " By: " + book.getAuthor());
            return book;
        }
        else{
            System.out.println("The book is not currently available");
        }
        // no book
        return null;
    }

    public void displayCatelog(){
        if(books.isEmpty()){
            System.out.println("Catelog is currently empty at the library");
            return;
        }
        for (Book book:books){
            System.out.println(book.getTitle());
        }
    }
}
