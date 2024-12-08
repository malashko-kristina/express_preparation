package javaTasks.library;

import javaTasks.library.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books; // Список книг в библиотеке

    // Конструктор
    public Library() {
        books = new ArrayList<>();
    }

    // Метод для добавления книги
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга \"" + book.getTitle() + "\" добавлена в библиотеку.");
    }

    // Метод для поиска книги по названию
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("Книга с названием \"" + title + "\" не найдена.");
        return null;
    }

    // Метод для вывода всех доступных книг
    public void displayAvailableBooks() {
        boolean hasAvailableBooks = false;
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getBookInfo());
                hasAvailableBooks = true;
            }
        }
        if (!hasAvailableBooks) {
            System.out.println("Нет доступных книг.");
        }
    }
}
