public class Noodlerestaurant {


    String name;

    public Noodlerestaurant(String customerName) {
       name = customerName;
    }

    public void order(Noodle noodle) {
        System.out.println(noodle.getCookPrep());
        System.out.println("Order for " + name + " is ready.");
    }

    public static void main(String[] args) {
        Noodle ramen1, pho;
        ramen1 = new Ramen();
        pho = new Pho();

        Noodlerestaurant customer1 = new Noodlerestaurant("Sagirah");
        Noodlerestaurant customer2 = new Noodlerestaurant("Maritza");

        customer1.order(pho);
        customer2.order(ramen1);
    }
}