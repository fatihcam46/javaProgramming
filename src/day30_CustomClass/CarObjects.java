package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1  = new Car();//data type must be Car,after car1
        car1.setInfo("Toyota", "Camry", "White", 2021, 35000);
        System.out.println("car1="+car1);
        //car1=Car{brand='Toyota', model='Camry', color='White', year=2021, price= $35000.0}

        Car car2 = new Car();
        car2.setInfo("BMW", "335is", "Black", 2020, 45000);
        System.out.println("car2="+car2);
        //car2=Car{brand='BMW', model='335is', color='Black', year=2020, price= $45000.0}

        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "Red", 2019, 40000);
        System.out.println(car3);
        //Car{brand='Audi', model='Q7', color='Red', year=2019, price= $40000.0}
//how can I put one list>>>ArrayList we need>>
         //   Car[] cars = { car1, car2, car3 };has more disadventages
        ArrayList<Car> carsList = new ArrayList<>();//object type Car>>>how can I add car1  car2  car3>>
        carsList.addAll(Arrays.asList(car1, car2, car3)) ;//  array utilities
//iterate we need  for each loop>>>>
        for(Car each  : carsList){
            System.out.println( each.brand +" : "+each.price  );
            //Toyota : 35000.0
            //BMW : 45000.0
            //Audi : 40000.0

            System.out.println("------------------------------------------------------------");
       /*
         Recall:
            BMW: 2005 ~ 2008  //
            Toyota: 1995 ~ 1997//eligible to recall
         */
                            //
            carsList.removeIf( p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008 );
            carsList.removeIf( p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);

            System.out.println("carsList = " + carsList);
//carsList = [Car{brand='Toyota', model='Camry', color='White', year=2021, price= $35000.0},
// Car{brand='BMW', model='335is', color='Black', year=2020, price= $45000.0},
// Car{brand='Audi', model='Q7', color='Red', year=2019, price= $40000.0}]

        }
    }
}
