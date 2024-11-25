class Max_Product_Subarray {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        int n = arr.length;
        if(n == 0) return 0;

        int max = arr[0], min = arr[0], result = arr[0];

        for(int i = 1; i < n; i++) {
            // If current element is negative, swap max and min
            if(arr[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            // Update max and min product
            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);

            // Update the result if needed
            result = Math.max(result, max);
        }

        return result;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Max_Product_Subarray solution = new Max_Product_Subarray();

        // Test case 1
        int[] arr1 = {2, 3, -2, 4};
        System.out.println("Max product subarray (Test case 1): " + solution.maxProduct(arr1));  // Expected: 6

        // Test case 2
        int[] arr2 = {-2, 0, -1};
        System.out.println("Max product subarray (Test case 2): " + solution.maxProduct(arr2));  // Expected: 0

        // Test case 3
        int[] arr3 = {-2, 3, -4};
        System.out.println("Max product subarray (Test case 3): " + solution.maxProduct(arr3));  // Expected: 24

        // Test case 4
        int[] arr4 = {-1, -3, -10, 0, 60};
        System.out.println("Max product subarray (Test case 4): " + solution.maxProduct(arr4));  // Expected: 60
    }
}

