package lec2_gfg;

public class employee extends person {

	@Override
	// we override the same function of parent class
	public int getAge() {
		return 30;
	}
	
	@Override
	public int getSalary() {
		return 3000;
	}
	@Override
	 public int getWeight() {
	    	return 200;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//loads method of only  employee class
		employee e=new employee();// 1 way
		System.out.println(e.getAge());
		
		// loads method of only person class
		person p=new person();//2nd way
		System.out.println(p.getAge());
		
	//	employee e2=new person();// 3rd way wrong
		
		
		person p1=new employee();//load only method which is in parent class and override in base class
		System.out.println(p1.getAge());  // call age of employee
		System.out.println(p1.getWeight());

		System.out.println(p1.getSalary());
		
	}

}
