package ict.kosovo.growth.oop.class_and_object_2;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product();

            product1.setPrice(10.50);
            product1.setName("Jogobella Fruit");

        System.out.println(product1.getName());
        System.out.println(product1.getBestBefore());
        System.out.println(product1.getPrice());
    }
}
