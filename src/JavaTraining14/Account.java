package JavaTraining14;

public class Account {
    private int balance;
    private String accountNumber;

    // getter method
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }
    public void getBalance(int balance) {
        this.balance = balance;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Account) {
            // oはあくまでオブジェクト型なので, accountNumberフィールドを持つことができない.
            // そのため, 一度Account型のaにObject型とみなされたoを代入し, インスタンスと等しいか判断を行う.
            Account a = (Account) o;
            String an1 = this.accountNumber.trim();
            String an2 = a.accountNumber.trim();
            if (an1.equals(an2)) {
                return true;
            }
        }
        return false;
    }

}
