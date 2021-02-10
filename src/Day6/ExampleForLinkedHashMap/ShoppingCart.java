package Day6.ExampleForLinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * LinkedHashMap is same as HasHMap just additionally maintains the insertion order.

        LinkedHashMap can have null key, keeps order

        Main difference between HashMap and LinkedHashMap
        I remember is that LinkedHashMap maintains
        insertion order of keys,
        On the other hand HashMap doesn't maintain
        any order or keys or values.
        Also LinkedHashMap requires more memory than HashMap
        because of the ordering feature.
        LinkedHashMap doubly Linked List to
        maintain order of elements.
 */

public class ShoppingCart {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String > shopping = new LinkedHashMap<>();

        shopping.put(1,"Container Glass");
        shopping.put(2,"Mixer Preeti");
        shopping.put(3,"Selenium Kindle Book v1");
        shopping.put(4,"The Seventh Secret book");

        System.out.println(shopping);

        shopping.replace(3, "Selenium Kindle Book v2");
        Set cart = shopping.entrySet();
        System.out.println("The Final Shopping Cart is >>> "+cart);

        long NumberOfItems = shopping.entrySet().stream().count();
        System.out.println("Total of Items in the cart is: "+NumberOfItems);
    }
}
