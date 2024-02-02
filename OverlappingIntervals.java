import java.util.Stack;
import java.util.*;
public class OverlappingIntervals {
    public static boolean checkOverlappingIntervals (long[] startTime, long[] endTime) {
        Stack<Long> stack = new Stack<>();
         for (int i=1; i<startTime.length; i++) {
            if (startTime[i]<startTime[i-1] && endTime[i]<endTime[i-1]) {
                continue;
            }
            if (startTime[i] < endTime[i-1] || startTime[i-1] > endTime[i]) {
                return true;
            }
        }
        return false;
    }
}
