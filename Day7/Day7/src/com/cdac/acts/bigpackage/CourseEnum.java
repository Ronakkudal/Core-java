package com.cdac.acts.bigpackage;

public enum CourseEnum {
	DAC("Diploma in Advanced Computing"),
	 DESD("Embedded System"),
	 DVLSI("Veri Large Scale Integration");
	
	private String string;
	private CourseEnum(String string) {
		this.string=string;
	}
	public String getValue() {
		return string;
	}
	
}
