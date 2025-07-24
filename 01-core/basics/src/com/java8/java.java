package com.java8;


interface Addable{
	
	   int add(int a,int b);
	  
}

interface Substraction{
	
	 int sub(int a,int b);
}


interface Mycomparator{
	
	  boolean compare(int a,int b);
		
}


interface car{
	
	  void run();
}


public class java {

	   public static void main(String[] args) 
	   {
		
//		   
//		   Addable ad1=(a,b)->(a+b);
//		   
//		   System.out.println(ad1.add(4, 5));
//		   
//		   Substraction sub=(a,b)->{
//			    
//			     return a-b;
//		   };
//		   
//		   System.out.println(sub.sub(5, 3));
//		   
//		   Mycomparator obj2=(n1,n2)->{
//			   
//			    return n1>n2;
//		   };
//		   
//		   System.out.println(obj2.compare(2, 10));
//		   
		   
		   car creta=()->{
			   System.out.println("creta is starting....");
		   };
		   
		   creta.run();
		   
		   
		   car maruti=()->{
			   System.out.println("maruti is starting....");
		   }; 
		   
		   maruti.run();
		   
		   
	}
	
}
