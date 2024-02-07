package lec4_functional_Interface;

public class implent_functional_inteface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//mehtod 1 to implement functional inteface method
//		functional_interface_example obj=new functional_interface_example() {
//	
//			@Override
//			public String display() {
//				// TODO Auto-generated method stub
//				return "this is display method";
//			}
//			
//		};
//	System.out.println(obj.display());
//	
	
	//methos\d 2 to implement functional interface method
		//using lambda expression
		//help tomake code more readible
		//it does not execute on its own
		functional_interface_example obj=()->"this is display function";
		System.out.println(obj.display());
	}
}
