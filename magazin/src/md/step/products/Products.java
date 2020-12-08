package md.step.products;


import java.time.LocalDate;

public class Products {
        private static String name;
        private static double buyPrice;
        private static double sellPrice;
        private static LocalDate expirationDate;
        private static String description;
        private static int stock;

        public Products(String name, double buyPrice, double sellPrice, LocalDate expirationDate, String description, int stock) {

            this.name = name;
            this.buyPrice = buyPrice;
            this.sellPrice = sellPrice;
            this.expirationDate = expirationDate;
            this.description = description;
            this.stock = stock;
        }

        public void setName(String name) {
            this.name = name;
        }

        public  void setBuyPrice(double buyPrice) {
            this.buyPrice = buyPrice;
        }

        public  void setSellPrice(double sellPrice) {
            this.sellPrice = sellPrice;
        }

        public  void setExpirationDate(LocalDate expirationDate) {
            this.expirationDate = expirationDate;
        }

        public  void setDescription(String description) {
            this.description = description;
        }

        public  void setStock(int stock) {
            this.stock = stock;
        }

        public String getName() {
            return name;
        }

        public  double getBuyPrice() {
            return buyPrice;
        }

        public  double getSellPrice() {
            return sellPrice;
        }

        public LocalDate getExpirationDate() {
            return expirationDate;
        }

        public  String getDescription() {
            return description;
        }

        public  int getStock() {
            return stock;
        }
    }
