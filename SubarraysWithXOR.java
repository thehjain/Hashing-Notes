//Here we have given an array and value k
//we have to count number of subarray having
//combined xor equal to given value k

//Naive approach is to take all the subarrays
//possible and check which one is giving required
//xor and it will time complexity of O(n^2)

//Efficient approach is to use prefix sum
//subarray technique by storing the prefix xor
//subarray and keep checking the count of required
//xor value


int solve(int[] A, int B) {

	HashMap<Integer, Integer> map = new HashMap<>();

	int count = 0;
	int xor = 0;
	int n = A.length;

	for (int i = 0; i < n; i++) {
		xor = xor ^ A[i];

		if (map.get(xor ^ B) != null)
			count += map.get(xor ^ B);
		if (xor == B)
			count++;

		if (map.get(xor) != null)
			map.put(xor, map.get(xor) + 1);
		else
			map.put(xor, 1);

	}
	return count;
}


//Problem is available on geeksforgeeks