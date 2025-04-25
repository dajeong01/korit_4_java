package ch11_access_modifier;

public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        bank1.setAccountHolder("홍길동");
        bank1.setBalance(100000);
        bank1.setPinNumber(1111);
        bank1.setAccountNum(123456);

        bank2.setAccountHolder("신사임당");
        bank2.setBalance(500000);
        bank2.setPinNumber(2222);
        bank2.setAccountNum(987654);

        bank1.displayinfo();
        bank2.displayinfo();

        bank1.deposit(50000, 1111);
        bank1.withdraw(200000, 1111);
        bank1.withdraw(100000, 1111);

        System.out.println();

        bank2.withdraw(100000,2222);
        bank2.deposit(200000,2222);

        System.out.println();

        bank1.displayinfo();
        bank2.displayinfo();
    }
}
