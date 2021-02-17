package com.dto;

public class Dept {
	int DEPTNO;
	String DNAME;
	String LOC;
	public Dept() {
		super();
	}
	public int getDEPTNO() {
		return DEPTNO;
	}
	public void setDEPTNO(int dEPTNO) {
		DEPTNO = dEPTNO;
	}
	public String getDNAME() {
		return DNAME;
	}
	public void setDNAME(String dNAME) {
		DNAME = dNAME;
	}
	public String getLOC() {
		return LOC;
	}
	public void setLOC(String lOC) {
		LOC = lOC;
	}
	public Dept(int dEPTNO, String dNAME, String lOC) {
		super();
		DEPTNO = dEPTNO;
		DNAME = dNAME;
		LOC = lOC;
	}
	@Override
	public String toString() {
		return "Dept [DEPTNO=" + DEPTNO + ", DNAME=" + DNAME + ", LOC=" + LOC + "]";
	}
	
	
}
