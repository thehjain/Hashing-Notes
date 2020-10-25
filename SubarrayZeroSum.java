//We have given an array and we have to find
//the largest subarray sum with zero.

//Naive approach is to find all the subarray and
//check the length of subarray with sum 0.It will
//give correct solution in O(n^3).

//Optimal Solution is to use HashMap. We will store
//the prefix sum with its index. And keep checking the
//sum in hashmap it new made sum is already present that means
//after that sum sum of this subarray is zero.


int maxLen(int arr[], int n) {
	// Your code here
	HashMap<Integer, Integer> map = new HashMap<>();
	int sum = 0;
	int max_len = 0;

	for (int i = 0; i < n; i++) {

		sum += arr[i];

		if (arr[i] == 0 && max_len == 0)
			max_len = 1;
		if (sum == 0)
			max_len = i + 1;

		Integer prev = map.get(sum);

		if (prev != null)
			max_len = Math.max(max_len, i - prev);
		else
			map.put(sum, i);

	}
	return max_len;
}


//Problem is present on geeksforgeeks
