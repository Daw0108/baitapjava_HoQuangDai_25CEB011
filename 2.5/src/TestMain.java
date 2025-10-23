public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        System.out.println(c1); // Customer's toString()

        Account a1 = new Account(101, c1, 88.8);
        System.out.println(a1); // Account's toString()

        a1.deposit(100.0);
        System.out.println("After deposit, " + a1);

        a1.withdraw(50.0);
        System.out.println("After withdrawal, " + a1);

        a1.withdraw(200.0); // Exceeds balance
    }
}