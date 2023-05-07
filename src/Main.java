public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2023;
        printYearType(year);
        printSeparator();
        System.out.println("Задача 2");
        int os = 1;
        printInfoMessage(os);
        printSeparator();
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        printDeliveryDays(deliveryDistance);
        printSeparator();
    }
    public static void printSeparator() {
        System.out.println("====================");
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
    public static void printYearType(int year) {
        if (isLeapYear(year)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static void printInfoMessage(int os) {
        int year = 2018;
        String message = getInfoMessage(os, year);
        System.out.println(message);
    }

    public static String getInfoMessage(int os, int year) {
        if (os == 0 && year < 2015) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (os == 0 && year >= 2015) {
            return "Установите версию приложения для iOS по ссылке";
        } else if (os == 1 && year < 2015) {
            return "Установите облегченную версию приложения для Android по ссылке";
        } else if (os == 1 && year >= 2015) {
            return "Установите версию приложения для Android по ссылке";
        } else {
            return "Не удалось определить версию";
        }
    }

    public static void printDeliveryDays(int deliveryDistance) {
        int deliveryDays = calculateDeliveryDays(deliveryDistance);

        String message;
        if (deliveryDays != -1) {
            message = String.format("Потребуется дней: %s", deliveryDays);
        } else {
            message = "Доставки нет";
        }

        System.out.println(message);
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else {
            return -1;
        }
    }
}