public class ReverseNumber
{
    public static void reverse(int n){

   if(n==0){
   return;
   }

   else {
    System.out.print(n%10);

    reverse(n/10);
   }
}
       
    public static void main(String args[]){

        int n = 123;

        System.out.print("Reversed number : ");

        reverse(n);

    }
}