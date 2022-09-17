
import java.util.*;
public class BubbleSort
{
	public static void main(String[] args) {
	    int[] arr={1,3,2,4,5};
	    
	    System.out.println("Array before bubble sort : ");
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	    
	 bubbleSort(arr);
	 
	 System.out.println("Array after bubble sort : ");
	 for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i] + " ");
	    }
	}
	
	static void bubbleSort(int[] arr){
	    int temp;
	    boolean swapped;
	    
	   for(int i=0;i<arr.length;i++){
	       swapped=false;
	       
	       for(int j=1;j<arr.length-1;j++){
	           
	           if(arr[j-1]>arr[j]){
	               
	               temp= arr[j-1];
	               arr[j-1]=arr[j];
	               arr[j]=temp;
	               
	               swapped= true;
	           }
	     
	       }
	       if(swapped == false){      //  if(!swapped)           // !false = true-->statement
	           break;
	       }
	   }
   }
}





