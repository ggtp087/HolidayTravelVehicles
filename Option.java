import java.util.ArrayList;

public class Option {
    private String optionCode;
    private String description;
    private double price;

    //from association relationship
    private ArrayList<Invoice> addedInvoice;
}
