package day39_Recap.shapeTask;
//Square>>Shape
    public class Square extends Shape{
//1-private write after name
       private double side;
//getter & setter >>getter
       public double getSide() {
        return side;
         }
//setter
       public void setSide(double side) {
        if(side <= 0){
            System.err.println("Invalid Side: "+side);
            System.exit(1);//1:means unexpected event
          }
           this.side = side;
          }

//2-generate
    //right click>>generate>>                              -100
     public Square(double side) {
        super("Square");
        setSide(side);//if you use this.side=side >>we cannot use>>we call setSide(side)>>-negative numbers possible
    }

      public double area() {
        return side * side;
    }//right click>>generate>>override>>choose area

       public double perimeter() {
        return side * 4;
    }//right click>>generate>>override>>choose perimeter
//3-toString>>>generate>>override>>choose toString
     public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +//add area
                ", perimeter='" + perimeter() + '\'' +//add perimeter
                '}';
    }


    }
/*
Square extends Shape:
	variables:
		side;
	Encapsulate the field-getter and setter.
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */