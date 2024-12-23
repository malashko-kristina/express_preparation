package complexTasks.library;

import lombok.Data;

@Data
public class Book {
    private final String title;
    private final int totalPages;
    private int currentPage;

    public Book(String title, int totalPages) {
        this.title = title;
        this.totalPages = totalPages;
        this.currentPage = 1;
    }

    public void turnPage(int pageNumber) {
        if (pageNumber >= 1 && pageNumber <= totalPages) {
            currentPage = pageNumber;
        } else {
            throw new IllegalArgumentException("Invalid page number.");
        }
    }
}
