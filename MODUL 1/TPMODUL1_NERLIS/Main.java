import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("Nerlis_SI4605", "1202223307", 100000.0);
        Account account2 = new Account("Tegar", "1202220001", 200000.0);
        Account account3 = new Account("Gemilang", "1202221919", 300000.0);

        Bank bank = new Bank();

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu Bank:");
            System.out.println("1. Setor Tunai");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Informasi Akun");
            System.out.println("4. Hapus Akun");
            System.out.println("5. List Semua Akun");
            System.out.println("6. Keluar");
            System.out.print("Masukkan Pilihanmu : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bank.deposit();
                    break;
                case 2:
                    bank.withdraw();
                    break;
                case 3:
                    bank.getAccountInfo();
                    break;
                case 4:
                    bank.removeAccount();
                    break;
                case 5:
                    bank.getAllAccounts();
                    break;
                case 6:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid. Silahkan Pilih Lagi.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}
