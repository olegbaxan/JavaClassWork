package md.step;

import md.step.products.ProductManipulation;
import md.step.products.Products;
import md.step.sell.Sell;
import md.step.sell.SellList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static List<Products> stock = new ArrayList<>();

    public static void main(String[] args) {
        ProductManipulation.createListProduct();
        SellList.createSellList();
        SellList.buy(3);

    }


}
