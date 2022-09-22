import java.io.*;


public class Serilalization implements Serializable {
    private String make;
    private int year;
    private static final long serialVersionUID = 1L;


    public Serilalization(String make, int year) {
        this.make = make;
        this.year = year;

    }
    public String toString(){
        return String.format("Car make is: %s, Car year is: %d", this.make, this.year);
    }

        public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException,FileNotFoundException {
        Serilalization honda = new Serilalization("Honda",2002);
        Serilalization toyota = new Serilalization("Toyota",2002);
        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(toyota);
            objectOutputStream.writeObject(honda);
            FileInputStream fileInputStream = new FileInputStream("cars.txt");
            ObjectInputStream objectInputStream = new  ObjectInputStream(fileInputStream);
            Serilalization toyotaCopy = (Serilalization) objectInputStream.readObject();
            Serilalization hondaCopy = (Serilalization) objectInputStream.readObject();

           boolean isSameObject  = toyota == toyotaCopy;
            System.out.println("Toyota (Copy) - "+toyotaCopy);
            System.out.println("Toyota (Original) - "+toyota);
            System.out.println("Is same object: "+ isSameObject);

            }

        }


