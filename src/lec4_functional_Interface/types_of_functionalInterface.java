package lec4_functional_Interface;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class types_of_functionalInterface {

	public static void main(String[] args) {
	
		
		// consumer functional interface//
		// only accept input does not return anything
		
		Consumer<String> consumer=(c)->{
			String val=" ";
			for(int i=0;i<=3;i++) {
				val=val+c;
			}
			System.out.println("val "+ val);
		};
		
		//giveinput in consumer interface
		consumer.accept("pratyush");

		
		// supplier functional interface//
		// only return value does not take any input
		Supplier<String> supplier=()->"this is supplier functional interfcae";
		System.out.println(supplier.get());
		
		// return random unique ID
		Supplier<String> supplier2=()->UUID.randomUUID().toString();
		System.out.println(supplier2.get());
	}

}
