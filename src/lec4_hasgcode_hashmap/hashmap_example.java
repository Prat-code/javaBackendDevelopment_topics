package lec4_hasgcode_hashmap;
import java.util.*;
public class hashmap_example {

	public static void main(String[] args) {
		// hashmap
		// store daya in key-value pair
		// only 1 null key possible
		//more than 1 null value possible
		//hashmap order is not maintain
		//linnkedloist hashmap order is maintain

		
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(1, 100);
		map.put(2,200);
		map.put(1,null);
	    System.out.println(map.get(1));

	    System.out.println(map.get(2));
		HashMap<Integer,String> map2=new HashMap<>();
		map2.put(11,"abc");
		map2.put(2,"rashi");
		
		

		HashMap<people,Boolean> map3=new HashMap<>();
		people p1=new people();
	    p1.name="abc";
	    p1.age=21;
	    p1.id=1;
	    p1.phnno=1234;
	    
	    people p2=new people();
	    p2.name="abc";
	    p2.age=21;
	    p2.id=1;
	    p2.phnno=1234;
	    // inserr people object in hashmap
	    map3.put(p1, true);
	    map3.put(p2, true);
	    
	    // toString give o/p in string format of objects value
	    System.out.println(map3.toString());
	    //System.out.println(map3);
	    System.out.println(p1.hashCode());

	    System.out.println(p2.hashCode());
	    
	    
	    
		
		
		
	}

}
