package com.example.demo.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="stdtab")
public class Student {

	    @Id
	    private Integer sid;
	    private String sname;
	    
	     @OneToMany
	     @JoinColumn(name="sidFK")
	    private Set<Book> bob;

		public Student(Integer sid, String sname, Set<Book> bob) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.bob = bob;
		}

		public Student() {
			
		}

		public Integer getSid() {
			return sid;
		}

		public void setSid(Integer sid) {
			this.sid = sid;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public Set<Book> getBob() {
			return bob;
		}

		public void setBob(Set<Book> bob) {
			this.bob = bob;
		}
		
		
	     
	    
	    
}
