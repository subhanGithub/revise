package revise;

public class Stri {
	
	String name;
	int age;
	Stri(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		
		return name+"___________"+age;
	}
 @Override
public int hashCode() {
	return age;
}
 @Override
public boolean equals(Object obj) {
	 try
	 {
		 
	 
	Stri s2=(Stri) obj;
	if(name.equals(s2.name)&& age==s2.age)
	{
		return true;
	}
	else
	{
		return false;
	}
	 }
	 catch (ClassCastException e) {
		return false; 
	}
	 catch (NullPointerException e) {
		 return false;
		
	}
  
	
}
        public static void main(String[] args) {
		Stri s1= new Stri("subhan",90);
		Stri s2= new Stri("sameer",405);
		Stri s3= new Stri("subhan",90);
		Stri s4= s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("subhan"));
		System.out.println(s1.equals(null));
		Boolean b1=new Boolean("subhan");
		Boolean b2=new Boolean("true");
		System.out.println(b1);
		System.out.println(b2);
		
		
		System.out.println(b1.equals(b2));
		
	}
}
