public class ReverseArray3 {
    public static void main(String args[])
  {

     int arr[] = {10, 20, 30, 40, 50};

     int end=arr.length-1;
    
    for(int start = 0; start<arr.length ; start++){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        end--;
     }
    for(int i=0; i<arr.length; i++)
       System.out.print(arr[i]+" "); 
    }
}
