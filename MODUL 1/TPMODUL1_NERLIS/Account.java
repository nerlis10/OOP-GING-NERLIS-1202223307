public class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Setor Tunai " + amount + " ke akun " + name + "Saldo Terbaru : " + balance);
        } else {
            System.out.println("Setor Tunai Tidak Valid.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Tarik Tunai " + amount + " dari akun " + name + "Saldo Terbaru : " + balance);
            return true;
        } else {
            System.out.println("Tarik Tunai Tidak Valid atau Saldo Tidak Cukup.");
            return false;
        }
    }

    public String getAccountInfo() {
        return "Nama : " + name + ", Nomor Akun : " + accountNumber + "Saldo : " + balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
