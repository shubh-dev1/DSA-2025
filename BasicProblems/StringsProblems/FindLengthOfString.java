package BasicProblems.StringsProblems;

public class FindLengthOfString {
  public static void main(String[] args) {
    String str = "Amazon";
    System.out.println(str.length());

    int count = 0;
    for(int i =0;i<str.length();i++){
      count++;
    }
    System.out.println(count);
  }
}
