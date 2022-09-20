package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {
//String, Integer boths I need to use entrySet method
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        //  1 who has the maximum and minimum salary?
        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;

        String name2 = "";
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();//getKey();
            Integer eachValue = pair.getValue();//getValue();

            if(eachValue > maxSalary){
                maxSalary = eachValue;
                name1 = eachKey;
            }

            if(eachValue < minSalary){
                minSalary = eachValue;
                name2 = eachKey;
            }

        }


        System.out.println(name1);//Jalil
        System.out.println(name2);//Conor


        System.out.println("----------------the salary between 120k ~ 150K?------------");

        //how many employees has the salary between 120k ~ 150K?

        int count = 0;

        for (Integer eachValue : map.values()) { //map.values for each loop
            if(eachValue >= 120000 && eachValue <= 150000){
                count++;
            }
        }

        System.out.println(count);//4

        System.out.println("----------------------------------------------");

        //   1.4 display the names of the employees who are making less than 118k?

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if( pair.getValue() < 118000){
                System.out.print(pair.getKey()+", ");//Antony, Jimmy, James, Conor, Josh,
            }
        }

        System.out.println("----------------------------------------------");

        // 1.5 increase the salary employee by 10K if the current salary of employee is less than 120K
//kimin 120k nin altindaysa 10000 ekle
        System.out.println(map);
//{John=123000, Antony=100000, Jimmy=115000, Jalil=145000, James=110000,
// Conor=85000, Josh=117000, Cory=118000, Anderson=125000, Steven=135000}
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() < 120000){
                entry.setValue(entry.getValue()+10000);
            }
        }

        System.out.println(map);//
//{John=123000, Antony=110000, Jimmy=125000, Jalil=145000, James=120000, Conor=95000,
// Josh=127000, Cory=128000, Anderson=125000, Steven=135000}
    }


}

/*
1. Given the following map that contains the employee name and thier salary:
     Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);
    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
 */

