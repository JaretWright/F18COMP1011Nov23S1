import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ComputerCollection {

    public static void main(String[] args)
    {
        Computer comp1 = new Computer("MSI", "Ron's computer", 64, 2498.33);
        Computer comp2 = new Computer("Eurocom", "Insanity", 128, 10500.33);
        Computer comp3 = new Computer("Apple", "iMac", 32, 1898.33);
        Computer comp4 = new Computer("Apple", "Air", 64, 2499.33);

        TreeSet<Computer> computerTreeSet = new TreeSet<>();
        computerTreeSet.add(comp1);
        computerTreeSet.add(comp2);
        computerTreeSet.add(comp3);
        computerTreeSet.add(comp4);

        System.out.println(computerTreeSet);

        ArrayList<Computer> arrayList = new ArrayList<>();
        arrayList.add(comp1);
        arrayList.add(comp2);
        arrayList.add(comp3);
        arrayList.add(comp4);

        System.out.println("\nArrayList before sorting:");
        displayList(arrayList);

        Collections.sort(arrayList);
        System.out.println("\nArrayList after sorting:");
        displayList(arrayList);

        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("\nArrayList after sorting with reverseOrder:");
        displayList(arrayList);

        //using our own custom sort method
        Collections.sort(arrayList, (a,b) -> (a.getPrice()>b.getPrice())?1:-1);
        System.out.println("\nArrayList after sorting with lambda and price:");
        displayList(arrayList);
    }

    public static void displayList(List<Computer> list)
    {
        for (Computer computer:list)
            System.out.println(computer);
    }
}
