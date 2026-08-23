import java.util.Arrays;

class Solution {
    private static final int[] PERFECTS = {6, 28, 496, 8128, 33550336};

    public boolean checkPerfectNumber(int num) {
        return Arrays.binarySearch(PERFECTS, num) >= 0;
    }
}
