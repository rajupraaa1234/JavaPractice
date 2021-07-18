package Pratice;
class Test  
{  
	int s;   
	public int add(int a, int b)  
	{  
		s = a+b;  
		return s;  
	}  
}  

class Student1   
{  
	private int roll;  
	private String name;  
	public int getRoll()   
	{  
		return roll;  
	}  
	public void setRoll(int roll) //mutator method  
	{  
		this.roll = roll;  
	}  
	public String getName()   
	{  
		return name;  
	}  
	public void setName(String name)   
	{  
		this.name = name;  
	}  
	public void display()  
	{  
		System.out.println("Roll no.: "+roll);  
		System.out.println("Student name: "+name);  
	}  
}  
public class MethodPractice {

	public static void main(String[] args) {
		findEvenOdd(12);
		int c = add(10,11);   
		System.out.println("The sum of a and b is= " + c); 
		
		Test t = new Test();
		System.out.println("The sum of two number = " + t.add(10,11)); 
		
		Student1 s =new Student1();
		s.setName("Raju kumar");
		s.setRoll(105);
		s.display();
	}
    
	public static void findEvenOdd(int num)  
	{  
		if(num%2==0)   
		System.out.println(num+" is even");   
		else   
		System.out.println(num+" is odd");  
	}  
	
	public static int add(int n1, int n2)  
	{  
		int s;  
		s=n1+n2;  
		return s; 
	}  
}
