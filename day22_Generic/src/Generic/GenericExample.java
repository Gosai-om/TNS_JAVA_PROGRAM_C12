package Generic;

public class GenericExample <T> {
	
	@Override
	public String toString() {
		return "name = " + name;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	T name;
}
