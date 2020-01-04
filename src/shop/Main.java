package shop;

public class Main {

    public static void main(String[] args) {
        Product[] pa = new Product[7];

        pa[0] = new TV(1000,"Samsung",30);
        pa[1] = new TV(2000,"LG",32);
        pa[2] = new MP3Player(250,"Apple","blue");
        pa[3] = new Book(1500,"Oracle",1998);
        pa[4] = new Book(2000,"Sun Press",1995);
        pa[5] = new Camera(4500,"Sony");
        pa[6] = new Camera(5000,"Cannon");

        double totalRegularPrice = 0;
        double totalSalePrice = 0;

        for(int i=0;i<pa.length;i++){
            totalRegularPrice += pa[i].getRegularPrice();
            totalSalePrice += pa[i].computeSalePrice();

            System.out.println("Item number : " + i +" : Type=" + pa[i].getClass().getName()
                + " ,Regular Price= " + pa[i].getRegularPrice() +
                    " , Special Customer Price= " + pa[i].computeSpecialCustomerPrice()+
                    ", Sale Price= " + pa[i].computeSalePrice());
        }

        System.out.println("TotalRegularPrice = " + totalRegularPrice);
        System.out.println("TotalSalePrice= " + totalSalePrice);
    }

}
