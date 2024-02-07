package lec3_exceptionhandling;
import java.io.FileNotFoundException;
import java.util.*;

public class checked_exception_example {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			A();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void A() {
		try {
		  B();	
		}
		//multiple catch block,it print what type of ecpetion it catch
		catch(ArithmeticException e){
			System.out.println("this is arithmetic exception");
		}
		catch(FileNotFoundException e) {
			System.out.println("this is file not found exception");
		}
		
	}


	// B method throw check excpetion
	public static void B() throws FileNotFoundException {
		throw new FileNotFoundException();
		
		
	}

}
