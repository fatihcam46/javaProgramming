package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scan.nextInt();  //19 enter

        System.out.println("Enter your gender");
        String gender = scan.next();  // male enter

        scan.nextLine();  // enter enter

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();  // if the scanner methot thats used is not nextLine(),
                                             // then we need to provide one more nextLine
        System.out.println("Enter your phone number");
        Long phoneNumber = scan.nextLong();

        scan.nextLine();

        System.out.println("Enter your zip code");  // USA de zipcode burda  postcode olarak yazdim
        String zipCode = scan.nextLine();

        System.out.println("Enter your School name");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name");
        String stateName = scan.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = scan.nextLine();

        System.out.println("Enter your Street name");
        String streetName = scan.nextLine();

        scan.close();

        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: \n\t"+buildingNumber+" "+streetName+  // \n new line   \t tab
                "\n\t"+cityName+", "+stateName+" "+zipCode);
        System.out.println("School Name: " + schoolName);






/*    1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int  --> nextInt() )
			2. Enter your gender (String- One word ONLY   --> next()  )   nextLine()
			3. Enter your full name (String- Multiple words --> nextLine()  ) // we need more than two words
			4. Enter your phone number (long     --> nextLong()  )
			5. Enter your zip code (int   --> nextInt()  nextLine()  )
			6. Enter your School name (String- Can be Multiple words --> nextLine()  )
			7. Enter your city name (String- Can be Multiple words  --> nextLine()   )
			8. Enter your state name (String- One word ONLY   --> next()     )
			9. Enter your building number (int  --> nextInt()     )  nextLine()
			10. Enter your Street name (--> nextLine()  )
		MAKE SURE USER CAN ENTER ALL THE INPUT
		Display all the inputs that user entered in following order in sperate lines:
			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode
			6. school name
 */











    }
}
