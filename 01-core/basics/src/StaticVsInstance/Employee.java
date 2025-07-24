package StaticVsInstance;

public class Employee {
	
	
	      String name;
	      int id;
	      double salary;
	      Address address;
	      
	      Employee(String name,int id,double salary,Address address){
	    	  
	    	     this.name=name;
	    	     this.id=id;
	    	     this.salary=salary;
	    	     this.address=address;
	      }

		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
		}
		
		public void setName(String name) {
			  this.name=name;
		}
		
		public void setSalary(double salary) {
			
			 this.salary=salary;
		}
		
		public String getName() {
			return name;
		}
		
		public double getSalary() {
			return salary;
		}
		
		public Address getAddress() {
			
			  return address;
		}
	      
	      
	      
	     
	      
	      

}

class Address{
	
	   String cityName;
	   String pincode;
	   String state;
	   
	   Address(String cityName,String pincode,String state){
		   
		     this.cityName=cityName;
		     this.pincode=pincode;
		     this.state=state;
	   }

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", pincode=" + pincode + ", state=" + state + "]";
	}
	   
	  
}