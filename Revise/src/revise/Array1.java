package revise;
import java.lang.reflect.*;
public class Array1 {

	public static void main(String[] args) throws Exception 
	{
	
		//linera search
//	int a[]= {10,20,60,200,50,70,900};
//	int target=200;
//	int result=linerserach(a,target);
//	if(result!=-1)
//	{
//		System.out.println(result);
//	}
//	else
//		
//	{
//		System.out.println("it is not find");
//	}
//	
//}
//
//	public static int linerserach(int[] a, int target) {
//		
//		for(int i=0;i<a.length-1;i++)
//		{
//			if(a[i]==target)
//			{
//				return i;
//			}
//		}
//		return -1;
//	}
		
		//binaryserach

		int a[] ={1,3,5,7,9,10};
		int target=10;
		int count=0;
		 int result=binarysearch(a,target);
		 if(result!=-1)
		 {
			 System.out.println(result);
		 }
		 else
		 {
			 System.out.println("it will index out of bound");
		 }
		

	}
	public static int binarysearch(int[] a, int target) {
		int left=0;
		int right=a.length-1;
		int mid=(left+right)/2;
		int count=0;
		while(left<=right)
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
				right=mid-1;
			}
			mid=(left+right)/2;
			count++;
			System.out.println( "count is"+count);
		
			}
	
		
		return -1;
	
}
}

