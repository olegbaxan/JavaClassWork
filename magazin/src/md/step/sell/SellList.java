package md.step.sell;

import md.step.products.Products;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SellList {
    public static List<Sell> sell = new ArrayList<>();
    public static void addToList(Sell sellList){
        sell.add(sellList);
    }
    public static void createSellList(){
        addToList (new Sell("Rosii",5,5.5));
        addToList (new Sell("varza",7,6.9));
        addToList (new Sell("mere",3,7.0));
        addToList (new Sell("prune",5,9.2));
        addToList (new Sell("nuci",1,15.0));

    }
    public static void buy(int index){
        System.out.println("You bought "+ sell.get(index).getQuantity()+ " of " + sell.get(index).getProductName()+ " which will cost "+ (sell.get(index).getQuantity()*sell.get(index).getSellPrice()));
    }

}
