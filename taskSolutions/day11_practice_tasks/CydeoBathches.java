package day11_practice_tasks;

public class CydeoBathches {
    public static void main(String[] args) {
        String batchType = "US morning";
        String result = "";
        switch (batchType){
            case "US morning":
                result = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                result = "Class times are 7-10 EST. M, T, W, Th, S, S.";
                break;
            case "EU":
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                result = "Invalid Batch";
        }
        System.out.println(result);

        System.out.println("---------------------------------------");
        String batch = "US morning";
        String result2 = (batch=="US morning")?"Class times are 10-5 EST. M, T, Th, F.":
                (batch=="US evening")?"Class times are 7-10 EST. M, T, W, Th, S, S":
                        (batch=="EU")?"Class times are  10-5 EST. M, T, W, Th, F.":
                                ("Invalid Batch");
        System.out.println( result2);




        /*        Create a class named Cydeo batches. In Cydeo we have three batch types:
        US morning, US evening, EU.        Depending on a batch type (String)
        print information about the batch.
        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"
        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
         */














    }
}
