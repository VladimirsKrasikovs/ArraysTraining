public class StaticGenerik {
    public static void main(String[] args) {

            Generiks<String> stringContainer = new Generiks<>("Hello");
            Generiks<Integer> intContainer = new Generiks<>(34);

            printContainer(stringContainer);
            printContainer(intContainer);
        }

        public static void printContainer(Generiks<?> container) {
            System.out.println(container.toString());
        }
    }


