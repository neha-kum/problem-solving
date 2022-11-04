import java.util.Arrays;

public class SecondSmallest {

    public static int getSecondSmallest(int[] a, int total) {
        Arrays.sort(a);
        return a[1];
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 5, 6, 3, 2 };

        System.out.println("Second Smallest: " + getSecondSmallest(a, 6));

    }
}
