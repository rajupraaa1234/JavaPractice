package Pratice;

class Student4{  
	int rollno;  
	String name;  
	float fee;  
	Student4(int rollno,String name,float fee){  
	rollno=rollno;  
	name=name;  
	fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  

class Student5{  
	int rollno;  
	String name;  
	float fee;  
	Student5(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
public class ThisKeywordPractice {

	public static void main(String[] args) {
		Student4 s1=new Student4(111,"ankit",5000f);  
		Student4 s2=new Student4(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
   
		Student5 s11=new Student5(111,"ankit",5000f);  
		Student5 s22=new Student5(112,"sumit",6000f);  
		s11.display();  
		s22.display();  
	}

}
