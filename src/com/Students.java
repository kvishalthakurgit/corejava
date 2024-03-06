package com;

public class Students {
	public int std_Id;
	public String std_Name;
	public String std_Add;

	public Students() {
		// TODO Auto-generated constructor stub
	}
	
	public Students(int std_id) {
		this.std_Id = std_id;
	}
	
	public int getStd_Id() {
		return std_Id;
	}

	public void setStd_Id(int std_Id) {
		this.std_Id = std_Id;
	}

	public String getStd_Name() {
		return std_Name;
	}

	public void setStd_Name(String std_Name) {
		this.std_Name = std_Name;
	}

	public String getStd_Add() {
		return std_Add;
	}

	public void setStd_Add(String std_Add) {
		this.std_Add = std_Add;
	}

	@Override
	public int hashCode(){
        int hashcode = 0;
        hashcode = std_Id;
        hashcode += std_Add.hashCode();
        //return hashcode;	//based on id and address
        return hashcode;	//based on id only
    }
	
	@Override
	public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof Students) {
            Students pp = (Students) obj;
            System.out.println(pp.std_Name);  
            System.out.println(this.std_Name);
            return (pp.std_Id == this.std_Id);
        } else {
        return false;
    }
        }
	/*public int hashCode(){
    System.out.println("In hashcode="+std_Id);
    return std_Id;	//based on id and address
}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals call");
		return true;
	}*/
}

