import java.util.Arrays;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
	int[] nums = new int[]{6,7,29,28};
	int target = 34;
	System.out.println("nums = " + Arrays.toString(nums) + " ; expected result = " + target);
	System.out.println("real result = " + Arrays.toString(new TwoSum().twoSum(nums,target)));
    }
}
