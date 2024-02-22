package revise;

public class search {
	public static void main(String[] args) {
		int a[]= {10,20,40,15,35};
		int target=15;
		int result=linearsearch(a,target);
		if(result!=-1)
		{
			System.out.println("the osition of the letter is"+result);
		}
	}

	public static int linearsearch(int[] a, int target) {
		
		int left=0;
		int right =a.length-1;
		int mid=(left+right)/2;
		while(left <=right)
		{
			if(a[mid]==target)
			{
				return mid;
			}
			else if(a[mid]<target)
			{
				left=mid+1;
			}
			else
			{
				right =mid-1;
			}
			mid=(left+right)/2;
		}
		
		return -1;
	}

}
