package day37_Inheritance.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
//every scrum team has>>PO,BA,SM,testers,developers(they could be more than one, add remove thats why array list wee added)
    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;

    public ArrayList<Tester> testers =  new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    //1- constructor add>> PO,BA,SM-
    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }
    //2-testers add>>remove
    public void addTester(Tester tester){//addTester
        testers.add( tester );//add method
    }
    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers) );//addAll method//addTesters
    }
//from id remove>>
    public void removeTester(int id){
        testers.removeIf( p -> p.id == id);//removeIf method
    }
//3-addDeveloper add>>remove
    public void addDeveloper(Developer developer){//addDeveloper
        developers.add(developer);
    }

    public void addDevelopers(Developer[] developers){//addDevelopers
        this.developers.addAll( Arrays.asList(developers) );
    }
//removeDeveloper
    public void removeDeveloper(int id){
        developers.removeIf( p -> p.id == id);
    }
    //4- toString//right click//generate//

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +//name
                ", BA=" + BA.name +//name
                ", SM=" + SM.name +//name
                ", number of testers=" + testers.size() +// testers.size()
                ", number of developers=" + developers.size()  +//.size()
                '}';
    }
}
/*
Creat a class named ScrumTeam:
            Variables:
                PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
                testers (ArrayList<Testers>),  developers (ArrayList<Developers>)
            Methods:
                addTester(Tester tester): adds the given tester to testers arraylist
                ddTesters(Tester[] testers): adds the given testers to testers arraylist
                removeTester(int id): removes the tester with the given id from the arraylist of tester
                addDeveloper(Developer developer): adds the given developer to testers arraylist
                addDeveloper(Developer[] developer): adds the given developers to testers arraylist
                removeDeveloper(int id): removes the developer with the given id from the arraylist of developer
                toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers
 */