package dto;

public class DataBean {
	private String col1;
	private String col2;
	private String col3;
	private String col4;
	
	public DataBean() {
		
	}
	
	public DataBean(String col1, String col2, String col3, String col4) {
		this.col1 = col1;
		this.col2 = col2;
		this.col3 = col3;
		this.col4 = col4;
		
	}
	
	public void setCol1(String col1) {
		this.col1 = col1;
	}
	
	public void setCol2(String col2) {
		this.col2 = col2;
	}
	
	public void setCol3(String col3) {
		this.col3 = col3;
	}
	
	public void setCol4(String col4) {
		this.col4 = col4;
	}

	public String getCol1() {
		return this.col1;
	}

	public String getCol2() {
		return this.col2;
	}
	
	public String getCol3() {
		return this.col3;
	}

	public String getCol4() {
		return this.col4;
	}
	
}
