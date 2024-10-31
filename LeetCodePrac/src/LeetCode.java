import java.util.ArrayList;  
public class LeetCode {

	public static void main(String[] args) {
		
		int nums[] = {4,10,4,3,8,9};
		LeetCode obj = new LeetCode();
		System.out.print(obj.lengthOfLIS(nums)); 
		
	}
	
	public static int lengthOfLIS(int[] nums) {
        // `tempList` will store the smallest tail values of increasing subsequences
        ArrayList<Integer> tempList = new ArrayList<>();

        for (int num : nums) {
            // Find the correct position of `num` in tempList using binary search
            int pos = binarySearch(tempList, num);

            // If `num` is greater than all elements in tempList, add it
            if (pos == tempList.size()) {
                tempList.add(num);
            } else {
                // Replace the element at `pos` with `num` to maintain the smallest possible tails
                tempList.set(pos, num);
            }
        }

        // Length of `tempList` will be the length of the longest increasing subsequence
        return tempList.size();
    }

    // Binary search helper function
    private static int binarySearch(ArrayList<Integer> list, int target) {
        int left = 0, right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == target) {
                return mid;
            } else if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left; // This gives the position to replace or add `target`
    }
}
