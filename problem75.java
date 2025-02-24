package leetCode;

import java.util.Arrays;

class problem75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    //Bubble sort.
    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}

