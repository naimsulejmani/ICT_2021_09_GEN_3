package ict.kosovo.growth.advance.nested_class.member_context;

public class TestMemberContext {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Monte Coko",0.50);
        Product buka = new Product(2,"Buka",0.50d);
        Product uji = new Product(3,"Uji",0.45d);

        Order porosiaNaimit = new Order();
        porosiaNaimit.addItem(buka,10);
        porosiaNaimit.addItem(uji,2);

    }
}
