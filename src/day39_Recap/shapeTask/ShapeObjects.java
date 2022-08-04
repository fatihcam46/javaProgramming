package day39_Recap.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square1 = new Square(10);

        System.out.println(square1);//Square{side=10.0, area='100.0', perimeter='40.0'}
        //square.side = 20 it cannot. it is private.we need getter&setter

         square1.setSide(15);
       // square.setSide(-5);//Invalid Side: -5.0

        System.out.println(square1);//Square{side=15.0, area='225.0', perimeter='60.0'}
        System.out.println(square1.getName());//Square

        System.out.println("--------Rectangle----------------");

        Rectangle rectangle1 = new Rectangle(5, 6);

        System.out.println(rectangle1);//Rectangle{length=5.0, width=6.0, area='30.0', perimeter='22.0'}

        rectangle1.setLength(10);//change length

        System.out.println(rectangle1.getLength());//10.0
        System.out.println(rectangle1);//Rectangle{length=10.0, width=6.0, area='60.0', perimeter='32.0'}

        System.out.println(rectangle1.getName());//Rectangle

        System.out.println("---------Circle---------------");

        Circle circle = new Circle(7.5);//-10, i cannot write

        System.out.println(circle);//Circle{radius=7.5, pi='3.14', area='176.625', perimeter='47.1'}

        //circle.radius = 15.5;

        circle.setRadius(15.5);
        System.out.println(circle.getRadius());//15.5

        System.out.println(circle);//Circle{radius=15.5, pi='3.14', area='754.385', perimeter='97.34'}
        System.out.println(circle.getName());//Circle


    }
    }
