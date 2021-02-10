package Day4.ExampleForArrayList;


import java.util.ArrayList;

/**
 * Size is dynamic
 * Only supports objects
 * not syncronized
 * array based class
 * <p>
 * ArrayList is array based, internally uses array
 * LinkedList consists of nodes/values that are related to each other
 * ArrayList and LinkedList both keep ordering
 * ArrayList and LinkedList both allow duplicates
 */

public class MarketList {
    public static void main(String[] args) {
        ArrayList<String> listForMarket = new ArrayList<>();
        listForMarket.ensureCapacity(2);


        listForMarket.add("Banana");
        listForMarket.add("Sugar");
        listForMarket.add("Maggi");
        listForMarket.add("Chocolates");
        listForMarket.add("Sugar");

        System.out.println("Did you add Maggi:  "+listForMarket.contains("Maggi"));
        System.out.println(listForMarket);


        System.out.println("What you entered in the List at 2: " + listForMarket.get(1));
        System.out.println(listForMarket.remove("Sugar"));

        System.out.println(listForMarket);

    }
}
