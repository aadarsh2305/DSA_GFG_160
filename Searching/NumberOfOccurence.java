package Searching;

public class NumberOfOccurence {
    public static void main(String[] args) {
        NumberOfOccurence solution = new NumberOfOccurence();
        
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        
        int resultBinarySearch = solution.countFreqUsingBinarySearch(arr, target);
        System.out.println("Frequency using Binary Search: " + resultBinarySearch);
        
        int resultLinearSearch = solution.countFreqUsingLinearSearch(arr, target);
        System.out.println("Frequency using Linear Search: " + resultLinearSearch);
    }

    int countFreqUsingBinarySearch(int[] arr, int target) {
        int firstIndex = binarySearch(arr, target, true);
        
        if (firstIndex == -1) {
            return 0;
        }
        
        int lastIndex = binarySearch(arr, target, false);
        
        return lastIndex - firstIndex + 1;
    }

    private int binarySearch(int[] arr, int target, boolean findFirst) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (findFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    int countFreqUsingLinearSearch(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}

