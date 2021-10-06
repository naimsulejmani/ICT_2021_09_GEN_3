package ict.kosovo.growth.oop.class_and_object_1;

public class BankCardAccountTest {
    public static void main(String[] args) {
        BankCardAccount account = new BankCardAccount();
        account.setName("Endrit Bislimi");
        account.deposit(100);
        account.deposit(200);
        account.deposit(-500);

        double balance=0;
        balance+=10;

        BankCardAccount account1 = new BankCardAccount("Blinera",1000.50);
        account1.deposit(100);

        System.out.printf("%s ka ne llogari %.2f EUR %n",account.getName(), account.getBalance());
        System.out.printf("%s ka ne llogari %.2f EUR %n",account1.getName(), account1.getBalance());


    }
}
