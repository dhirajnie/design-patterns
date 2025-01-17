package dsa;

public class MinimumSizeSubArray {

    static public int minSubArrayLen(int target, int[] nums) {
        int curSum = nums[0];
        if (curSum >= target) {
            return 1;
        }
        int j = 0;

        int minLength = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length ; i++) {
            curSum += nums[i];
            while (curSum >= target && j <= i) {
                System.out.println(curSum+" ( i:"+i+"j:"+j+" ) ");
                if (minLength > (i - j + 1)) {
                    minLength = i - j + 1;
                }
                curSum -= nums[j];
                ++j;

            }

        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }


    public static void main(String[] args) {
        int nums[] = {1,1,1,1};

        System.out.println(minSubArrayLen(7, nums));
    }
}
