package day35_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {

        //
        Person p1 = new Person();
        // p1.name = "Daniel"; I cannot write directly, it is private
        //  p1.age = 28;   I cannot write directly, it is private

        //   p1.name = "";  if these are public we can write but we dont have any distriction
        //   p1.age = 2000;, thats why we are writing private

        //firstly setName,setAge write>>after getName ,getAge
        p1.setName("Daniel");
        p1.setAge(45);

        //    System.out.println(p1.name +" : "+p1.age);

        System.out.println(p1.getName()+" : "+p1.getAge());
                                    //Daniel : 45


    }

}

