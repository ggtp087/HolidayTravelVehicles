import java.util.ArrayList;
public class Invoice {
    private int invoiceID;
    private String date;
    private double finalPrice;
    private double tax;
    private int customerID;
    private String name;
    private String address;
    private String phoneNum;

    //from association relationship
    private Customer gaveCustomer;
    private Salesperson createdSalesperson;
    private TradeInVehicle addedTradeInVehicle;
    private ArrayList<Option> addedOption;
    private Vehicle vehicle;

    public Invoice(int invoiceID, String date, double finalPrice, double tax,
                   int customerID, String name, String address, String phoneNum) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.finalPrice = finalPrice;
        this.tax = tax;
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }
    
    public String toString() {
        return "Invoice{" +
                "invoiceID=" + invoiceID +
                ", date='" + date + '\'' +
                ", finalPrice=" + finalPrice +
                ", tax=" + tax +
                ", customerID=" + customerID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
