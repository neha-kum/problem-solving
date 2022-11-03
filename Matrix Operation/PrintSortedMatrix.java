import java.util.Arrays;
public class PrintSortedMatrix {
    public static void main(String[] args){

int[][] matrix= {
    {1,10,17},
    {2,11,18},
    {4,12,20}
};

int row = 3;
int column = 3;
int[] arr= new int[row*column];
int n=0;

for(int i =0; i<row; i++){
    for(int j=0; j<column; j++){
        arr[n++] = matrix[i][j];
    }
}

Arrays.sort(arr);

for(int i=0; i<arr.length; i++){
    System.out.print(arr[i] + " ");
}
    }
}