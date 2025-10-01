import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        // Задача 1
        checkLeapYear(2024);
        checkLeapYear(2023);
        checkLeapYear(2000);
        checkLeapYear(1900);

        System.out.println("Задача 2");
        // Задача 2
        recommendAppVersion(0, 2020); // iOS, старый телефон
        recommendAppVersion(1, 2023); // Android, новый телефон
        recommendAppVersion(1, 2018); // Android, старый телефон

        System.out.println("Задача 3");
        // Задача 3
        System.out.println("Потребуется дней: " + calculateDeliveryDays(95));
        System.out.println("Потребуется дней: " + calculateDeliveryDays(15));
        System.out.println("Потребуется дней: " + calculateDeliveryDays(45));
        System.out.println("Потребуется дней: " + calculateDeliveryDays(85));
        System.out.println("Потребуется дней: " + calculateDeliveryDays(105));
    }

    // Задача 1
    public static void checkLeapYear(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeap) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // Задача 2
    public static void recommendAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();

        String osName;
        if (osType == 0) {
            osName = "iOS";
        } else {
            osName = "Android";
        }

        if (deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + osName + " по ссылке");
        }
    }

    //Задача 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance > 100) {
            return -1; // доставки нет
        } else if (deliveryDistance > 60) {
            return 3;
        } else if (deliveryDistance > 20) {
            return 2;
        } else {
            return 1;
        }
    }
}