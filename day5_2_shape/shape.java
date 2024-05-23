package day5_2_shape;

import day5_1_Geometry.*;

public class shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(8.0, 3.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        
        System.out.println("Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
	}

}
