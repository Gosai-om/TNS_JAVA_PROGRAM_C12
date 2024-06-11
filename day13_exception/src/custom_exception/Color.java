package custom_exception;

public class Color {

	private String cname;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) 
	{
		try
		{
			if(!cname.equalsIgnoreCase("RED") && !cname.equalsIgnoreCase("GREEN") && !cname.equalsIgnoreCase("WHITE"))
			{
				throw new ColorException("Opps..! Color Not Found...");	
			}
			else	
			{
				this.cname = cname;
			}
		}
		catch(ColorException ce)
		{
			System.out.println(ce.getMessage());
		}
	}

	@Override
	public String toString() {
		return "Color Is " + cname;
	}
	
	
}
