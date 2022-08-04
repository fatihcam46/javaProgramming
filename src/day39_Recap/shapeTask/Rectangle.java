package day39_Recap.shapeTask;
//Rectangle>>Shape
public class Rectangle extends Shape{
//1-length, width;
    private double length, width;
//2-getter and setter>>right click choose
    public double getLength() {
        return length;
    }
//setter
    public void setLength(double length) {
        if(length <= 0){
            System.err.println("Invalid Length: "+length);//add if negative or zero
            System.exit(1);
        }
        this.length = length;
    }
//getter width
    public double getWidth() {
        return width;
    }
//setter width
    public void setWidth(double width) {
        if(width <= 0){
            System.err.println("Invalid Width: "+width);//add negative or zero
            System.exit(1);
        }
        this.width = width;
    }
//3-constructor>> name write>>length,width
    public Rectangle( double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }
//write formula>>right click >>generate>>override
    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * ( length + width);
    }

//4-toString
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}
/*
Rectangle extends Shape:
	variables:
		length
		width
	Encapsulate the fields
	Add a constructor to set the filed
	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter
 */