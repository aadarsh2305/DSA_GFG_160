package Searching;

public class SortedAndRotatedMinimum {
    public int findMin(int[] arr) {
        int shortest = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] < shortest){
                shortest = arr[i];
            }
        }
        return shortest;
    }

    public static void main(String[] args) {
        SortedAndRotatedMinimum sortedAndRotatedMinimum = new SortedAndRotatedMinimum();
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        System.out.println(sortedAndRotatedMinimum.findMin(arr));
    }
}
