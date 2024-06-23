package CRUD;

public class tns_student {
	private Integer stud_id;
	private String sname;
	private String stream;
	
	public tns_student()
	{
		
	}

	public tns_student(Integer stud_id, String sname, String stream) {
		super();
		this.stud_id = stud_id;
		this.sname = sname;
		this.stream = stream;
	}

	public Integer getStud_id() {
		return stud_id;
	}

	public void setStud_id(Integer string) {
		this.stud_id = string;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "tns_student [stud_id=" + stud_id + ", sname=" + sname + ", stream=" + stream + "]";
	}
	
	
}
