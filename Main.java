package ua.edu.uzhnu.practice2;

/**
 * Created by User-Bogdan on 07.04.2017.
 */
public class Main {

    public static void main(String[] args) {

        SampleFamilyProvider n1 = new SampleFamilyProvider();
        n1.makeFamilyTree();
        System.out.println( n1.makeFamilyTree().getMother().getMother().getFather().getName());
    }
}
