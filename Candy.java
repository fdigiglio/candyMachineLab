import javax.xml.catalog.CatalogManager;

public class Candy{

    //instance variables
    private String candy;
    private double price;

    //Default Constructor
    Candy(){

    }

    Candy(String pCandy, double pPrice){
        this.candy = pCandy;
        this.price = pPrice;
    }


    public String getItem(){
        return "\t " + this.price + "\t" + this.candy;
    }

    public double getPrice(){
        return this.price;
    }

    
}