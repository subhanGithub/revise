package revise;

import java.lang.reflect.Method;

import java.sql.DriverManager;

public class Test {

  String name;
  int rollno;
  Test(String name,int rollno)

  {
	  this.name=name;
	  this.rollno=rollno;
  }
//  public boolean equals(Object obj)
//  {
//	  try
//	  {
//	String name1=this.name;
//	int rollno1=this.rollno;
//	Test t=(Test)obj;
//	String name2=t.name;
//	int rollno2=t.rollno;
//	if(name1.equals(name2) && rollno1==rollno2)
//	{
//		return true;
//	}else
//	{
//		return false;
//	}
//	  }
//	  catch (ClassCastException e) { return false;}
//	  catch(NullPointerException e) { return false;}
//	  }
  
  public boolean equals(Object obj)
  {  
	  try {
	  Test t=(Test)obj;
	  if(name.equals(t.name) && rollno==t.rollno)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
	  }
	  catch(ClassCastException e) {return false;}
	  catch(NullPointerException e) {return false;}
  }
  public static void main(String[] args) {
	  Test t1=new Test("Subhan",101);
	  Test t2=new Test("sameerr",102);
	  Test t3=new Test("Subhan",101);
	  Test t4=t1;
	  System.out.println(t1.equals(t2));
	  System.out.println(t1.equals(t3));
	  System.out.println(t1.equals(t4));
	  System.out.println(t1.equals("subhan"));
	  System.out.println(t1.equals(null));
	  Object o=new String();
	   Class c=o.getClass()
			   ;System.out.println(c.getName());
		Method[] m=	 c.getDeclaredMethods();
		for(Method m1:m)
		{
			System.out.println(m1.getName());
		}
			   String s="subhn";
			   System.out.println(s);
	  
}
}
