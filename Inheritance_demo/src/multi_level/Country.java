package multi_level;

public class Country {
	private String cnt_name;

	public String getCnt_name() {
		return cnt_name;
	}

	public void setCnt_name(String cnt_name) {
		this.cnt_name = cnt_name;
	}

	@Override
	public String toString() {
		return "Country [cnt_name=" + cnt_name + "]";
	}
	
}
