package Pratice;

public class ForLoopPractice {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){  
	        System.out.print(i + " ");  
	    } 
		pyramid();
		
		    int arr[]={12,23,44,56,78};  
		  
		    for(int i:arr){  
		        System.out.println(i);  
		    }  
		    Labled();
	} 
    
	public static void pyramid() {
		System.out.println();
			for(int i=1;i<=5;i++){  
				for(int j=1;j<=i;j++){  
				        System.out.print("* ");  
				}  
				System.out.println();//new line  
				}  
	}
	
	public static void Labled() {
		aa:  
	        for(int i=1;i<=3;i++){  
	            bb:  
	                for(int j=1;j<=3;j++){  
	                    if(i==2&&j==2){  
	                        break aa;  
	                    }  
	                    System.out.println(i+" "+j);  
	                }  
	        }  
	}
}
