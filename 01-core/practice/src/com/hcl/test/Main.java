package com.hcl.test;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
	
	  public static void main(String[] args) {
		
		  
		   List<Integer> ans=new ArrayList<>();
		  DataList d=new DataList(ans);
		  
		  
		    d.addElement(1);
		    d.addElement(2);
		    d.addElement(3);
		    
		    
		   List<Integer> data=d.getList();
		   System.out.println(data);
		   
		  System.out.println(d.getlement(2));
	}

}
