package Day5.ExamplesForHashSet;

import java.util.HashSet;

public class AadharCardNumber {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(7706);
        hs.add(7704);
        hs.add(7705);
        System.out.println(hs.add(7705));

        System.out.println(hs);

    }
}
