package revise;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList a= new ArrayList();
//		a.add("DHONI");
//		a.add("RUTURAJ");
//		a.add("DEVON");
//		a.add("rahane");
//		a.add("DHONI");
//		ArrayList b= new ArrayList();
//		b.add("pathiran");
//		b.add("deepak");
//		b.add("jaddu");
//		System.out.println(b.size());
//		System.out.println(b);
//		a.addAll(b);
//		System.out.println(a);
//		System.out.println(a.containsAll(b));
//		System.out.println(a.isEmpty());
//		a.add(2, 55);
//		System.out.println(a);
//		System.out.println(a.indexOf("DHONI"));
//		System.out.println(a.lastIndexOf("DHONI"));
//		System.out.println(a);
//		LinkedList l= new LinkedList();
//		l.add("subhan");
//		l.add("sameer");
//		l.add("dhoni");
//		l.add("rutu");
//		System.out.println(l);
//		l.addFirst("sameer");
//		System.out.println(l);
//		l.addLast("subhan");
//		System.out.println(l);
//	System.out.println(l.getFirst());
//	System.out.println(l.getLast());
//	System.out.println(l.removeFirst());
//	System.out.println(l.removeLast());
		
    ArrayList a= new ArrayList();
    a.add("DHONI");
    a.add("rutu");
    a.add("rahane");
    a.add("jaddu");
    System.out.println(a);
   ListIterator i=a.listIterator();
    
    while(i.hasNext())
    {
    String s=(String) i.next();
    if(s.equals("DHONI"))
    {
    	i.add("Captain");
    }
    else if(s.equals("rutu"))
    {
    	i.set("GAIKWAD");
    }
    else if(s.equals("jaddu"))
    {
    	i.remove();
    }
    System.out.println(s);
    }
    System.out.println(a);
 }

}
