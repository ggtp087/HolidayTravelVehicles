import java.util.Date;

public class Vehicle {
    private String serialNumber;
    private String name;
    private String model;
    private String year;
    private String manufacturer;
    private double baseCost;

    //from association relationship
    private Customer ownedCustomer;
    private Invoice invoice;

    public Vehicle(String serialNumber, String name, String model, String year, String manufacturer, double baseCost,Customer c,Invoice iv) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
        this.ownedCustomer = c;
        this.invoice = iv;
    }

    public String toString() {
        return "Vehicle {" +
                "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                ", baseCost=" + baseCost +
                ",\n by customer= " + ownedCustomer.toString() + 
                ",\n Invoice info.= " + invoice.toString();
    }
}
