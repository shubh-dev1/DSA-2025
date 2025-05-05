package DSA300.Arrays.MajorityElements;


public class Main {
  public static void main(String[] args) {
    int arr[] = {1,2,3,1,2,1,1,2,2,2,2};
    int res ;
     //res = BruteForce.majorityElement(arr);
    // res = HashMapSolution.majorityElement(arr);
   //  res = SortingSolution.majorityElement(arr);
    res = OptimizeSolution.majorityElement(arr);
    System.out.println("majority element is: "+ res);
  }
}
