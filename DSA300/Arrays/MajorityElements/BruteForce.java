package DSA300.Arrays.MajorityElements;

public class BruteForce {

  // iterate over the array and check the occurrence of each element and check if the count of a number is greater than the half of the length.
  // assume there is always a majority element
  // TC - O(N*2)
  //SC- O(1)
  public static int majorityElement(int nums[]){
    int n = nums.length;
    for(int i =0;i<n;i++){
      int count = 0;
      // count occurrence of nums[i]
      for(int j=0;j<n;j++){
        if(nums[j] == nums[i]){
          count++;
        }
      }
      if(count > n/2){
        return nums[i];
      }
    }
    return -1;
  }

}
