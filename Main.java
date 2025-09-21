import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(001,"Alice","999 mahidol","0413281237");
        Invoice iv1 = new Invoice(21,"20/1/25",29000.00,1425.23,001,"Alice","999 mahidol","0414174921");
        Vehicle v1 = new Vehicle( "SN12345",
        "Civic",
        "Sedan",
        "2020",
        "Honda",
        25000.0,
        c1,
        iv1
    );

    System.out.println(v1.toString());

    }
}
