public class InsertionSort {
	
	static void sortArray(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int current = arr[i];
			int j = i - 1;
            
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = current;
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = { 7, 3, 10, 4, 1, 11 };

System.out.print("Before insertion sort : ");
for(int i : arr){
 System.out.print(i + " ");
}
System.out.println();
	 
	sortArray(arr);
System.out.print("After insertion sort : ");

		printArray(arr);

	}
} 


