package DSA300.Arrays.BestTimeToSellOrBuyStocks;

public class BruteForce {

  // Tc - 0(N*2)
  //SC -O(1)

  public static int maxProfit(int arr[]){
    int maxProfit = 0;
    for(int i =0;i<arr.length;i++){
      for(int j = i+1;j<arr.length;j++){
        int profit = arr[j] - arr[i];
        if(profit > arr[i] && profit > maxProfit){
          maxProfit = profit;
        }
      }
    }
    return maxProfit;
  }
}
