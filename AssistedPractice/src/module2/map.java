package module2;

import java.util.*;

public class map {
	public static void main(String[] args) {
		// Hash map
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "abc");
		hm.put(102, "pqr");
		hm.put(103, "xyz");
		
		System.out.println("\nThe elements of Hashmap are ");
		for (Map.Entry i : hm.entrySet()) {
			System.out.println(i.getKey() + " " + i.getValue());
		}
		
		//HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(10,"Honda");  
	      ht.put(11,"Benz");  
	      ht.put(12,"Toyota");  
	      ht.put(13,"BMW");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry j:ht.entrySet()){    
	       System.out.println(j.getKey()+" "+j.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(1,"Cat");    
	      map.put(2,"Dog");    
	      map.put(3,"Rabbit");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry k:map.entrySet()){    
	       System.out.println(k.getKey()+" "+k.getValue());    
	      }    

	}

}
