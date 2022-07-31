package org.photon;

import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		
		   String s = "nallasivam";
		   
		   Map<Character,Integer> m = new TreeMap<Character, Integer>();
		   
		   for(int i=0;i<s.length();i++)
		   {
			   char c = s.charAt(i);
			       if(m.containsKey(c))
			          {
			    	      int in = m.get(c);
			    	      in++;
			    	      m.put(c, in);
			          }
		                    else
		                     {
			                     m.put(c, 1);
		                     }
		   }
		
		   System.out.println(m);
	}
}
