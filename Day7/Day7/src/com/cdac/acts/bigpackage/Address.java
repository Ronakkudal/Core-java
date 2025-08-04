package com.cdac.acts.bigpackage;

//package com.cdac.acts;

public class Address {
	private String streetName;
	private int pCode;
	private int LineNo;
	
	public Address(String streetName, int pCode, int lineNo) {
		super();
		this.streetName = streetName;
		this.pCode = pCode;
		LineNo = lineNo;
	}

	@Override
	public String toString() {
		return "[streetName=" + streetName + ", pCode=" + pCode + ", LineNo=" + LineNo + "]";
	}
	

}

