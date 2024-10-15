//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap =" + manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap =" + manager.getBalance());
        try {
            manager.withdraw(90);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        try {
            manager.withdraw(25);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
    }
}