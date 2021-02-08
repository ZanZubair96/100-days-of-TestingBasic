package Day5.ExamplesForLinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkHash {

/**
 *   DS : Hash Table and  Linked List
 * */
public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add(10);
    ll.add(20);
    ll.add(30);
    ll.add(10);
    ll.add(20);
    ll.add(40);

    System.out.println(ll);


//    LinkedHashSet ls = new LinkedHashSet();
    LinkedHashSet ls = new LinkedHashSet(ll);
//    ls.add(7706);
//    ls.add(7704);
//    ls.add(7705);
//    System.out.println(hs.add(7705));

    System.out.println(ls);


}

}
