import java.util.ArrayList;
import java.util.List;

class InsertInterval {
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        if (intervals.length == 0) {
            result.add(newInterval);
            return new ArrayList<>(result);
        }

        int i = 0;

        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        result.add(newInterval);

        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }

        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {5, 7},
            {8, 10},
            {12, 16}
        };

        int[] newInterval = {4, 8};

        ArrayList<int[]> result = insertInterval(intervals, newInterval);

        System.out.println("Intervals after insertion:");
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
