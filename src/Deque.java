import java.util.*;

public class Deque {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();
        Queue<Double> doubleQueue = new LinkedList<>();

        intList.add(5);
        intList.add(8);
        intList.add(5);
        intList.add(1);

        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("World");
        stringSet.add("Hello");

        doubleQueue.add(3.89);
        doubleQueue.add(954.64);
        doubleQueue.add(889.64);

        System.out.println(intList.getClass());
        printCollection(intList);
        System.out.println();
        System.out.println(stringSet.getClass());
        printCollection(stringSet);
        System.out.println();
        System.out.println(doubleQueue.getClass());
        printCollection(doubleQueue);
        System.out.println();

    }


    private static <T> void printCollection(Collection<T> collection) {

        for (T item : collection) {
            System.out.println(item);
        }
    }
}
