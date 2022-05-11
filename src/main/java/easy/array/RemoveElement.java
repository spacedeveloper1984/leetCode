package easy.array;

/**
 * @author ogayvoronskiy
 * Created at 25.04.2022
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int[] expectedNums = new int[nums.length];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) break;
            if (nums[i] != val) {
                expectedNums[idx++] = nums[i];
            } else {
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[j] != val && nums[j] != -1) {
                        expectedNums[idx++] = nums[j];
                        nums[j] = -1;
                    } else if(nums[j] == val) {
                        nums[j] = -1;
                    }
                }
            }
        }
        System.arraycopy(expectedNums, 0, nums, 0, nums.length);

        return idx;
    }
}
