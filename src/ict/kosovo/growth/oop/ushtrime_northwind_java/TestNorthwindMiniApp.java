package ict.kosovo.growth.oop.ushtrime_northwind_java;

public class TestNorthwindMiniApp {
    public static void main(String[] args) {
        Category category = new Category(1, "Lengje", "dicka e mire po zihet");
        Supplier supplier = new Supplier(1, "Kosmonte Foods", "Naim Sulejmani", "address", "fushe kosove", "Kosove");
        Product product =
                new Product(1, "Jogobella", supplier.getId(), category.getId(),
                        100, 0.40, 1000, 1000, 1, false,
                        supplier, category);

        Product product2 =
                new Product(1, "Monte", supplier.getId(), category.getId(),
                        20, 0.45, 2000, 2000, 2, false,
                        supplier, category);
        Customer customer = new Customer(1, "SHPK Adnani Company", "Adnan", "Prishtine", "Prishtine", "Kosove");

        Employee employee = new Employee(1, "Kosmonte Foods", "Agim", "Kryeziu", "agim@shpk.com", "Faturist", "FK", "FK", null);

        Order order = new Order(1, customer.getId(), employee.getId());
        order.setEmployee(employee);
        order.setCustomer(customer);
        order.addOrderDetail(new OrderDetail(order.getId(), product.getId(), product.getPrice(), 50, 0.10f, product));
        order.addOrderDetail(new OrderDetail(order.getId(), product2.getId(), product2.getPrice(), 50, 0.05f, product2));

        order.print();
        /*
        Numri porosise: 1
        Bleresi: SHPK Adnani
        Addressa: .....
        --------------------------------------
        1 - Jogobella       50  x   0.30    =   15.00 EUR
        2 - Monte           50  x   0.40    =   20.00 EUR
        --------------------------------------
        TOtali: 35.00 EUR.


         */

    }
}
