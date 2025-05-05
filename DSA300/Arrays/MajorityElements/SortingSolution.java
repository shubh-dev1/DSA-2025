package DSA300.Arrays.MajorityElements;

import java.util.Arrays;

public class SortingSolution {


  // sort the array the majority element will be present in the middle of the array as we know
  public static int majorityElement(int arr[]){
    Arrays.sort(arr);
    return arr[arr.length/2];
  }
}
