import java.util.*;

public class Library {
    private String name;
    private String address;
    private List<Book> books;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        books = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
    public List<Book> getBooks() {
        return this.books;
    }
    public String getAddress() {
        return this.address;
    }

    public void addBook(Book libro){
        this.books.add(libro);
    }
}

class Book{
    private String ISBN;
    private String author;
    private int  pages;

    public Book(String ISBN,String author, int pages) {
        this.ISBN = ISBN;
        this.pages = pages;
        this.author = author;
    }

    public String getISBN() {
        return this.ISBN;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getPages() {
        return this.pages;
    }
}
