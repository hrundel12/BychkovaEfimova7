import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String developerLastName = "Иванов"; // замените на вашу фамилию
        Date assignmentDate = new Date(); // дата и время получения задания

        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + assignmentDate);

        // Здесь можно выполнить другую логику, чтобы показать разницу во времени
        Date completionDate = new Date(); // дата и время сдачи задания
        System.out.println("Дата и время сдачи задания: " + completionDate);
    }
}