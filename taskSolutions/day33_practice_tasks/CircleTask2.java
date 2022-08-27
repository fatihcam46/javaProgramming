package day33_practice_tasks;

public class CircleTask2 {
    public static double pi = 3.14;
    public double radius,diameter;

    public CircleTask2(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }
    public double calcArea(){
        return radius*radius*pi;
    }
    public double calcPerimeter(){
        return 2*radius*pi;
    }
    public void printPi(){
        System.out.println(pi);
    }

    public String toString() {
        return "CircleTask2{" +
                "Radius=" + radius +
                ", Diameter=" + diameter +
                ",Pi=" + pi +
                ",Perimeter=" +calcPerimeter() +
                ",Area=" +calcArea() +
                '}';
    }
    /*
    Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement



     */
}
