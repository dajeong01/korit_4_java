package ch11_access_modifier;

public class BankMain {
    public static void main(String[] args) {
        Bank bankAlone1 = new Bank();
        Bank bankAlone2 = new Bank();

        bankAlone1.setAccountHolder("홍길동");
        bankAlone1.setBalance(100000);
        bankAlone1.setPinNumber(1111);
        bankAlone1.setAccountNum(123456);

        bankAlone2.setAccountHolder("신사임당");
        bankAlone2.setBalance(500000);
        bankAlone2.setPinNumber(2222);
        bankAlone2.setAccountNum(987654);

        bankAlone1.displayinfo();
        bankAlone2.displayinfo();

        bankAlone1.deposit(50000, 1111);
        bankAlone1.withdraw(200000, 1111);
        bankAlone1.withdraw(100000, 1111);

        System.out.println();

        bankAlone2.withdraw(100000,2222);
        bankAlone2.deposit(200000,2222);

        System.out.println();

        bankAlone1.displayinfo();
        bankAlone2.displayinfo();
    }
}
