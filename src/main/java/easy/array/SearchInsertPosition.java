package easy.array;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int height = nums.length - 1;
        int middle = height/2;

        if (nums[0] > target) return 0;
        if (nums[height] < target) return nums.length;

        while (low <= height) {
            if (nums[low] == target) return low;
            if (nums[height] == target) return height;

            if (nums[middle] == target) return middle;

            if (nums[middle] < target) {
                low = middle + 1;
            } else if (nums[middle] > target) {
                height = middle - 1;
            }
            middle = low + (height - low) / 2;
        }
        return low != 0 && nums[low] > target && nums[low - 1] < target ? low : -1;
    }
}