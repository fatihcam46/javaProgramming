package day39_Recap.shapeTask;
//Circle,Square,Rectangle>>Shape
public class Shape {

    //1-name
    private String name;
    //2-getter setter
//name >>we  need to read >>getter&setter we need>>right click>>generate>>

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name == null){
            System.err.println("Name can not be null");
            System.exit(1); // 1: some thing went wrong, unexpected event : 1 means.
        }
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);//if 0 no problem.
        }
        this.name = name;
    }
    public Shape(String name) {
        setName(name);
    }


    public double area(){//without body I cannot write
        return 0;//I need to write return
    }
    public double perimeter(){
        return 0;
    }

//3-toString
    @Override //generate>>toString>>add   area and perimeter
    public String toString() {
     return "Shape{" +
            "name='" + name + '\'' +
            ", area='" + area() + '\'' +
            ", perimeter='" + perimeter() + '\'' +
            '}';
    }
}
/*
	Shape:
	variables:
			name
		Encapsulate, public method we cannot, negative or zero can be write, so that we write PRIVATE
	Encapsulate the field-getter and setter
	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}
 */