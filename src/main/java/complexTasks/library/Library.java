package complexTasks.library;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Library {

    private Map<String, Book> books;
    private Book activeBook;

    public Library() {
        books = new HashMap<>();
        activeBook = null;
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void switchToBook(String title) {
        if (!books.containsKey(title)) {
            System.out.println("Книга \"" + title + "\" не найдена в библиотеке.");
            return;
        }
        activeBook = books.get(title);
        System.out.println("Переключились на книгу \"" + title + "\", страница " + activeBook.getCurrentPage() + ".");
    }

    public void setActiveBook(String title) {
        if (books.containsKey(title)) {
            activeBook = books.get(title);
        } else {
            throw new IllegalArgumentException("Book not found in the library.");
        }
    }

    public void goToPage(int page) {
        if (activeBook == null) {
            System.out.println("Нет активной книги. Сначала выберите книгу!");
            return;
        }
        activeBook.setCurrentPage(page);
        System.out.println("Теперь вы на странице " + page + " в книге \"" + activeBook.getTitle() + "\".");
    }

    public void showActiveBook() {
        if (activeBook == null) {
            System.out.println("Нет активной книги.");
        } else {
            System.out.println("Текущая активная книга: \"" + activeBook.getTitle() + "\", страница " + activeBook.getCurrentPage() + ".");
        }
    }
}
