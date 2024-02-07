package lec4_hasgcode_hashmap;

public class hashcode_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    people p1=new people();
    p1.name="abc";
    p1.age=21;
    p1.id=1;
    p1.phnno=1234;
    
    people p2=new people();
    p2.name="abc";
    p2.age=21;
    p2.id=1;
    p2.phnno=1234;
    
    //print hash code
    System.out.println(p1.hashCode());
    System.out.println(p2.hashCode());

    System.out.println(p1==p2);
    System.out.println(p1.equals(p2));
    people p3=p1;
    
    if(p1==p3) 
    System.out.println("same hashcode");
    else
    System.out.println("not same hashcode");
    
	System.out.println(p1.hashCode());
	System.out.println(p3.hashCode());
	
	// TODO Auto-generated method stub
    people p4=new people();
    p1.name="asad";
    p1.age=23;
    p1.id=3;
    p1.phnno=144234;
    
	// TODO Auto-generated method stub
    people p5=new people();
    p1.name="yry";
    p1.age=61;
    p1.id=3;
    p1.phnno=4441234;
    
    System.out.println(p4.equals(p5));

}
}
