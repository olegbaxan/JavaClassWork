package md.step.sell;

public class Sell {
    private static String productName;
    private static int quantity;
    private final double sellPrice;

    public Sell(String productName, int quantity, double sellPrice) {
        this.sellPrice = sellPrice;
        Sell.productName =productName;
        Sell.quantity =quantity;
    }

    public static String getProductName() {
        return productName;
    }


    public static int getQuantity() {
        return quantity;
    }



    public double getSellPrice() {
        return sellPrice;
    }

}

