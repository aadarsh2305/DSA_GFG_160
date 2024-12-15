package Searching;

public class PeakElements {

    public int peakElement(int[] arr) {

        if( arr.length == 1 ) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[arr.length-1] > arr[arr.length-2]) return arr.length-1;

        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        PeakElements solution = new PeakElements();
        
        int[] arr1 = {1, 3, 2};
        System.out.println("Peak element index in arr1: " + solution.peakElement(arr1));
        
        int[] arr2 = {5, 3, 2, 1};
        System.out.println("Peak element index in arr2: " + solution.peakElement(arr2));
        
        int[] arr3 = {1, 3, 9, 7, 5};
        System.out.println("Peak element index in arr3: " + solution.peakElement(arr3));

        int[] arr4 = {10};
        System.out.println("Peak element index in arr4: " + solution.peakElement(arr4));

        int[] arr5 = {1, 2, 3, 5, 4};
        System.out.println("Peak element index in arr5: " + solution.peakElement(arr5));
    }
}

