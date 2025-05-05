package DSA300.Arrays.RemoveDuplicateFromTheSortedArray;

public class TwoPointerApproach {

  public static int removeDuplicate(int arr[]){
    //// check if there is no element in the array then return 0
    if(arr.length == 0) return 0;

    // use two pointer technique to remove the duplicates
    // first pointer will use to track all the unique element and  count
    // second pointer will iterate over the array

    int i = 0;
    for(int j=1;j<arr.length;j++){
      if(arr[i] != arr[j]){
        i++;
        arr[i] = arr[j];
      }
    }
    return i+1;
  }
}
