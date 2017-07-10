package com.javaex.problem02;

public class Depart extends Employee {
	private String Depart;
	
	public Depart() {}
	public Depart(String name, int salary , String Depart) {
		super(name, salary);
		this.Depart=Depart;
	}
	
	
	  public void getInformation() {
	        System.out.println("이름:	"+super.getName()+"	연봉:	"+super.getSalary()+"	부서 :"+Depart);
	    }

}
