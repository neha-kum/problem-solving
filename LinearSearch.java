public class LinearSearch
{
    public static int linearSearch(int a[], int key){
       
      for(int i= 0; i<a.length; i++ ){
          if(a[i]==key)
          return i;
    }
     return -1;
    }
    
	public static void main(String[] args) {
	    int a[]={10,20,30,40};
	    int key = 10;
	    
	     int result = linearSearch(a, key);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "
                             + result);
	
	}
}

