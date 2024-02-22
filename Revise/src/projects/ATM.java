package projects;

public class ATM {
static String username="subhan";
static int password=1234;
static int currentbalance=10000;

public void login(String name, int pass)
{
	while(true)
	if(username.equalsIgnoreCase(name) && password ==pass)
	{
		System.out.println("login succesfully completed");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Type 1:current balance of the account");
		System.out.println("Type 2:deposite the money of the account");
		System.out.println("Type 3:withdrawl the money of the account");
		System.out.println("Type 4:exit");
		System.out.println("Enter the number your choice");
		int choice=sc.nextInt();
		System.out.println("enter the money");
		int amount=sc.nextInt();
		
		switch(choice)
		{
		case 1:currentbalance(); break;
		case 2:deposite(amount);break;
		case 3:withdraw1(amount); break;
		case 4:System.out.println("UR TRANSCATION IS NOT COMPLETED PLEASE ENTER ONE MORE TIME ");
		}
	}
	else
	{
	 System.out.println("invalid user name and password");
	 break;
	}
}
public void currentbalance()
{
	System.out.println("THE AMOUNT IS HAVING  IN THE ACCOUNT IS  ="+currentbalance);
}
public void deposite (int amount)

{
	currentbalance=currentbalance+amount;
	System.out.println("THE AMOUNT IS DEPOSITED IN THE ACCOUNT IS  ="+currentbalance);
}
public void withdraw1(int amount)

{
	currentbalance=currentbalance-amount;
	System.out.println("THE AMOUNT IS WITHDRAWL IN THE ACCOUNT IS  ="+currentbalance);
}

public static void main(String[] args) {
	
	while(true)
	{
	ATM  at=new ATM();
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("ENTER THE USERNAME ");
	String name=sc.next();
	System.out.println("ENTER THE PASSWORD");
	int pass=sc.nextInt();
	at.login(name, pass);
	}
}
}
