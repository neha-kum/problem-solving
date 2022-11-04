public class FindSmallestAndLargest {

  static int getmin(int arr[], int n){
     if(n==1)
       return arr[0];

     return Math.min(arr[n-1], getmin(arr, n-1));
  }
  static int getmax(int arr[], int n){
     if(n==1)
      return arr[0];

     return Math.max(arr[n-1], getmax(arr, n-1));
  }
  public static void main(String args[])
  {

    int arr[] = {12, 13, 1, 10, 34, 10};
    int n = arr.length;
    System.out.println(getmin(arr, n));
    System.out.println(getmax(arr, n)); 
   }
}

