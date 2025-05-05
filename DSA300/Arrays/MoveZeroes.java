package DSA300.Arrays;

public class MoveZeroes {

  private static int[] firstSolution(int arr[],int n){
    int count = 0;
    for(int i =0;i<n;i++){
      if(arr[i] != 0){
        arr[count++] = arr[i];
      }
    }

    while(count < n){
      arr[count ++] = 0;
    }
    return arr;
  }

  private static int[] secondSolution(int arr[],int n){
    // iterate over the array and swap the non-zero with zero index element

    int zeroIndex = 0;
    int nonZeroIndex = 0;

    while(nonZeroIndex < n){
      if(arr[nonZeroIndex] != 0){
        int temp = arr[nonZeroIndex];
        arr[nonZeroIndex] = arr[zeroIndex];
        arr[zeroIndex] = temp;
        zeroIndex++;
      }
      nonZeroIndex++;
    }

    return arr;
  }



  public static void main(String[] args) {
    int arr[] = {0,1};
    // first solution
    // put the all the non-zero in the arr on the starting index
    // then put zero on rest of the array index
    int n = arr.length;
   int result[] =  firstSolution(arr,n);

   int result1[] = secondSolution(arr,n);
    for(int e : result1){
      System.out.println(e);
    }
  }
}
