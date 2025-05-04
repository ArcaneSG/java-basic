package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    // public 매서드 : 입금
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            this.balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    // public 매서드 : 출금
    public void withdraw(int amount) {
        if(isAmountValid(amount) && this.balance - amount >= 0) {
            this.balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 매서드 : 잔고
    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
