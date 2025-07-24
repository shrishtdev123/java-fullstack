package StaticVsInstance;

public class Test {
	
	
	   public static void main(String[] args) {
		   
		   
		     Address address=new Address("Noida","221508","UP");
		     
		     Employee employee=new Employee("shrisht dev",1,234,address);
		     
		       System.out.println(employee);
		       
		       
		       
		       
		       
		     
	   }

}
