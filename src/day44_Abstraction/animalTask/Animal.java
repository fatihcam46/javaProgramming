package day44_Abstraction.animalTask;
//Animal:dog(playable),cat(playable),parrot(flyable)(playable),eagle(flyable)(wildAnimal),tiger(wildAnimal)
    /*    Animal Task:
		Create an abstract class named Animal:
			Variables:name, breed(final)(if I make sttic alla animal will be same,but I need different)
			, gender(final),  age, size, color(final)
			Encapsulate all the fields
			Add a constructor that can set all the fields
		Methods:eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal
		Create the following subclasses of Animal:
				Dog	eat(): eats Pizza
				Cat	eat(): eats Biryani
				Tiger eat(): eats deer
			    Parrot	eat(): eats chocolate
			    Eagle 	eat(): eats snake
     */
  /* if I want to see full name of class>> difference between getSimpleName&getName
class Test{
    public static void main(String[] args) {
        System.out.println(new Test().getClass().getSimpleName());
        System.out.println(new Test().getClass().getName());
    }
}
*/
//(parent)>>Animal
    public abstract class Animal {
        //1- write one by one
        private String name;
        private final String breed;//does not change//wee need to set constructor
        private final char gender;//does not change
        private int age;
        private String size;
        private final String color;//does not change

        public final static boolean canBreathe;
        static{
            canBreathe = true;
        }
//3-constructor
        public Animal(String name, String breed, char gender, int age, String size, String color) {
            setName(name); //this.name=name(I cannot write, it is written from setter

            this.breed = breed;

            if ( !(gender == 'M' || gender =='F')){  //change them
                throw new RuntimeException("Invalid gender: "+gender);//create exception
            }
            this.gender = gender;

            setAge(age);
            setSize(size);

            this.color = color;
        }
//2-getter setter
        public String getName() {
            return name;
        }
        public void setName(String name) {
            if(name.isEmpty()){    //write exception
                throw new RuntimeException("Invalid Name");
            }
            this.name = name;
        }
        public String getBreed() {
            return breed;
        }
        public char getGender() {
            return gender;
        }
       public int getAge() {
            return age;
        }
       public void setAge(int age) {
            this.age = age;
        }
        public String getSize() {
            return size;
        }
        public void setSize(String size) {
            this.size = size;
        }
        public String getColor() {
            return color;
        }
//4-methods:drink
        public final void drink(){
            System.out.println(name+" is drinking");
        }
//5-eat>>
        public  abstract void eat();//final I cannot>>>after I want ot write different type
// 6-toString>>generate>>
        @Override
        public String toString() {                //Animal instead of add to getClass>>getSimpleName method use
            return getClass().getSimpleName()+"{" + //
                    "name='" + name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    ", size='" + size + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }

    }
