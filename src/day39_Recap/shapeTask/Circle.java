package day39_Recap.shapeTask;
//Circle>>Shape
public class Circle extends Shape{
    //4-write extends
//add firstly informatiion, radius,side, >>>after write extends
    //1-radius,pi write
    private double radius;
    public static double pi = 3.14;
//2-getter radius
    public double getRadius() {
        return radius;
    }
//3-setter radius
    public void setRadius(double radius) {
        if(radius <= 0){
            System.err.println("Invalid Radius: "+radius);//negative cannot
            System.exit(1);
        }
        this.radius = radius;
    }
//5-constructor >>write: Circle ,delete String name,
    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

//6- right click override>>choose area,perimeter
    public double area() {
        return radius* radius* pi;
    }

    public double perimeter() {
        return 2*radius*pi;
    }

//7-toString right click generate>>toString>>choose
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi='" + pi + '\'' +//add pi
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Circle extends Shape:
		variables:
			radius//instance
			pi (static)//all circle same PI,thats why static
		Encapsulate the field
		Add a constructor to set the filed
		area(): radius * radius * pi
		perimeter(): 2 * radius * pi
		toString(): r, pi, area, perimeter
 */