package easy.array;

/**
 * @author ogayvoronskiy
 * Created at 11.05.2022
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int result = 0;
        int[] numsResult = new int[nums.length];
        numsResult[result++] = nums[0];
        for (int i=1; i<nums.length; i++) {
            if (numsResult[result - 1] != nums[i]) {
                numsResult[result++] = nums[i];
            }
        }

        System.arraycopy(numsResult, 0, nums, 0, nums.length);
        return result;
    }
}
