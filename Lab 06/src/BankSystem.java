public class BankSystem {
    public static void identifyLowBalances(double[] balances, double threshold) {
        System.out.println("Accounts with critically low balances:");
        boolean found = false;
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] < threshold) {
                System.out.println("Your acc has low balance of: $" + balances[i]);
                found = true;}}
        if (!found) {
            System.out.println("No accounts have balances below the threshold.");}}
    public static void main(String[] args) {
        double[] accountBalances = {500.0, 150.0, 50.0, 800.0, 25.0};
        double criticalThreshold = 100.0;
        identifyLowBalances(accountBalances, criticalThreshold);}}
/*3.	Assume a bank's system needs to identify accounts with critically low balances and
alert the user. Test the function with various balance values to ensure it correctly identifies all accounts below the threshold.*/