package leetCode;

public class problem4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        int[] mergedNums = new int[nums1.length + nums2.length];

        int index = 0;
        for (int num : nums1) {
            mergedNums[index++] = num;
        }
        for (int num : nums2) {
            mergedNums[index++] = num;
        }

        //Bubble sort.
        for (int i = 0; i < mergedNums.length - 1; i++) {
            for (int j = 0; j < mergedNums.length - 1 - i; j++) {
                if (mergedNums[j] > mergedNums[j + 1]) {
                    int temp = mergedNums[j];
                    mergedNums[j] = mergedNums[j + 1];
                    mergedNums[j + 1] = temp;
                }
            }
        }

        double median = 0;
        if (mergedNums.length % 2 == 0) {
            median = (double) (mergedNums[mergedNums.length / 2] + mergedNums[(mergedNums.length / 2) -1]) / 2;
        } else {
            median = mergedNums[mergedNums.length / 2];
        }
        System.out.println(median);
    }
}
