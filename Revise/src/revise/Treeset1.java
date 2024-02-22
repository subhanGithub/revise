package revise;

import java.util.*;

public class Treeset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedHashMap h= new LinkedHashMap();
       h.put(1, "subhan");
       h.put(2, "sameer");
       h.put(3, "mahi");
       h.put(4, "dhoni");
       h.put("captain", "mahibhai");
       System.out.println(h);
       Set s= h.entrySet();
       System.out.println(h.keySet());
       Iterator it= s.iterator();
       while(it.hasNext())
       {
    	  Map.Entry m= (Map.Entry)it.next();
    	  if(m.getKey().equals("captain"))
    	  {
    		System.out.println(m.setValue(07));  
    	  }
       }
       System.out.println(h);
    		  
    
}}