package ua.edu.uzhnu.practice2;


/**
 * Created by User-Bogdan on 07.04.2017.
 */
public class SampleFamilyProvider {

    Male ivan = new Male ("Іван");
    Male ostap = new Male("Остап");
    Male igor = new Male ("Ігор");
    Male vasul = new Male("Василь",igor,ira );
    Male yuri = new Male ("Юрій", ostap, katia);
    Female marina = new Female("Марина") ;
    Female katia = new Female("Катя", ivan, marina);
    Female ira = new Female("Іра", ivan, marina);
    Female olesia = new Female("Олеся", ostap, katia);
    Female vika = new Female("Віка", ostap, katia);


   public Male makeFamilyTree (){
        return yuri;
    }
}
