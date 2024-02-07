package com_3_polymorphism;

public class employee {
     private String name;
     private int age;
     private double empnumber;
     private int phnno;
     private int height;
     private int weight;
     
     
     // method overloading-- way to achive compile time polymorphism
     // method name sum but different parameters
     // return type does not matter
     // access type does not matter
     public double getBMI(int height,int weight) {
    	 return 24.0;
     }
     
     public double getBMI(float height,float weight) {
    	 return 24.0;
     }
     
     
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  employee e1=new employee();
  
	}

}
