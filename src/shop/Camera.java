package shop;

public class Camera extends Electronics {

    public Camera(double regularPrice, String manufacturer) {
        super(regularPrice, manufacturer);
    }

    @Override
    public double computeSalePrice() {
        return super.getRegularPrice() * 0.7;
    }


}
