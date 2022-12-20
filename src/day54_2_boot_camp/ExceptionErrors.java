package day54_2_boot_camp;


import day54_2_boot_camp.abstraction_review.Audi;
import day54_2_boot_camp.abstraction_review.Car;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExceptionErrors {

    public static void main(String[] args) throws Throwable {

        // new ExceptionErrors().finalize();

        /*
        List<Car> cars = new ArrayList<>();

        while(true){
            cars.add( new Audi() );
        }
technically it is correct,but it is out of memory error, infinitive
         */



        //  System.out.println("Completed");

        //readFile();


    }


    public static void methodWithRuntimeException() throws RuntimeException{
        throw new RuntimeException("This is exception");
    }

    public static void readFile() throws Exception{//if you dont know write Exception
        new FileInputStream("");
    }
}
