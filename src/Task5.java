import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Добавление элементов
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList время добавления: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList время добавления: " + (endTime - startTime) + " мс");

        // Вставка элементов
        startTime = System.currentTimeMillis();
        arrayList.add(50000, -1);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList время вставки: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        linkedList.add(50000, -1);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList время вставки: " + (endTime - startTime) + " мс");

        // Удаление элементов
        startTime = System.currentTimeMillis();
        arrayList.remove(50000);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList время удаления: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        linkedList.remove(50000);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList время удаления: " + (endTime - startTime) + " мс");

        // Поиск элемента
        startTime = System.currentTimeMillis();
        arrayList.contains(99999);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList время поиска: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        linkedList.contains(99999);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList время поиска: " + (endTime - startTime) + " мс");
    }
}