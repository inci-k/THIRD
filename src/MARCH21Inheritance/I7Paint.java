package MARCH21Inheritance;

public class I7Paint {
    protected String colorName;
    protected double squareFeet;
    protected double totalPrice;
    public I7Paint(String colorName,double squareFeet){
        this.colorName=colorName;
        this.squareFeet=squareFeet;
        this.totalPrice=0;
    }
    double calculatePrice(){
        double totalPrice= this.squareFeet/100*32.99;
        this.totalPrice=totalPrice;
        return this.totalPrice;
    }

    @Override
    public String toString() {
        return "I7Paint{" +
                "colorName='" + colorName + '\'' +
                ", squareFeet=" + squareFeet +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
