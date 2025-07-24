package com.hcl.gap;

import java.util.List;

public class GAPCalculator {
	
	     List<Integer> gradePointList;

		public List<Integer> getGradePointList() {
			return gradePointList;
		}

		public void setGradePointList(List<Integer> gradePointList) {
			this.gradePointList = gradePointList;
		}
		
		public void addGradPoint(char obtainedGrad) {
			
			        if(obtainedGrad=='A') {
			        	
			        	gradePointList.add(9);
			        }
			        else if(obtainedGrad=='B') {
			        	gradePointList.add(8);
			        }
			        else if(obtainedGrad=='C') {
			        	
			        	gradePointList.add(7);
			        }
			        else if(obtainedGrad=='D') {
			        	
			        	gradePointList.add(6);
			        }
			        else if(obtainedGrad=='E') {
			        	
			        	gradePointList.add(5);
			        }
                  else if(obtainedGrad=='S') {
			        	
			        	gradePointList.add(10);
			        }
			        
			   
		}
		
		public double calculateGPAScore() {
			
			   if(gradePointList.size()==0) {
				   return 0;
			   }
			   else {
				   
				    double ans=0;
				    
				    for(int a:gradePointList) {
				    	ans=ans+a;
				    }
				    
				    ans=ans/gradePointList.size();
				    
				    return ans;
			   }
		}
	     
	     

}
