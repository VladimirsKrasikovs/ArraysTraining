import java.util.*;

public class List2 {
    public static void main(String[] args) {
        Queue<String> line = new LinkedList<>();
        line.add("Boris");
        line.add("Anna");
        line.add("Cefs");

        for(String name: line) {
            System.out.println(name);
        }
      processAlphabetically(line);
    }

    public static void processAlphabetically(Queue<String> queue){

        Queue<String> alphabeticalQueue = new PriorityQueue<>();

        for(String name: queue) {
            alphabeticalQueue.offer(name);
        }

        while(alphabeticalQueue.peek() != null) {
            String headElement = alphabeticalQueue.remove();
            System.out.println("Processing: "+ headElement);
        }
    }
}