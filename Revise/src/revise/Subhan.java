package revise;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.Vector;

public class Subhan {
	String name;
	int id;
	Subhan(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	 public boolean equals(Object o)
	 {
		 try
		 {
		Subhan s=(Subhan) o;
		if(name.equals(s.name) && id==id)
		{
			return true;
		}
		else 
		{
			return false;
		}}
		 catch(ClassCastException e) {return false;}
		 catch(NullPointerException e) {return false;}
//		 
	 }
	 public int hashcode()
	 {
		 return id;
	 }
		 //public String toString()
//	 {
//		 return name+   +id;
//	 }
  public static void main(String[] args) {
	Subhan s1= new Subhan("subhan",404);
	Subhan s2=new Subhan("Divya",403);
	Subhan s3= new Subhan("subhan",404);
	Subhan s4=s1;
	System.out.println(s1);
	System.out.println(s1.hashCode());
	System.out.println(s1.equals(s4));
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals("subhan"));
	System.out.println(s1.equals(null));
	Collection o=new HashSet();
	Class c=o.getClass();
	System.out.println(c.getName());
	Method[] m=   c.getDeclaredMethods();
	for(Method m1:m)
	{
		System.out.println(m1.getName());
	}
	
	Integer i=new Integer("20");
	System.out.println(i);
	int f=10;
	String r=Integer.toBinaryString(10);
	System.out.println(r);
	
	
	Integer j=Integer.parseInt("403");
	System.out.println(j);
	
	
	Boolean b1=new Boolean("subhan");
	Boolean b2=new Boolean("true");
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b1.equals(b2));
	
	
	
	
	
	
}
		
}
	
	
