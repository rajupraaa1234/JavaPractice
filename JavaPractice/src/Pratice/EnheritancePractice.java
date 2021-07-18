package Pratice;
class Employee1{  
	 float salary=40000;  
}  
class Animal{  
	void eat(){
		System.out.println("eating...");
	}  
}  
class Dog extends Animal{  
	void bark(){
		System.out.println("barking...");
	}  
}  
public class EnheritancePractice extends Employee1 {
	int bonus=10000;  
	public static void main(String[] args) {
		
		EnheritancePractice p=new EnheritancePractice();  
		System.out.println("Programmer salary is:"+p.salary);  
		System.out.println("Bonus of Programmer is:"+p.bonus);  
		
		Dog d=new Dog();  
		d.bark();  
		d.eat();  

	}

}
