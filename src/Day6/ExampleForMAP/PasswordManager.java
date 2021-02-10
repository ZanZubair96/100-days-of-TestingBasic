package Day6.ExampleForMAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * MAP : is a (key-value format)
        and keys are always unique,
        and value can be duplicated.
        - HashTable don't have null key, sychronized(thread-safe)
        - LinkedHashMap can have null key, keeps order
        - HasHMap can have null key, order is not guaranteed
        - TreeMap doesn't have null key and keys are sorted
 */

public class PasswordManager {
    public static void main(String[] args) {
        Map<String, String> sitesAndPassword = new HashMap<>();

        sitesAndPassword.put("Facebook","321321@F@ceBook");
        sitesAndPassword.put("Instagram","976@Inst@");
        sitesAndPassword.put("Gmail","r2t3876@Gm@!l");

        System.out.println(sitesAndPassword.containsKey("Facebook"));

        Set sES = sitesAndPassword.entrySet();

        System.out.println("The Entry Set is "+sES);

        Collection passwords=sitesAndPassword.values();

        System.out.println("The Passwords are >> " +passwords);
    }
}
