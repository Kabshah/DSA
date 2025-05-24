public class Acc_Balance {
    public static void main(String[] args) {
        int accountBalance [] = {0,2000,5000,20000,40000,750000};
        Search(accountBalance);}
    public static void Search(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10000) {
                System.out.println("Account No " + (i + 1) + ": Low Balance (" + arr[i] + ")");}}}}
/*1.Declare an array of size 10 to store account balances. Initialize with values 0 to 1000000. Check all array if any value is less than 10000. Show message:
Account No. Low Balance
Account No. Low Balance*/
