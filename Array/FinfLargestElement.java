public class FinfLargestElement {

    public static int findMax(int A[], int n)
    {
  
      if(n == 1)
        return A[0];
         
        return Math.max(A[n-1], findMax(A, n-1));
    }
 
    // Driver code
    public static void main(String args[])
    {
        int A[] = {1, 4, 45, 6, -50, 10, 2};


        System.out.println(findMax(A, A.length));
    }
}

