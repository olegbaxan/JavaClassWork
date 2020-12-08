package md.step.products;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductManipulation {
    public static List<Products> stock = new ArrayList<>();
    public static void enterStock(Products products){
        stock.add(products);
    }
    public static void createListProduct(){
        enterStock (new Products("Rosii",5.2,5.5,LocalDate.of(2020,12,25),"Rosii din MD",25));
        enterStock (new Products("Castraveti",5.2,5.5,LocalDate.of(2020,12,22),"Castraveti din MD",25));
        enterStock (new Products("varza",6.2,6.9,LocalDate.of(2020,12,22),"varza din MD",25));
        enterStock (new Products("mere",5.8,7.0,LocalDate.of(2020,12,21),"mere din MD",25));
        enterStock (new Products("pere",8.7,10.0,LocalDate.of(2020,12,20),"pere din MD",25));
        enterStock (new Products("nuci",9.8,15.0,LocalDate.of(2020,12,28),"nuci din MD",25));
        enterStock (new Products("prune",6.9,9.2,LocalDate.of(2020,12,20),"prune din MD",25));
    }
    public static void listStock(){
        for (Products prod: stock) {
            System.out.format("%10s,%10d,%5d,%5d,%10s,%10d",prod.getName(),prod.getBuyPrice(),prod.getSellPrice(),prod.getExpirationDate(),prod.getDescription(),prod.getStock());
            System.out.println();
        }
    }

}
