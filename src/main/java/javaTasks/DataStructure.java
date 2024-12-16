package javaTasks;

import java.util.*;

public class DataStructure {

    // Написать метод, который принимает массив целых чисел и возвращает сумму всех элементов массива.
    public static int sumArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    // Создать функцию, которая принимает строку и возвращает её в обратном порядке.
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    // Разработать метод, который принимает список целых чисел и удаляет из него все четные числа.
    public static List<Integer> cleanList(List<Integer> lst) {
        Iterator<Integer> iterator = lst.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        return lst;
    }

    /**
     * Реализации Set:
     * HashSet:
     * Наиболее часто используемая реализация.
     * Использует хеширование для хранения элементов.
     * Не гарантирует порядок элементов.
     * <p>
     * LinkedHashSet:
     * Похож на HashSet, но сохраняет порядок добавления элементов.
     * <p>
     * TreeSet:
     * Сохраняет элементы в отсортированном порядке (по возрастанию, по умолчанию).
     * Работает на основе дерева.
     */

    // Написать функцию, которая принимает массив целых чисел и возвращает количество уникальных чисел в этом массиве.
    public static int returnSet(int[] arr) {
        // Используем HashSet для хранения уникальных чисел
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int i : arr) {
            uniqueNumbers.add(i);
        }
        // Количество уникальных чисел равно размеру HashSet
        return uniqueNumbers.size();
    }

    // Создать метод, который считает количество вхождений каждого символа в переданной строке
    // и возвращает результат в виде карты (map).
    public static HashMap resultMap(String str) {
        str = str.toLowerCase();
        HashMap<String, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char current = str.charAt(i);
                if (current == str.charAt(j)) {
                    count++;
                }
            }
            resultMap.put("%s".formatted(str.charAt(i)), count);
        }
        return resultMap;
    }

    // Написать разворачивание списка с Node
    // Узел односвязного списка
    public static class Node {
        int value; // Значение узла
        Node next; // Ссылка на следующий узел

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Метод для разворота списка и печати исходного и развернутого списка
    public static void reverseAndPrintList(Node head) {
        System.out.println("Исходный список:");
        printList(head);

        Node previous = null; // Изначально предыдущий узел отсутствует
        Node current = head; // Текущий узел начинается с головы списка

        while (current != null) { // Пока не достигнут конец списка
            Node nextNode = current.next; // Сохраняем следующий узел
            current.next = previous; // Разворачиваем ссылку текущего узла
            previous = current; // Сдвигаем указатель предыдущего узла
            current = nextNode; // Переходим к следующему узлу
        }

        System.out.println("Развернутый список:");
        printList(previous); // Новый "head" списка — это предыдущий узел
    }

    // Метод для печати списка
    private static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Создаем односвязный список: 1 -> 2 -> 3 -> 4 -> null
        Node head = new Node(6);
        head.next = new Node(29);
        head.next.next = new Node(13);
        head.next.next.next = new Node(45);

        // Разворачиваем список и печатаем результат
        reverseAndPrintList(head);
    }
}
