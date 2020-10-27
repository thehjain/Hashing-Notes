//Here we have given a string. we have to find
//the length of longest substring without any
//repeatations of characters.

//Naive apporach is to find all the substrings and check
//one by one.it will take O(n^3).

//Efficient approach is to use sliding window and hashing.
//We can use hashset and hashmap both but better is to
//use single array of size 128.

public int lengthOfLongestSubstring(String s) {

	int n = s.length(), ans = 0;

	int[] index = new int[128];

	for (int i = 0, j = 0; j < n; j++) {
		i = Math.max(index[s.charAt(j)], i);
		ans = Math.max(ans, j - i + 1);
		index[s.charAt(j)] = j + 1;
	}
	return ans;
}


//Problem is present on leetcode