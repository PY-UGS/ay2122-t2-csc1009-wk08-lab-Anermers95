import java.util.Scanner;

public class BankDemoTest {

    public static void main(String[] args) throws InsufficientFundsException {
        CheckAccount ca = new CheckAccount();
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        try {
            ca.deposit(input);
            
        } catch (Exception e) {
            
        }
        
        try {
            ca.Withdraw(5000);
        } catch (Exception e) {
        }
        
        sc.close();
    }

    
    
}
