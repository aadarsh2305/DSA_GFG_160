import java.util.Arrays;

public class MergeWithoutExtraSpace{
    
    public void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;

        int i = n - 1;
        int j = 0;

        while (i >= 0 && j < m) {
            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;

                i--;
                j++;
            } else {
                break;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);
    }

    public static void main(String[] args) {
        MergeWithoutExtraSpace solution = new MergeWithoutExtraSpace();

        int[] a = {1, 5, 9, 10, 15};
        int[] b = {2, 3, 8, 13};

        System.out.println("Before merging:");
        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));

        solution.mergeArrays(a, b);

        System.out.println("After merging:");
        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
    }
}
