package exercice;

import java.util.*;

public class IntervalIntersection {
    static class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static boolean intervalsOverlap(Interval[] intervals) {
        if (intervals == null || intervals.length < 2) {
            return false;
        }

        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval.start));

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < intervals[i - 1].end) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Interval[] intervals1 = {new Interval(1, 3), new Interval(5, 7), new Interval(2, 4), new Interval(6, 8)};
        System.out.println(intervalsOverlap(intervals1)); // Expected output: false

        Interval[] intervals2 = {new Interval(1, 3), new Interval(7, 9), new Interval(4, 6), new Interval(10, 13)};
        System.out.println(intervalsOverlap(intervals2)); // Expected output: true
    }
}
