package Week6;

public class LeafyGreen extends Vegetable {

    private String type;

    public LeafyGreen(double weight, double price, String type) {
        super(weight, price);
        this.setType(type);
    }

    public double totalPrice() {
        double localPrice = 0;
        double localWeight = 0;
        double localFinalPrice = 0;
        localPrice = getPrice();
        localWeight = getWeight();
        localFinalPrice = localPrice * localWeight;
        return localFinalPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
