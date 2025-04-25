package ch11_access_modifier;

import java.util.Scanner;

public class Bank {

    // 생성자
    private int accountNum;             // 계좌번호
    private String accountHolder;       // 예금주이름
    private int balance;                // 잔액
    private int pinNumber;              // 비밀번호

    Bank(){}
    Bank(int accountNum){}
    Bank(int accountNum, String accountHolder){}
    Bank(int accountNum, String accountHolder, int balance){}
    Bank(int accountNum, String accountHolder, int balance,int pinNumber){}

    // 메서드


    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance > 0){
            this.balance = balance;
        }
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        if (pinNumber < 0 || pinNumber > 9999) {
            System.out.println("불가능한 비밀번호입니다.");
            return;
        }
        this.pinNumber = pinNumber;
    }

    // 메서드
    int amount;
    int inputPin;

    void deposit(int amount,int inputPin){
        if(inputPin == this.pinNumber){
            this.amount = amount;
            if (amount > 0){
                balance += amount;
                System.out.println("입금 성공 ! 현재 잔액 : " + balance);
            } else {
                System.out.println("불가능한 입력 금액입니다.");
                return;
            }

        } else {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
    }

    void withdraw(int amount, int inputPin) {
        if (inputPin == this.pinNumber) {
            this.amount = amount;
            if (amount > 0) {
                if (balance - amount > 0) {
                    this.balance = balance - amount;
                    System.out.println("출금 성공! 현재 잔액 : " + balance);
                } else {
                    System.out.println("잔액 부족! 출금이 불가능합니다.");
                    return;
                }
            } else {
                System.out.println("불가능한 입력 금액입니다.");
                return;
            }

        } else {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
    }

    void showAccountInfo(){
        System.out.println(accountHolder + "님의 계좌번호는 " + accountNum +
                "이며, 현재 잔액은 " + balance + "원입니다.");
    }

    void displayinfo(){
        System.out.println("최종 계좌 정보");
        System.out.println("계좌 소유자 : " + accountHolder);
        System.out.println("계좌 번호 : " + accountNum);
        System.out.println("현재 잔액 : " + balance);
        System.out.println();
    }
}

