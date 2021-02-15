package factory;

public class FactoryDTO {
	String facNo;
	String facName;
	String facLoc;
	public FactoryDTO() {}
	public FactoryDTO(String facNo, String facName, String facLoc) {
		this.facNo = facNo;
		this.facName = facName;
		this.facLoc = facLoc;
	}
	public String getFacNo() {
		return facNo;
	}
	public void setFacNo(String facNo) {
		this.facNo = facNo;
	}
	public String getFacName() {
		return facName;
	}
	public void setFacName(String facName) {
		this.facName = facName;
	}
	public String getFacLoc() {
		return facLoc;
	}
	public void setFacLoc(String facLoc) {
		this.facLoc = facLoc;
	}
	@Override
	public String toString() {
		return "FactoryDTO [facNo=" + facNo + ", facName=" + facName + ", facLoc=" + facLoc + "]";
	}
	
	

}
