package BasicProblems.Arrays.Matrix;

public class AllBasicOperation {
  public static void main(String[] args) {
    int arr[] [] = {{1,2,3,4},{5,6,7}};

    // access element
    System.out.println(arr[1][2]);

    // change element
//    arr[1][2] = 34;
//    System.out.println(arr[1][2]);

    // traverse over 2-d array
    for(int i =0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.println(arr[i][j]);
      }
    }

    // using for each loop
    for(int [] row : arr){
      for(int i : row){
        System.out.println(i);
      }
    }
  }
}
