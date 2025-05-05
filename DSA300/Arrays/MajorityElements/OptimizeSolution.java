package DSA300.Arrays.MajorityElements;

public class OptimizeSolution {

  // Boyer -Moore Voting Algorithm
  //tc - o(n)
  //sc -o(1)
  public static int majorityElement(int arr[]){
    int candidate = arr[0];
    int count = 0;
    for(int a : arr){
      if(count == 0){
        candidate = a;
      }
      count += (a== candidate) ? 1 : -1;
    }
    return candidate;
  }

}
