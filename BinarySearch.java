public class BinarySearch {
    public static int Search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid; // return index
            } else if (nums[mid] < target) {
                l = mid + 1;        
            } else {
                r = mid - 1;
            }
        }
        return -1; // not found
    }
  
    public static void main(String[] args) {
        int[] nums = {-1, 2, 5, 9, 34}; // sorted array
        int target = 2;
        System.out.println(Search(nums, target)); // Output: 1
    }
}
