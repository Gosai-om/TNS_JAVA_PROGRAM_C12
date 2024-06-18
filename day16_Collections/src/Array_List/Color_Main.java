package Array_List;

import java.util.ArrayList;
import java.util.List;

public class Color_Main {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Color c = new Color(1,"Red");
		
		List<Color> lstColor = new ArrayList<Color>();
	
		lstColor.add(new Color(1,"White"));
		lstColor.add(new Color(2,"Red"));
		lstColor.add(new Color(3,"Blue"));
		
		//System.out.println(lstColor);
		
		for (Color clr : lstColor) {
			System.out.println(clr);
		}
	}
}
