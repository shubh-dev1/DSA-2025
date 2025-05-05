package DSA300.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

  private static int firstSolution(int arr[],int n){

    int res = 0;
    int maxCount = 0;
    for(int i =0;i<n;i++){
      int cnt = 1;
      for(int j =0;j<n;j++){
        if(i!= j & arr[i] == arr[j]){
          cnt++;
        }
      }
      if(maxCount < cnt){
        maxCount = cnt;
        res = arr[i];
      }
    }

    return  res;
  }

  private static int secondSolution(int arr[],int n){
    Map<Integer,Integer> map = new HashMap<>();

    for(int i =0;i<n;i++){
      map.put(arr[i], map.getOrDefault(arr[i],0)+1);
    }

    for(Map.Entry<Integer, Integer> mp : map.entrySet()){
      System.out.println(mp.getKey() +"___" + mp.getValue());
    }

    return 2;
  }

  public static void main(String[] args) {
    int arr[] = {2,2,1,1,1,2,2};
    int n = arr.length;

    int result = firstSolution(arr,n);
    int result2 = secondSolution(arr,n);

    System.out.println(result);

  }
}
