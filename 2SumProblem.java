//Here we have an array and target value
//We have to find indices of two such elements
//that their sum must be equal to target value


//Brute Force is to run loop two times

//Optimal apprach is to use hasmap

public int[] twoSum(int[] nums, int target) {
	Map<Integer, Integer> map = new HashMap<>();
	int i = 0;
	for (int ele : nums) {
		int temp = target - ele;
		if (map.containsKey(temp))
			return new int[] {map.get(temp), i};
		map.put(nums[i], i);
		i++;
	}
	return new int[] {0};
}


//Question is available on leetcode