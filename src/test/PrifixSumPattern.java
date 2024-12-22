package test;

public class PrifixSumPattern {
	// array {1,2,3,4,5,6} -> {2(i = 1),3,4,5,6 (j = 5)}
	private int[] array;

	public PrifixSumPattern(int[] nums) {
		for (int i = 1; i < nums.length; i++)
			nums[i] = nums[i] + nums[i - 1];
		this.array = nums;
	}

	public int sumRange(int left, int right) {
		return left == 0 ? this.array[right] : this.array[right] - this.array[left - 1];
	};

}
