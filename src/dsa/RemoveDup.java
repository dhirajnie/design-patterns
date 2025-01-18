package dsa;

public class RemoveDup {
    static public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        } else {
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                while (j < nums.length && nums[i] == nums[j]) {
                    ++j;
                }
                if(j==nums.length){

                }
                ++i;
                nums[i] = nums[j];

            }
            return i + 1;
        }
    }

    public static void main(String dsa[]) {
        int nums[] = {1,2,2,2,2};
        System.out.println(removeDuplicates(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + ",");
        }
    }
}
