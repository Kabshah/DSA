public class Account {
    public static void main(String[] args) {
        int[] accountNumbers = {6789, 2345, 7890};
        int[] balances = { 45000, 32000, 15000};
        System.out.println("Before Sorting:");
        printAccounts(accountNumbers, balances);
        quickSort(balances, accountNumbers, 0, balances.length - 1);
        System.out.println("\nAfter Sorting by Balance (Descending):");
        printAccounts(accountNumbers, balances);}
    static void quickSort(int[] balances, int[] accountNumbers, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(balances, accountNumbers, low, high);
            quickSort(balances, accountNumbers, low, pivotIndex - 1);
            quickSort(balances, accountNumbers, pivotIndex + 1, high);}}
    static int partition(int[] balances, int[] accountNumbers, int low, int high) {
        int pivot = balances[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (balances[j] > pivot) {
                i++;
                swap(balances, i, j);
                swap(accountNumbers, i, j);}}
        swap(balances, i + 1, high);
        swap(accountNumbers, i + 1, high);
        return i + 1;}
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;}
    static void printAccounts(int[] accountNumbers, int[] balances) {
        for (int i = 0; i < accountNumbers.length; i++) {
            System.out.println("Account No.: " + accountNumbers[i] + " | Balance: " + balances[i]);}}}
/*4. You are given a set of bank accounts, each with a unique account number and a balance.
Write a Java program to Declare an array of size n to store account balances. Initialize each
balance randomly with values between 0 and 100,000. Sort the accounts in descending
order of their balances using Quick Sort. Print the sorted list in the format*/