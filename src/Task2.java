import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате (yyyy-MM-dd):");
        String userInput = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date userDate = dateFormat.parse(userInput);
            Date currentDate = new Date();

            System.out.println("Текущая дата: " + currentDate);
            System.out.println("Дата пользователя: " + userDate);

            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата раньше текущей.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата позже текущей.");
            } else {
                System.out.println("Введенная дата совпадает с текущей.");
            }

        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты.");
        }
    }
}