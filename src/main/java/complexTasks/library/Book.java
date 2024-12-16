package complexTasks.library;

public class Book {
    private String title;
    private int currentPage;

    public Book(String title) {
        this.title = title;
        this.currentPage = 1;
    }

    public String getTitle() {
        return title;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int page) {
        if (page < 1) {
            throw new IllegalArgumentException("Номер страницы должен быть положительным!");
        }
        this.currentPage = page;
    }
}