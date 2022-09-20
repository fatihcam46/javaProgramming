package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        // student name & score:  it means that we need to write String, Integer

        Map<String, Integer> students = new HashMap<>();//we need to write HashMap
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",85);//it is not taking duplicate
        students.put("Ali",86);//it is not taking duplicate
        students.put("Ali",87);//take last one

        System.out.println(students);//{Alex=96, Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=87}
        System.out.println(students.size());//7


        // display the score of Alex:
        System.out.println(students.get("Alex"));//96


        // replace Ali' score to 90
        students.replace("Ali", 90 );
        System.out.println(students);//{Alex=96, Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=90}

        students.remove("Alex");//removing Alex
        System.out.println(students);//{Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=90}

        students.remove("Ozan");//removing Ozan
        System.out.println(students);//{Andriy=98, Aygun=95, Maria=95, Serkan=97, Ali=90}


        boolean r1 = students.containsKey("Muhtar");
        System.out.println(r1);//false

        boolean r2 = students.containsKey("Serkan");
        System.out.println(r2);//true

        boolean r3 = students.containsValue(97);
        System.out.println(r3);//true


        System.out.println(students.isEmpty());//false

        System.out.println("-------------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);//putAll students here
        System.out.println("map1 = " + map1);//map1 = {Andriy=98, Aygun=95, Maria=95, Serkan=97, Ali=90}

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);
        System.out.println("map2 = " + map2);//map2 = {Andriy=98, Aygun=95, Maria=95, Serkan=97, Ali=90}

        System.out.println(map1 ==  map2);//false
        System.out.println(map1.equals(map2));//true

        map1.clear();
        System.out.println(map1);//{}

        map2.clear();
        System.out.println(map2);//{}
//others methods are in the iteratingTheMap`s class
    }
}
