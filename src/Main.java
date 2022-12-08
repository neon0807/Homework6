import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void selectionOS(int os) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0) {
            if (currentYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (os == 1) {
            if (currentYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
    }

    public static void deliverCard(int deliveryDistance){
        if (deliveryDistance <= 20){
            System.out.println("Потребуется 1 день");
        } else {
            if (deliveryDistance <= 60){
                System.out.println("Потребуется 2 дня");
            } else {
                if (deliveryDistance <= 100){
                    System.out.println("Потребуется 3 дня");
                } else {
                    System.out.println("Доставки нет");
                }
            }
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        checkYear(year);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Операционную систему:");
        System.out.println("0 — iOS; 1 — Android");
        int os = scanner.nextInt();
        selectionOS(os);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние от офиса до адреса доставки:");
        int deliveryDistance = scanner.nextInt();
        deliverCard(deliveryDistance);
    }
}