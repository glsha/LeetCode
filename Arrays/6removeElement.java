/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, 
to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain 
the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
     */

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3}; // Input array
        int val = 3; // Value to remove
        int[] expectedNums = new int[nums.length];
        int index = 0;
        
        for(int i=0; i < nums.length; i++){
            if(nums[i] != val){
                expectedNums[index++] = nums[i]; 
            }
        }
        System.out.print(Arrays.toString(expectedNums));
        // int[] expectedNums = [...]; // The expected answer with correct length.
        //                             // It is sorted with no values equaling val.

        // int k = removeElement(nums, val); // Calls your implementation

        // assert k == expectedNums.length;
        // sort(nums, 0, k); // Sort the first k elements of nums
        // for (int i = 0; i < actualLength; i++) {
        //     assert nums[i] == expectedNums[i];
        // }
    }
}
