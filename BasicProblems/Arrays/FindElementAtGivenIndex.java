package BasicProblems.Arrays;

public class FindElementAtGivenIndex {

  static int getElementIndex(int arr[],int ele){
    int n = arr.length;
    for(int i =0;i<n;i++){
      if(arr[i] == ele){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[] = {1,5,25,66,242,77};
    int element = 66;

    int idx = getElementIndex(arr,element);
    System.out.println("Given element is present at index "+ idx);
  }
}
