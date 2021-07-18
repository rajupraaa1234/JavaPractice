package Pratice;

class Student2{  
	   int rollno; 
	   String name;  
	   static String college ="ITS";
	   Student2(int r, String n){  
		   rollno = r;  
		   name = n;  
	   }  
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
}
class Counter2{  
	static int count=0;
	  
	Counter2(){  
	count++;
	System.out.println(count);  
  } 
}
public class StaticPractice {

	public static void main(String[] args) {
		 Student2 s1 = new Student2(111,"Karan");  
		 Student2 s2 = new Student2(222,"Aryan");  
		   
		 s1.display();  
		 s2.display();  
         
		 Counter2 c1=new Counter2();  
		 Counter2 c2=new Counter2();  
		 Counter2 c3=new Counter2();  
	}

}
