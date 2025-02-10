public class Account {
    private int accountNumber;
    private String password;
    private float balance;

        //A new bank account should be defined with a given account number, password and balance
    Account (int number, String password, float balance) {
        this.accountNumber = number;
        this.password = password;
        this.balance = balance;
    }

    public int getNumber() {
       return accountNumber;
    }

    public boolean checkPassword(String password) {
        return (password.equals(this.password));
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float newBalance) {
        balance = newBalance;
    }
}