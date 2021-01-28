package Day2_Constructor.Examples_For_Constructor;

public class Jetty {

    Jetty() {
        System.out.println("The Jetty color is White");
        System.out.println("The Jetty size is M");
    }

    Jetty(int a) {
        System.out.println("The Jetty size is: " + a);
    }

    Jetty(int a, int b) {
        this();
        System.out.println("The Jetty size is: " + a);
        System.out.println("The Jetty size is: " + b);
    }


}
