package lec3_exceptionhandling;

public class custom_exception_example  {

	public static void main(String[] args) throws customException {
		
		/// in custom exception we create our on statement that we want to show in output
		try {
			int a=1/0;
			System.out.println(a);
		}
		catch(Exception e) {
			throw new customException("this is custom exception ");
		}
	}
}


