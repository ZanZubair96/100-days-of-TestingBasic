package Day3.ExampleForEncapsulation;

public class main {
    public static void main(String[] args) {

        Monitor m= new Monitor();

        m.setMonitor_Pixel(1080);
        m.setMonitor_LensColor("Blue");

        System.out.println("Inside Getter >>> ");

        m.getMonitor_Pixel();
        m.getMonitor_LensColor();
    }
}
