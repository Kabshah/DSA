public class BankAccounts {
        public static void main(String[] args) {
            int[] accountIds = {3547, 1245, 6789, 2345, 7890};
            int[] accountBalances = {28000, 12000, 45000, 32000, 15000};
            System.out.println("Before Sorting:");
            printAccounts(accountIds, accountBalances);
            quickSort(accountBalances, accountIds, 0, accountBalances.length - 1);
            System.out.println("\nAfter Sorting by Balance :");
            printAccounts(accountIds, accountBalances);}
        static void quickSort(int[] accountBalances, int[] accountIds, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(accountBalances, accountIds, low, high);
                quickSort(accountBalances, accountIds, low, pivotIndex - 1);
                quickSort(accountBalances, accountIds, pivotIndex + 1, high);}}
        static int partition(int[] accountBalances, int[] accountIds, int low, int high) {
            int pivot = accountBalances[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (accountBalances[j] > pivot) {
                    i++;
                    swap(accountBalances, i, j);
                    swap(accountIds, i, j);}}
            swap(accountBalances, i + 1, high);
            swap(accountIds, i + 1, high);
            return i + 1;}
        static void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;}
        static void printAccounts(int[] accountIds, int[] accountBalances) {
            for (int i = 0; i < accountIds.length; i++) {
                System.out.println("Account ID: " + accountIds[i] + " | Balance: " + accountBalances[i]);}}}
/*1. Declare an array of size n to store account balances. Initialize with values 0 to 100000 and
sort Account No’s according to highest balance values by using Quick sort, For e.g.:
Account No. 3547 Balance 28000
Account No. 1245 Balance 12000*/