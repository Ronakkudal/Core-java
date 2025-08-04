package com.cdac.acts;

public class Emp {
	private int eno;
	private String ename;
	private Add add;
	
	public Emp(int eno, String ename, Add add) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.add = add;
	}
	
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", add=" + add + "]";
	}
	
	
}
