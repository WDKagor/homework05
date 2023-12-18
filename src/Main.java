public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android по ссылке");

        System.out.println("   ");
        System.out.println("Задача 2");
        clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android по ссылке");

        System.out.println("   ");
        System.out.println("Задача 3");
        int year = 2001;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else System.out.println("Год не является високосным");

        System.out.println("   ");
        System.out.println("Задача 4");
        int deliveryDistance = 133;
        int days = 1;
        if (deliveryDistance >= 20) {
            days++;
        }
        if (deliveryDistance >= 60) {
            days++;
        }
        if (deliveryDistance > 100) {
            days = -1;
        }
        if (days == -1) {
            System.out.println("Доставки нет");
        } else System.out.println("Доставка занимает дней: " + days);

        System.out.println("   ");
        System.out.println("Задача 5");
        int monthNumber = 11;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Месяц с номером " + monthNumber + " - это зимний месяц");
                break;
            case 3, 4, 5:
                System.out.println("Месяц с номером " + monthNumber + " - это весенний месяц");
                break;
            case 6, 7, 8:
                System.out.println("Месяц с номером " + monthNumber + " - это летний месяц");
                break;
            case 9, 10, 11:
                System.out.println("Месяц с номером " + monthNumber + " - это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
                break;
        }

    }


}