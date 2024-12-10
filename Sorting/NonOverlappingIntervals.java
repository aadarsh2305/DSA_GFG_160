import java.util.Arrays;

class NonOverlappingIntervals {
    static int minRemoval(int intervals[][]) {
        if(intervals == null || intervals.length == 0){
            return 0;
        }
        
        // Sort intervals based on their end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        
        int last_end = intervals[0][1];
        int count = 0;
        
        // Iterate through the intervals
        for (int i = 1; i < intervals.length; i++) {
            // If current interval overlaps with the last one, increment the count
            if (intervals[i][0] < last_end) {
                count++;
            } else {
                // If no overlap, update the last_end to the current interval's end
                last_end = intervals[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Sample input for intervals: [start, end]
        int[][] intervals = {
            {1, 3},
            {2, 4},
            {3, 5},
            {5, 7},
            {1, 2},
            {4, 6}
        };
        
        // Call minRemoval to find the minimum number of intervals to remove
        int result = minRemoval(intervals);
        
        // Output the result
        System.out.println("Minimum intervals to remove: " + result);
    }
}
