package day45_Abstraction.shape;

import static day45_Abstraction.shape.Volume.hasVolume;

public class TestShapes {
    public static void main(String[] args) {
        Sphere sphere = new Sphere("Sphere",20);
        System.out.println("sphere = " + sphere);
//sphere = Sphere{name='Sphere', area='7536.0', perimeter='0.0', volume=33493.333333333336, radius=20.0}

        Cylinder cylinder = new Cylinder("Cylinder",10,15);
        System.out.println("cylinder = " + cylinder);
//cylinder = Cylinder{name='Cylinder', area='942.0000000000001', perimeter='0.0', volume=4710.0, radius=10.0, height=15.0}

        Cube cube = new Cube(12);
        System.out.println("cube = " + cube);
 //       cube = Cube{name='Cube', area='864.0', perimeter='72.0', volume=1728.0, side=12.0}

        Circle circle = new Circle(10.0);
        System.out.println("circle = " + circle);
//circle = Circle{name='Circle', area='314.0', perimeter='62.800000000000004', radius=10.0}
        
        Square square = new Square(10);
        System.out.println("square = " + square);
 //square = Square{name='Square', area='100.0', perimeter='40.0'side=10.0}       
        
       Rectangle rectangle = new Rectangle("Rectangle",20,30);
        System.out.println("rectangle = " + rectangle);
//rectangle = Rectangle{name='Rectangle', area='600.0', perimeter='100.0'length=20.0, width=30.0}

       Triangle triangle = new Triangle("Triangle", 10,15,15,15);
        System.out.println("triangle = " + triangle);
// triangle = Triangle{name='Triangle', area='75.0', perimeter='45.0', height=10.0, base=15.0, side1=15.0, side2=15.0}






    }
}
