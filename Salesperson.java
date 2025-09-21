import java.util.ArrayList;

public class Salesperson {
    private int salesPersonID;
    private String name;

    //from association relationship
    private ArrayList<Invoice> filledInvoice;


    public Salesperson(int ID, String name){
        this.salesPersonID=ID;
        this.name = name;
    }
    
}
