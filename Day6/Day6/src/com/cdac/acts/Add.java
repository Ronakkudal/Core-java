package com.cdac.acts;

public class Add {
	private String streetName;
	private int pCode;
	private int LineNo;
	
	public Add(String streetName, int pCode, int lineNo) {
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
