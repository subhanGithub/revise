package revise;

public class Mergesort {
	
	public static void divide(int arr[],int si,int ei)
	{
		if(si>=ei)
		{
			return;
		}
		int mid=si+(ei-si)/2;
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		conqure(arr,si,mid,ei);
	}

	public static void conqure(int[] arr, int si, int mid, int ei) {
		int merged[]=new int[ei-si+1]; // it is used to store the sorted array
		int idx1=si;
		int idx2=mid+1;
		int x=0;
		while(idx1<=mid && idx2<=ei)  //here we are comparing the two sorted sub arry
		{
			if(arr[idx1]<=arr[idx2])
			{
				merged[x++]=arr[idx1++];
			}
			else
			{
				merged[x++]=arr[idx2++];
			}}
		
		while(idx1<=mid)
		{
			merged[x++]=arr[idx1++];
		}
		while(idx2<=ei)
		{
			merged[x++]=arr[idx2++];
		}
		
		for(int i=0,j=0;i<merged.length;j++,i++) 
		{
			arr[j]=merged[i];   //after sorting the array we are storing into mered array to original array 
		}
		
	}

	public static void main(String[] args) {
	
		int arr[] = {6,3,9,5,2,8};
		int n=arr.length;
		
		divide(arr,0,n-1);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}

	}

}
