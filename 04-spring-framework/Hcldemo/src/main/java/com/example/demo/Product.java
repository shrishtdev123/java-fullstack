package com.example.demo;

 class Item {
	
	  String name;
	  int id;
	  String cpm;
	  
	  
	  public Item() {
		  
	  }
	  
	 public Item(String name,int id,String cmp){
		  this.name=name;
		  this.id=id;
		  this.cpm=cmp;
	  }

	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", cpm=" + cpm + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpm() {
		return cpm;
	}

	public void setCpm(String cpm) {
		this.cpm = cpm;
	}
	
	

}
