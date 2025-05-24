public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};int[] array2 = {3, 4, 5, 6, 7};
        int [] merged_Array = new int[array1.length + array2.length];
        // {0,0,0,0,0,0,0,0,0,0} 10 places
        int idx = 0;
        for(int i =0; i<array1.length; i++){
            // merged_Array[0]    array1[0]=1
            merged_Array[idx++] = array1[i];}
        for(int j = 0; j<array2.length; j++){
                // merged_Array[0]    array2[0]=3
                merged_Array[idx++] = array2[j];}
            PrintArr(merged_Array);}
        public static void PrintArr(int []arr){
            for (int i = 0; i<arr.length; i++){
                System.out.print(arr[i]+" ");}}}
/*2. Add a method in the class that takes array and merge it with the existing one.*/