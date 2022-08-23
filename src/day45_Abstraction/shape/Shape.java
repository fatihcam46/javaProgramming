package day45_Abstraction.shape;
//(parent class) Shape>>
//add here>>abstract>>
public abstract class Shape {
    //1-name
    private final String name;
//3-constructor
    public Shape(String name) {
        this.name = name;
    }
//2- getter
    public String getName() {
        return name;
    }
//3- area
    public abstract double area();//without body{},it cannot, we need to write abstract
//4-perimeter
    public abstract double perimeter();//without body{},it cannot, we need to write abstract
//5-toString
    @Override
    public String toString() {
        return  //clean Shape
                //you can add getClass().getSimpleName()
                "name='" + name + '\'' +
                        ", area='" + area() + '\'' +  //add area
                        ", perimeter='" + perimeter() + '\'';   //add perimeter

    }


}
