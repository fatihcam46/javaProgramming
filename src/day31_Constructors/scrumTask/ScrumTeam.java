package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

/*
create a class called ScrumTeam
   Attributes:
        String PO(product owner), BA(Business analys), SM(Scrum master);
        ArrayList<Tester> testersList = new ArrayList<>();
        ArrayList<Developer> devopsList = new ArrayList<>();
        int daysOfSprint;
       Add A constructor that can set the fileds PO, BA, and SM
     Actions:
          addTester(Tester tester): adds the given tester to the testers ArrayList
          addTesters(Tester[] testers): adds the given testers to the testers ArrayList
          addDeveloper(Developer developer): adds the given developer to the developers ArrayList
          addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
          removeTester(long employeeID): removes the given tester from the testers ArrayList
          removeDeveloper(long employeeID): removes the developer from the developers ArrayList
          toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */
//Attributes:
    public String PO, BA, SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;
    //lets generate constructor>>>just PO, BA, SM and daysOfSprint
    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    // Actions:
    public void addTester(Tester tester){// add tester list
        testersList.add( tester );//write add testersList //adding one testers
    }
    public void addTesters(Tester[] testers){// adding all array of testers
        testersList.addAll( Arrays.asList(testers) );
    }

    public void addDeveloper(Developer developer){
        devopsList.add( developer ); // one developer
    }
    public void addDevelopers(Developer[] developers){
        devopsList.addAll( Arrays.asList(developers) ); //array of developer
    }

    public void removeTester(int employeeID){//if remove tester: ID is unique
        testersList.removeIf( p ->  p.employeeID == employeeID );//use lambda //
    }
    public void removeDeveloper(int employeeID){//if remove developer: ID is unique
        devopsList.removeIf( p -> p.employeeID == employeeID);//it can remove from array list
    }
//generate >>>to/String method>>>
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() + //change total testers
                ", total number of developers=" + devopsList.size() +//change total developers
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}