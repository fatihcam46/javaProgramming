package day45_Abstraction.shape;
//sub class(circle)>>shape

    public class Circle extends Shape {//which is unique of circle?
//3-add Circle extends Shape>>
        //1-radius ,pi
        private double radius;

        public final static double pi = 3.14;
//4- constructor>>String name(clean it)>>write super("Circle");>>
        public Circle( double radius) {
            super("Circle");
            setRadius(radius);//this.radius=radius it cannot
        }

        public double getRadius() {
            return radius;
        }
 //2- getter setter >>radius
        public void setRadius(double radius) {
            if(radius < 0){
                throw new RuntimeException("Invalid Radius: "+radius);//add RuntimeException
            }
            this.radius = radius;
        }
//5-area
        @Override
        public double area() {
            return radius * radius * pi;
        }
//6-perimeter
        @Override
        public double perimeter() {
            return 2 * radius * pi;
        }
//7-toString>>different implementation
        @Override
        public String toString() {
            return "Circle{" +
                    super.toString()+  //add super keyword>>>
                    ", radius=" + radius +
                    '}';
        }

    }
