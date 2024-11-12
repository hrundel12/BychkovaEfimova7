import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;

public class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String formatBirthDate(int formatType) {
        DateFormat dateFormat;
        switch (formatType) {
            case 1:
                dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
                break;
            case 2:
                dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
                break;
            case 3:
                dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
                break;
            default:
                dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT);
        }
        return dateFormat.format(birthDate);
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Дата рождения: " + formatBirthDate(2); // по умолчанию средний формат
    }

    public static void main(String[] args) {
        Date birthDate = new Date(2002 - 1900, Calendar.MAY, 15); // пример даты рождения
        Student student = new Student("Иванов", birthDate);
        System.out.println(student);
        System.out.println("Короткий формат: " + student.formatBirthDate(1));
        System.out.println("Средний формат: " + student.formatBirthDate(2));
        System.out.println("Полный формат: " + student.formatBirthDate(3));
    }
}