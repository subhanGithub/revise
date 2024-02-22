package revise;

public class BubbleSort {
	
	public static void printarr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
	}

	public static void main(String[] args) {
		int arr[] = {7,8,3,2,1};
		
		//time complexity =O(n^2)
		//bubble sort
		 for(int i=0;i<arr.length-1;i++) //n-1 times//it is used sort the large element at the end of the array
		 {
			 for(int j=0;j<arr.length-i-1;j++) //for the iteraion of the comparison
			 {
				
				 if(arr[j]>arr[j+1])
				 {
					 //swap
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }
			 }
		 }
		 printarr(arr);
	}

}
