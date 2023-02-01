import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        checkAndPrintYear(2023);
    }
    public static void checkAndPrintYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        determineClientOS(0, 2014);
    }
    public static void determineClientOS(int clientOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryTime = calculateDeliveryTime(95);
        System.out.println("Потребуется дней: " + deliveryTime);
    }
    public static int calculateDeliveryTime (int distance) {
        int deliveryTime = 1;
        if (distance <= 20) {
        }
        if (distance > 20) {
            deliveryTime++;
        }
        if (distance > 60) {
            deliveryTime++;
        }
        if (distance > 100) {
            System.out.println("Доставка не осуществляется");
           return 0;
        }
        return deliveryTime;
    }
}