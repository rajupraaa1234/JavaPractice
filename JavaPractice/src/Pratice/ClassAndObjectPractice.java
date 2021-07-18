package Pratice;
class Student{  
	   int id;  
	   String name;  
     Student(int id,String name){
    	 this.id=id;
    	 this.name=name;
     }
	public Student() {}
} 
class Employee{  
    int id;  
    String name;  
    float salary;  
    void insert(int i, String n, float s) {  
        id=i;  
        name=n;  
        salary=s;  
    }  
    void display(){System.out.println(id+" "+name+" "+salary);}  
}  
public class ClassAndObjectPractice {
	 
	public static void main(String[] args) {
		  Student s1=new Student();  
		  s1.id=101;  
		  s1.name="Raju kumar";  
		  System.out.println(s1.id+" "+s1.name);
          
		  Student s2= new Student(102,"Rahul kumar gupta");
		  System.out.println(s2.id+" "+s2.name);
		  
		  Employee e1=new Employee();  
		    Employee e2=new Employee();  
		    Employee e3=new Employee();  
		    e1.insert(101,"ajeet",45000);  
		    e2.insert(102,"irfan",25000);  
		    e3.insert(103,"nakul",55000);  
		    e1.display();  
		    e2.display();  
		    e3.display();  
	}

}
