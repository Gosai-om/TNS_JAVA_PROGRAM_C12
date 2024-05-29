package static_keyword;

public class Calculation {

	static int count_obj=0;
	
	@Override
	public String toString() {
		return "Total Object Count : "+count_obj;
	}

	public Calculation() {
	
		count_obj++;
	}
}
