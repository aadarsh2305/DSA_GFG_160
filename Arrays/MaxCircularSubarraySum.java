public class MaxCircularSubarraySum {

    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        int n = arr.length;

        // Find the maximum subarray sum using Kadane's Algorithm.
        int maxTotal = maxSubarraySum(arr);

        // Calculate the total sum of the array elements.
        int total_sum = 0;
        for (int i : arr) {
            total_sum += i;
        }

        // Find the minimum subarray sum using a modified Kadane's Algorithm.
        int minTotal = minSubarraySum(arr);

        // Calculate the circular subarray sum.
        int circularSum = total_sum - minTotal;

        // If the array contains only one element or all elements are negative,
        // the circular subarray sum will be zero, so return the max subarray sum.
        if (circularSum == 0) {
            return maxTotal;
        }

        // Return the maximum of the maximum subarray sum and the circular subarray sum.
        return Math.max(maxTotal, circularSum);
    }

    // Function to find the maximum subarray sum using Kadane's algorithm.
    public int maxSubarraySum(int arr[]) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }

        int sum = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
        }
        return max;
    }

    // Function to find the minimum subarray sum using a modified Kadane's algorithm.
    public int minSubarraySum(int arr[]) {
        int n = arr.length;

        int sum = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            sum = Math.min(arr[i], sum + arr[i]);
            min = Math.min(min, sum);
        }
        return min;
    }

    public static void main(String[] args) {
        MaxCircularSubarraySum solution = new MaxCircularSubarraySum();

        // Test case 1
        int[] arr1 = {8, -8, 9, -9, 10, -11, 12};
        System.out.println("Maximum Circular Subarray Sum: " + solution.circularSubarraySum(arr1));

        // Test case 2
        int[] arr2 = {5, -3, 5};
        System.out.println("Maximum Circular Subarray Sum: " + solution.circularSubarraySum(arr2));

        // Test case 3
        int[] arr3 = {-2, -3, -4, -1, -2};
        System.out.println("Maximum Circular Subarray Sum: " + solution.circularSubarraySum(arr3));
    }
}

