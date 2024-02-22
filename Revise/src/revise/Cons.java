package revise;

public class Cons {
	
public void add(int num1,int num2) {
	int add=num1+num2;
	System.out.println(add);
	
}
    public void sub(int num1,int num2) {
		
    	int sub=num1-num2;
    	System.out.println(sub);
	}
 public void mul(int num1,int num2)
 {
	 int mul=num1*num2;
	 System.out.println(mul);
 }
 public static void main(String[] args) {
	 Cons c1=new Cons();
	 java.util.Scanner sc=new java.util.Scanner(System.in);
	
	 System.out.println("press 1 for adda of the two numbers");
	 System.out.println("press 2 for sub sub of the two numbers");
	 System.out.println("press 3 for mul of the two numberes");
	 System.out.println("enter the choice");
	 int choice=sc.nextInt();
	 System.out.println(" eneter the first value ");
	 int num1=sc.nextInt();
	 System.out.println("eneter the second value");
	 int num2=sc.nextInt();
	switch (choice) {
	
	case 1:c1.add(num1,num2);
	break;
	case 2:c1.sub(num1, num2);
	break;
	case 3:c1.mul(num1, num2);
	break;
	default:System.out.println("error1");
	}
	
	 
	 
	 
	
}
 
	}


