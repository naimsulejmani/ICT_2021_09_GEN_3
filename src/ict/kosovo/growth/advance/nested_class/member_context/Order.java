package ict.kosovo.growth.advance.nested_class.member_context;

import java.util.HashSet;
import java.util.Set;

public class Order {
    private int id;
    private Set<Item> items = new HashSet<>();

    public void addItem(Product product, int quantity) {
        //nese ekziston produkti bej update quantity
        items.add(new Item(product, quantity));
    }

    class Item {
        private Product product;
        private int quantity;

        public Item(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}
