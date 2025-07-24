package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    private final HcldemoApplication hcldemoApplication;


    Controller(HcldemoApplication hcldemoApplication) {
        this.hcldemoApplication = hcldemoApplication;
    }
	
	
	 @GetMapping("/hello")
	 
	 public String getMessage() {
		 
		 return "hi how are you";
	 }
	 
	 @GetMapping("/product")
	 public Item getProduct() {
		 
		  Item i=new Item("mobile",1,"hcl");
		 return i;
	 }
	 
	 @GetMapping("/sum")
	 public  Data findSum(@RequestParam int a,@RequestParam int b) {
		     
		   System.out.println(a+b);
		  Data d=new Data(a+b,"this is response comming from springboot server");
		  return d;
	 }
	 
	 

}

class Data{
	  int data;
	  String message;
	  
	  
	  
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Data() {
	
	}
	public Data(int data, String message) {
		super();
		this.data = data;
		this.message = message;
	}
	@Override
	public String toString() {
		return "data [data=" + data + ", message=" + message + "]";
	}
	  
	  
}



