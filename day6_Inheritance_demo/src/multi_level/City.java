package multi_level;

public class City extends State{
	private String cname;

	@Override
	public String toString() {
		return "Country : "+getCnt_name() +" | State "+getSname() +" | City : " + cname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
}
