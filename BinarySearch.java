
import java.util.*;
public class BinarySearch {
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter array size : ");
       int n = sc.nextInt();
       int[] array= new int[n];
     
     System.out.println(" Enter array : ");
      
       
       for(int i=0; i <n; i++){
           array[i]= sc.nextInt();
       }
       System.out.println("Array : ");
      
      for(int i=0;i<n;i++){
          System.out.print(array[i] + "\t");
      }
      
      System.out.println();
      
        System.out.print("Enter key : ");
       int key = sc.nextInt();
       
    
      int start = 0;
      int end = n-1;
      int mid = (start+end)/2;

      while(start<=end){
         if(array[mid]<key){
         start = mid+1;
         }
         
         else if(array[mid] == key){
            System.out.println("Element is found at : " + mid);
            break;
         }
        
         else{
           end = mid - 1;
             
         }
           mid = (start+end)/2;
      }
      
    if(start>end)
    System.out.println("Search Unsuccessful : Element not found");
      
   }
   
} 


