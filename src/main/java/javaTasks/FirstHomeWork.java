package javaTasks;
import java.util.Scanner;

public class FirstHomeWork {

    private static Scanner scanner = new Scanner(System.in);
    // Напишите программу, которая принимает два числа с консоли, складывает их и выводит разность

    public static void checkSumAndDifference() {
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference;
        if (a > b) {
            difference = Math.abs(a - b);
        } else if (a < b) {
            difference = Math.abs(b - a);
        } else {
            difference = 0;
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
    }

    public static void checkAreaTriangle() {
        // Напишите программу, которая вычисляет площадь прямоугольника, используя введённые с консоли ширину и длину.
        System.out.print("Введите ширину треугольника: ");
        int width = scanner.nextInt();

        System.out.print("Введите длину треугольника: ");
        int length = scanner.nextInt();

        double area = width * length * 0.5;

        System.out.println("Ширина: " + width);
        System.out.println("Длина: " + length);
        System.out.println("Площадь: " + (int) area);
    }

    public static void checkDivisionResultAndRemainder() {
        // Запросите у пользователя два числа и выведите результат их деления и остаток от деления.
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        while (b == 0) {
            System.out.print("Введите второе число: ");
            b = scanner.nextInt();
        }

        System.out.println("Результат деления: " + a / b);
        System.out.println("Остаток: " + a % b);
    }

    public static void checkConvertfromCelsiusToFahrenheit() {
        // Реализуйте программу, которая преобразует температуру из Цельсия в Фаренгейты.
        System.out.print("Введите температуру в Цельсиях: ");
        int a = scanner.nextInt();

        int result = a * 9 / 5 + 32;
        System.out.println("Температура в Фаренгейтах: " + result);
    }

    public static void checkReplaceVariable() {
        // Поменяйте значения двух переменных местами без использования третьей переменной.
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.println("До обмена: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("После обмена: a = " + a + ", b = " + b);
    }

    public static void checkOddOrEven() {
        // Напишите программу, которая проверяет, является ли число чётным или нечётным.
        System.out.print("Число: ");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public static void checkCalculator() {
        // Реализуйте простой калькулятор, который выполняет операции +, -, *, /, используя switch.

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите оператор: ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        double result;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Ошибка: деление на ноль невозможно!");
                    return; // Прерываем выполнение программы в случае ошибки
                }
                break;
            default:
                System.out.println("Неверный оператор!");
                return;
        }
        System.out.println(result);
    }

    public static void checkSeasons() {
        // Пользователь вводит номер месяца (1-12). Выведите название соответствующего времени года, используя switch.
        System.out.print("Введите число месяца: ");
        int a = scanner.nextInt();

        switch (a) {
            case 12, 1, 2:
                System.out.print("Зима");
                break;
            case 3, 4, 5:
                System.out.print("Весна");
                break;
            case 6, 7, 8:
                System.out.print("Лето");
                break;
            case 9, 10, 11:
                System.out.print("Осень");
                break;
            default:
                System.out.print("Неверное число сезона");
                break;
        }
    }

    public static void checkAge() {
        // Напишите программу, которая определяет категорию человека по возрасту.
        System.out.print("Введите возраст: ");
        int a = scanner.nextInt();

        while (a < 0) {
            System.out.print("Введите возраст: ");
            a = scanner.nextInt();
        }

        if (a >= 0 && a <= 12) {
            System.out.println("Ребёнок");
        } else if (a >= 13 && a <= 17) {
            System.out.println("Подросток");
        } else if (a >= 18 && a <= 64) {
            System.out.println("Взрослый");
        } else if (a >= 65) {
            System.out.println("Пенсионер");
        }
    }

    public static void checkDivisibility() {
        // Напишите программу, которая проверяет, делится ли число на 3 и 5 одновременно.
        System.out.print("Введите число: ");
        int a = scanner.nextInt();

        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("Результат: Делится на 3 и 5");
        } else if ((a % 3 == 0) && (a % 5 != 0)) {
            System.out.println("Результат: Делится только на 3");
        } else if ((a % 3 != 0) && (a % 5 == 0)) {
            System.out.println("Результат: Делится только на 5");
        } else {
            System.out.println("Результат: Не делится ни на 5, ни на 3");
        }

    }

    public static void checkAllNumbersTo10() {
        // Напишите программу, которая выводит все числа от 1 до 10.
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void checkSumOfNumbers() {
        // Пользователь вводит число N. Вычислите сумму всех чисел от 1 до N.
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= a; i++) {
            result += i;
        }
        System.out.println(result);
    }

    public static void checkMultiplicationTable() {
        // Пользователь вводит число. Выведите таблицу умножения для этого числа от 1 до 10.
        System.out.print("Введите число: ");
        int a = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = a * i;
            System.out.println(a + " x " + i + " = " + result);
        }
    }

    public static void checkFactorial() {
        // Напишите программу, которая вычисляет факториал числа N (N! = 1 * 2 * ... * N).
        System.out.print("Введите N: ");
        int a = scanner.nextInt();

        int result = 1;

        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.print("Факториал: " + result);
    }

    public static void checkEvenNumbers() {
        // Пользователь вводит число N. Выведите все чётные числа от 1 до N.
        System.out.print("Введите N: ");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void checkMultiplicationTableCreation() {
        // Выведите таблицу умножения от 1 до 10 в формате.
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }


    public static void checkPrintStars() {
        // Напишите программу, которая выводит прямоугольник из звёздочек размером M x N (пользователь вводит размеры).
        System.out.print("Введите M: ");
        int m = scanner.nextInt();

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void checkBuildAPyramidOfStars() {
        // Реализуйте программу, которая выводит пирамиду из звёздочек высотой N.
        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        // Внешний цикл для строк пирамиды
        for (int i = 1; i <= n; i++) {
            // Цикл для пробелов перед звёздочками
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Цикл для звёздочек
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Переход на следующую строку
            System.out.println();
        }
        scanner.close(); // Закрываем Scanner
    }

    public static void checkPrimeNumbers() {
        // Найдите все простые числа от 2 до N. Используйте вложенные циклы для проверки делимости.
        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
    public static void checkChessDesk() {
        // Выведите шахматную доску размером N x N, где клетки чередуются символами # и ..
        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

}
