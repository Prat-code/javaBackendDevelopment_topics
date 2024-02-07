package lec3_exceptionhandling;

public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a=1/0;
			System.out.println(a);
		}
		//catch show at which line error occur
		catch(Exception e){
			e.printStackTrace();
		}
		//finally part always run if error is there or not
		finally {
			System.out.println("we are at line 18");
		}
		
		int b=10;
		System.out.println(b);
	}

}
