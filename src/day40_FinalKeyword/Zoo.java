package day40_FinalKeyword;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Husky", 'M', "White", "Large", 4);

        System.out.println(dog.getBreed());//Husky
        //can I change,color,gender,breed? no I cannot/these are final keywords.
        System.out.println(dog.getGender());//M

        dog.drink();//Max is drinking water


    }
}
