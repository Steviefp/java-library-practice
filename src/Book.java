public class Book {
    private String title;
    private String author;
    private boolean borrowed;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void displayInfo(){
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("Status = " + (borrowed ? "Borrowed" : "Available"));
    }
}
