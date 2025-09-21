import java.util.ArrayList;

public class Customer {
    private int customerID;
    private String name;
    private String address;
    private String phoneNum;

    //from association relationship
    private ArrayList<Vehicle> purchasedVehicle;
    private Invoice receivedInvoice;

    public Customer(int ID,String name,String addr,String phone){
        this.customerID = ID;
        this.name = name;
        this.address = addr;
        this.phoneNum = phone;
    }

    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
    
}
