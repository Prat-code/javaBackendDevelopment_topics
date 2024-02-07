package com.oops.Basics_2;

public class person {

	// access modifier-private,public,default,protected
	//private -access within the { }
	//public-access anywhere
	//protected-access within same package and ingerited class
	//deafualt-access within  paackage
	private String name;
     public int age;
	protected String address;
	           int phnno;
	           
	// getter n setters-part of encapuslation-use to CCESS PVT DATA MEMBERS
	 public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public int getPhnno() {
				return phnno;
			}
			public void setPhnno(int phnno) {
				this.phnno = phnno;
			}
			
	// default constructor
	 person(){
		 
	 }
	// parameterized  constructor
	 person(String name, int age, String address, int phnno) {
		super();		
		 this.name = name;
				this.age = age;
				this.address = address;
				this.phnno = phnno;
			}



	@Override
			public String toString() {
				return "person [name=" + name + ", age=" + age + ", address=" + address + ", phnno=" + phnno + "]";
			}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create object and then memory is allocate dot object
		person p=new person("xyz",20,"goa",9022);  
		// manually giving value to datamembera og preson class

		p.name="abc";
		p.age=20;
		p.address="Delhi";
		p.phnno=9393131;
		
		p.toString();
		
		
		
	}


}
