import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год:");
        int year = scanner.nextInt();
        System.out.println("Введите месяц (1-12):");
        int month = scanner.nextInt() - 1; // январь = 0
        System.out.println("Введите день:");
        int day = scanner.nextInt();
        System.out.println("Введите часы:");
        int hours = scanner.nextInt();
        System.out.println("Введите минуты:");
        int minutes = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);

        Date date = calendar.getTime();

        System.out.println("Созданная дата: " + date);
    }
}