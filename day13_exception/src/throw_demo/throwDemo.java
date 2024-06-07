package throw_demo;

public class throwDemo {

	private int mark;

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) throws Exception {
		
		try
		{
			if(mark < 0)
			{
				throw new Exception();
			}
			else
			{
				this.mark = mark;
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}

	@Override
	public String toString() {
		return "throwDemo [mark=" + mark + "]";
	}
	
	
}
