package day11_practice_tasks;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber = 26;
        String result = (floorNumber==1)?"Floor 1 selected. Companies: Lobby, Verizon, Starbucks":
                (floorNumber==2)?"Floor 2 selected. Companies: Cybertek, NASA, Intelsat":
                 (floorNumber==3)?"Floor 3 selected. Companies: Lyft, BofA, Stake house":
                 "Invalid floor number - "+floorNumber;
        System.out.println("result = " + result);
        System.out.println("------------------------------------------");
        int floorNum = 9;

        // Solution 1:
        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        } else {
            System.out.println("Invalid floor - " + floorNum);
        }

        System.out.println("------------------------------------");

        // solution 2
        switch(floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break; //EXIT SWITCH
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break; //exit the switch statement
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Invalid floor - " + floorNum);
                break;
        }




        /*
        Create a class called Elevator. A variable named floorNumber is given,
        write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"
			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
         */







    }
}
