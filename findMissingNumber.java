/*
Find the Missing Number - Hash Map

Given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in list. One of the integers is missing in the list. Write an efficient code to find the missing integer. 

Example:
Input : arr[] = [1, 2, 3, 4, 6, 7, 8]
Output : 5

Input : arr[] = [1, 2, 3, 4, 5, 6, 8, 9]
Output : 7

Constraints:
  Time: O(n)
  Space: O(n)
  
public int findMissingNumber(int[] nums){

}


Psuedo:

//  sort the array
// for loop if != .. return n

*/







import java.util.HashSet;

public class Main {
  public static int findMissingNumber(int[] arr, int n) {
    HashSet<Integer> map= new HashSet<Integer>();

    // Step 1: populate hash
    for (int i : arr) {
      map.add(i);
    }

    // Step 2: find missing num
    // int expectedValue = i+1;
    // Input : arr[] = [1, 2, 3, 4, 6, 7, 8]
    
    for (int i=0; i < n; i++) { // 1
      int expectedValue = i+1;  // 2
      if (!map.contains(expectedValue)) { 
        return expectedValue;
      }
    }
    return 0;
  }
  // 22min

  // Test Log
  public static void main(String[] args) {
    int[] arr = {1, 2, 4, 6, 3, 5, 8, 9};
    int n = arr.length;
  
    int missingNumber = findMissingNumber(arr, n);
    System.out.println("Missing number is: " + missingNumber); // Output: 7
  }
}


//