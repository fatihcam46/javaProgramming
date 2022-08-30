package day47_Polymorphism;

import day38_Inheritance.carTask.BMW;
import day38_Inheritance.carTask.Tesla;
import day38_Inheritance.carTask.Toyota;
import day38_Inheritance.carTask.Car;
    public class PolymorphismPractice {

        public static void main(String[] args) {

            Car[] cars = {
                    new Toyota("Highlander", 2010, 25000, "White", 255000),
                    new BMW("X5", 2014, 32000, "Red", 12000),
                    new Toyota("Corolla", 2011, 20000, "White", 310000),
                    new BMW("M3", 2015, 33000, "Blue", 14030),
                    new BMW("M5", 2017, 35000, "Black", 15000),
                    new BMW("M4", 2018, 40000, "White", 19000),
                    new BMW("7 Series", 2009, 30000, "Purple", 21000),
                    new BMW("i3", 2011, 30000, "Black", 9000),
                    new Toyota("Camry", 2018, 30000, "Red", 185000),
                    new Toyota("Rav4", 2012, 23000, "Red", 285000),
                    new Toyota("Avalon", 2019, 35000, "Blue", 175230),
                    new Tesla("Model 3", 2015, 45000, "White", 235000),
                    new Tesla("Model Y", 2017, 65000, "Black", 135000),
                    new Tesla("Model X", 2016, 48000, "White", 235000),
                    new Tesla("Model X", 2014, 48000, "White", 236000),
            };


            for(Car eachCar  : cars ){

                if(eachCar instanceof Toyota){
                    if(eachCar.year >= 2010 && eachCar.year <= 2011){
                        System.out.println(eachCar);
                    }
                }

                if(eachCar instanceof BMW){
                    System.out.println(eachCar);
                }

                if(eachCar instanceof Tesla){
                    if(eachCar.year >= 2015 && eachCar.year <= 2016){
                        System.out.println(eachCar);
                    }
                }
            }
//Car{brand='Toyota', model='Highlander', year=2010, price= $25000.0, color='White', miles=255000}
//Car{brand='BMW', model='X5', year=2014, price= $32000.0, color='Red', miles=12000}
//Car{brand='Toyota', model='Corolla', year=2011, price= $20000.0, color='White', miles=310000}
//Car{brand='BMW', model='M3', year=2015, price= $33000.0, color='Blue', miles=14030}
//Car{brand='BMW', model='M5', year=2017, price= $35000.0, color='Black', miles=15000}
//Car{brand='BMW', model='M4', year=2018, price= $40000.0, color='White', miles=19000}
//Car{brand='BMW', model='7 Series', year=2009, price= $30000.0, color='Purple', miles=21000}
//Car{brand='BMW', model='i3', year=2011, price= $30000.0, color='Black', miles=9000}
//Car{brand='Tesla', model='Model 3', year=2015, price= $45000.0, color='White', miles=235000}
//Car{brand='Tesla', model='Model X', year=2016, price= $48000.0, color='White', miles=235000}
System.out.println("---------------------------------------------------------");
       // 1.2 Write a program that can display the car that has the highest mileage
      // 1.3 Write a program that can display the car that has the lowest mileage


            Car carWithHighestMileage = cars[0],
                carWithLowestMileage =  cars[0];


            for (Car eachCar : cars) {
                if(eachCar.miles > carWithHighestMileage.miles){
                    carWithHighestMileage = eachCar;
                }

                if(eachCar.miles < carWithLowestMileage.miles){
                    carWithLowestMileage = eachCar;
                }

            }

            System.out.println(carWithHighestMileage);
 //Car{brand='Toyota', model='Corolla', year=2011, price= $20000.0, color='White', miles=310000}
            System.out.println(carWithLowestMileage);
//Car{brand='BMW', model='i3', year=2011, price= $30000.0, color='Black', miles=9000}


        }


    }


/*
1 Given the following array that contains the car objects:
				Car[] cars = {
		                new Toyota("Highlander", 2010, 25000, "White", 255000),
		                new BMW("X5", 2014, 32000, "Red", 12000),
		                new Toyota("Corolla", 2011, 20000, "White", 310000),
		                new BMW("M3", 2015, 33000, "Blue", 14030),
		                new BMW("M5", 2017, 35000, "Black", 15000),
		                new BMW("M4", 2018, 40000, "White", 19000),
		                new BMW("7 Series", 2009, 30000, "Purple", 21000),
		                new BMW("i3", 2011, 30000, "Black", 9000),
		                new Toyota("Camry", 2018, 30000, "Red", 185000),
		                new Toyota("Rav4", 2012, 23000, "Red", 285000),
		                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
		                new Tesla("Model 3", 2015, 45000, "White", 235000),
		                new Tesla("Model Y", 2017, 65000, "Black", 135000),
		                new Tesla("Model X", 2016, 48000, "White", 235000),
		                new Tesla("Model X", 2014, 48000, "White", 236000),
		        };
		        (import them from day38 package)
	        1.1 Write a program that can display all the cars that are eligible for recall
	        					Cars that are eligible for recall:
	        							Toyota: from year 2010 to 2011
	        							BMW: from year 1929 to 2022
	        							Tesla: from year 2015-2016
			1.2 Write a program that can display the car that has the highest mileage
			1.3 Write a program that can display the car that has the lowest mileage
 */