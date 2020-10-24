//We have given an array and target value
//We have to find all the unique quadruplets of an array
//whose sum is equal to target value

//Naive approach is to use four loop and time complexity
//will be O(n^4) here

//Optimal solution is to use three loops and for fourth
//value use binary search time complexity here will be
//O(n^3logn)

//Best approach is to use two loops and for third and fourth
//element perform two sum apprach or two pointer approach

public List<List<Integer>> fourSum(int[] nums, int target) {
	Arrays.sort(nums);

	int index = 0;
	List<List<Integer>> res = new ArrayList<>();

	if (nums == null || nums.length == 0)
		return res;

	int n = nums.length;

	for (int i = 0; i < n; i++) {
		for (int j = i + 1; j < n; j++) {

			int target2 = target - nums[i] - nums[j];

			int front = j + 1;
			int back = n - 1;

			while (front < back) {

				int twoSum = nums[front] + nums[back];

				if (twoSum > target2) back--;
				else if (twoSum < target2) front++;

				else {

					res.add(new ArrayList<Integer>());

					res.get(index).add(nums[i]);
					res.get(index).add(nums[j]);
					res.get(index).add(nums[front]);
					res.get(index).add(nums[back]);

					while (front < back && nums[front] == res.get(index).get(2)) ++front;
					while (front < back && nums[back] == res.get(index).get(3)) --back;
					index++;
				}

			}
			while (j + 1 < n && nums[j] == nums[j + 1]) ++j;
		}
		while (i + 1 < n && nums[i] == nums[i + 1]) ++i;
	}

	return res;

}


//Problem is avialable on leetcode