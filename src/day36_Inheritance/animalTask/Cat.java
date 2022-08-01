package day36_Inheritance.animalTask;
//lats add>>>extends(inheritance is a relation)
    public class Cat extends Animal { //Cat Is An Animal

        public void meow(){ //just cat has meow
            System.out.println(name + "is meowing");
        }
        public void scratch(){ //cat has scratch>> unique of cat
            System.out.println(name + " is scratching");
        }
    }
/*    Cat:
        6 variables
        8 methods
 */
