package shop;

public class Product {

    private double regularPrice;

    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double computeSalePrice(){
        return 0.0;
    }

    public double getRegularPrice(){
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice){
        this.regularPrice = regularPrice;
    }

    public double computeSpecialCustomerPrice(){
        return (computeSalePrice()-0);
    }
}
