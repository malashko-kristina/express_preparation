package complexTasks;

import java.util.ArrayList;

public class GeneralTasks {

    /**
     * Двусуммный (Two Sum): Дан массив целых чисел nums и целое число target.
     * Найдите два числа в массиве так, чтобы их сумма была равна target.
     * Верните их индексы. Вы можете предположить, что каждый вход будет
     * иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды.
     * Вы можете вернуть ответ в любом порядке.
     */

    public static Object[] twoSum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result.add(i);
                    result.add(j);
                    return result.toArray();
                }
            }
        }
        return new Object[0];
    }

    /**
     * Обращение связанного списка (Reverse Linked List):
     * Обратите связанный список.
     */

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void reverseAndPrintList(Node head) {
        System.out.println("Исходный список:");
        printList(head);

        Node previous = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        System.out.println("Развернутый список:");
        printList(previous);
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
