//Here we have given an array and we have to find
//the longest consecutive sequence in array

//Naive approach is to run three loops and check

//Another optimal solution is to sort an array
//it run loop once and it will give time complexity
//of O(nlogn)

//Fatest solution is to use hashSet and do it in a single
//loop


public int longestConsecutive(int[] nums) {
	Set<Integer> num_set = new HashSet<Integer>();
	for (int num : nums) {
		num_set.add(num);
	}

	int longestStreak = 0;

	for (int num : num_set) {
		if (!num_set.contains(num - 1)) {
			int currentNum = num;
			int currentStreak = 1;

			while (num_set.contains(currentNum + 1)) {
				currentNum += 1;
				currentStreak += 1;
			}

			longestStreak = Math.max(longestStreak, currentStreak);
		}
	}

	return longestStreak;
}



//Problem is available on leetcode