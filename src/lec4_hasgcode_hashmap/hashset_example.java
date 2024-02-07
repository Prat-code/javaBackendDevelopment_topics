package lec4_hasgcode_hashmap;
import java.util.*;

public class hashset_example {

	public static void main(String[] args) {
		// Hashset contain only unique keys
		
		HashSet<Integer >set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println(set.contains(10));
		System.out.println(set.contains(30));

		System.out.println(set.contains(50));
		
		// way to iterate hashset
		//method -1 using for loop
		for(Integer element:set) {
			System.out.println(element+" ");
		}
		
		//method-2-using iterator
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
