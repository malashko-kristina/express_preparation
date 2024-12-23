package complexTasks;

import complexTasks.library.Book;
import complexTasks.library.Library;
import javaTasks.DataStructure;

import java.util.Arrays;

import static complexTasks.GeneralTasks.reverseAndPrintList;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 9, 6, 1, 9, 0};
        Object[] result = GeneralTasks.twoSum(arr, 7);
        System.out.println(Arrays.toString(result));

        GeneralTasks.Node head = new GeneralTasks.Node(1);
        head.next = new GeneralTasks.Node(2);
        head.next.next = new GeneralTasks.Node(3);
        head.next.next.next = new GeneralTasks.Node(4);
        head.next.next.next.next = new GeneralTasks.Node(5);

        reverseAndPrintList(head);

        Library library = new Library();

        library.addBook(new Book("Flowers for Algernon", 311));
        library.addBook(new Book("The Lord of the Flies", 256));

        library.setActiveBook("Flowers for Algernon");
        System.out.println("Active book: " + library.getActiveBook().getTitle());

        library.goToPage(17);
        System.out.println("Current page: " + library.getActiveBook().getCurrentPage());

        library.setActiveBook("The Lord of the Flies");
        System.out.println("Active book: " + library.getActiveBook().getTitle());

        System.out.println("Current page: " + library.getActiveBook().getCurrentPage());

        library.setActiveBook("Flowers for Algernon");
        System.out.println("Active book: " + library.getActiveBook().getTitle());
        System.out.println("Current page: " + library.getActiveBook().getCurrentPage());
    }
}
