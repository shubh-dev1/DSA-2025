package DSA300.Arrays.MajorityElements;


import java.util.HashMap;

public class HashMapSolution {

  //us hashmap to store the frequency of each element and check if the frequency of element is greater than n/2 then return the num
  //tc- o(n)
  //sc - o(n) storing the element

  public static  int majorityElement(int nums[]){
    HashMap<Integer,Integer> map = new HashMap<>();
    int n = nums.length;
    for(int num : nums){
      map.put(num,map.getOrDefault(num,0)+1);
      if(map.get(num) > n/2){
        return num;
      }
    }
    return -1;

  }
}
