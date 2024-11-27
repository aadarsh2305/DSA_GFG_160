import java.util.Arrays;

class SmallestPositiveMissingNumber {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {

        Arrays.sort(arr);
        
        int expected = 1;
        
        for(int num : arr){
            if(num == expected){
                expected++;
            }
        }
        return expected;
    }

    public static void main(String[] args) {
        SmallestPositiveMissingNumber spmn = new SmallestPositiveMissingNumber();

        // Test case 1
        int[] arr1 = {3, 4, -1, 1};
        System.out.println("The smallest missing positive number is: " + spmn.missingNumber(arr1)); // Output should be 2

        // Test case 2
        int[] arr2 = {1, 2, 0};
        System.out.println("The smallest missing positive number is: " + spmn.missingNumber(arr2)); // Output should be 3

        // Test case 3
        int[] arr3 = {7, 8, 9, 11, 12};
        System.out.println("The smallest missing positive number is: " + spmn.missingNumber(arr3)); // Output should be 1

        // Test case 4
        int[] arr4 = {1, 2, 3};
        System.out.println("The smallest missing positive number is: " + spmn.missingNumber(arr4)); // Output should be 4
    }
}
