public class Main {
    public static void main(String[] args){
        // init
        Library lib = new Library();
        Book book = new Book("the cat in the hat", "Dr. Seuss");
        Book book2 = new Book("green eggs and ham", "Dr. Seuss");
        Book book3 = new Book("fox in socks", "Dr. Seuss");
        User user = new User(lib);
        User user2 = new User(lib);
        //lib.displayCatelog();

        // adding books to lib
        lib.addBook(book);
        lib.addBook(book2);
        lib.addBook(book3);

        lib.displayCatelog();
        //book.displayInfo();
        user.borrowBook("the cat in the hat");
        user.displayBooks();
        user.borrowBook("green eggs and ham");
        user.displayBooks();
    }
}
