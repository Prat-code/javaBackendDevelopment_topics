package com.oops.Basics_2;

// inherit form person class
public class person2 extends person {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       person2 p2=new person2();
       // we cannot access private data members
      // p2.name="abss";
       p2.age=28;
       // we can access protected data type
       p2.address="goa";
       // we can access default data type
       p2.phnno=988765;
	}

}
