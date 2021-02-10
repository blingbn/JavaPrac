package com.dto;

public class Dept {
	int deptno;
	String name;
	String loc;
	
	public Dept(int deptno, String name, String loc) {
		super();
		this.deptno = deptno;
		this.name = name;
		this.loc = loc;
	}
	public Dept() {
		super();
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}


	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", name=" + name + ", loc=" + loc + "]";
	}
	
	
	
}
