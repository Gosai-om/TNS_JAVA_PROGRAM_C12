package Array_List;

public class Color {

	int id;
	String Color;
	
	

	public Color(int id, String color) {
		super();
		this.id = id;
		Color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	@Override
	public String toString() {
		return "Color [id=" + id + ", Color=" + Color + "]";
	}
}
