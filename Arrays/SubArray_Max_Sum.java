class SubArray_Max_Sum {
    int maxSubarraySum(int[] arr) {
        int n = arr.length;

        if (n == 0) {
            return 0;
        }

        int max_ending_here = arr[0];
        int max_so_far = arr[0];

        for (int i = 1; i < n; i++) {
            max_ending_here = Math.max(arr[i], max_ending_here + arr[i]);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        SubArray_Max_Sum solution = new SubArray_Max_Sum();

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        int result = solution.maxSubarraySum(arr);
        
        System.out.println("The maximum subarray sum is: " + result);
    }
}
