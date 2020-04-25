/*Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4

*/


class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0]; 
        int ar_size = nums.length; 
        for (int i = 1; i < ar_size; i++) 
            res = res ^ nums[i]; 
      
        return res; 
        
    }
}


/*Possible Approaches for solving the given problem


As the elements in the list are repeated. Convert the list into a set. A set consists of only unique elements.
Instead of iterating over a complete list which would be complexity O(n). Iterate over the set i.e unique elements only.
Iterate over the set and check the count of that element in the list. If count is 1. Return the element.

Reasons this is better approach

We are not iterating over the complete array of duplicate elements unnecessarily hence making the solution efficient.
Time Complexity - O(n). The complexity of the earlier solution was O(n^2).

Learnings

Time complexity of set is O(1).
Time complexity of list count is 0(n).
Set consists of unique elements.

*/