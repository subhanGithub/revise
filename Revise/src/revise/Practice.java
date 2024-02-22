package revise;

public class Practice {

	public static void main(String[] args) {
	
		String a[]= {"subhan","dhoni","mahi","rutu"};
		String temp; 
		int min;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j].compareTo(a[min])<0)
				{
					min=j;
				}
				
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		
		for(String  i:a)
		{
			System.out.println(i);
		}
		
	}

}
