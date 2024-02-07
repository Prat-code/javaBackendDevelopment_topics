package lec4_functional_Interface;

public interface parameterized_function_intf_example {

	int displayarea(int length,int breadth);
	
	//deafault,private,static methods can be there in functional inteface
	
		default String display1() {
			return "this is display1";
		}
		
		private String display2() {
			return "this is display1";
		}
		
		static String display3() {
			return "this is display1";
		}
}
