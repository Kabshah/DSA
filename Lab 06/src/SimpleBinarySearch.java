public class SimpleBinarySearch {
        public static void main(String[] args) {
            int[] numbers = new int[20];
            for (int i = 0; i < 20; i++) {numbers[i] = (i + 1) ;}
            int key = 19;int low = 0;
            int high = numbers.length - 1;
            boolean found = false;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (numbers[mid] == key) {
                    System.out.println("Element " + key + " found at index: " + mid);
                    found = true;break;
                } else if (numbers[mid] < key) {low = mid + 1;
                } else {high = mid - 1;}}
            if (!found) {System.out.println("Element " + key + " not found in the array.");}}}
/*1.	Write a program initializing array of size 20 and search an element using binary search.*/