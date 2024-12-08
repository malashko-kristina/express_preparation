package javaTasks.library;

import lombok.Data;

@Data
public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public Book(String title, String author, int yearPublished, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = isAvailable;
    }

    public boolean borrowBook() {
        return this.isAvailable = false;
    }

    public boolean returnBook() {
        return this.isAvailable = true;
    }

    public String getBookInfo() {
        return "Book name: " + this.title + ";\n" + "Author: " + this.author
                + ";\n" + "Published year: " + this.yearPublished + ";\n" + "Availability: " + this.isAvailable + ".";
    }

}
