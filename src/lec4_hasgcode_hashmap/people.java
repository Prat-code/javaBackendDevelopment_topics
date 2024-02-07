package lec4_hasgcode_hashmap;

import java.util.Objects;

public class people {

	public String name;
    public int age;
  public int id;
    public int phnno;
    
    
    
	@Override
	public String toString() {
		return "people [name=" + name + ", age=" + age + ", id=" + id + ", phnno=" + phnno + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, phnno);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		people other = (people) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name) && phnno == other.phnno;
	}
	
	
//	@Override
//	// we over ride hashcode ande now we get hashcode ont the basis of age,id,name,phno
//	public int hashCode() {
//		return Objects.hash( age, id,name, phnno);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		people other = (people) obj;
//		//return age == other.age && id == other.id && Objects.equals(name, other.name) && phnno == other.phnno;
//		//if id of 2 object is same than our equals function give true
//		return  id == other.id ;
//	}
//    
}
