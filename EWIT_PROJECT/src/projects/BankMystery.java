package projects;

public class BankMystery {
    public static void main(String[] args) {
        String[] accounts = {"John", "Alice", null, "Bob"};
        int[] balances = {1000, 2000, 3000};

        
        for (int i = 0; i < Math.min(accounts.length, balances.length); i++) {
            if (accounts[i] == null) {
                System.out.println("Account holder: [Unknown]");
            } else {
                System.out.println("Account holder: " + accounts[i]);
            }
            System.out.println("Balance: " + balances[i]);
        }

        String input = "abc";
        try {
            int withdrawal = Integer.parseInt(input);
            System.out.println("Withdrawal: " + withdrawal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + input);
        }
    }
}