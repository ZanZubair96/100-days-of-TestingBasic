package Day1.Folder_Interface;


/**
 * Interface in java is like the outline for the class.
 * Interface will track of what we need.
 * Drawback is >>> we need to have every method of interface.
 * We can implement more than one interface.
 *
 * Interfaces specify what a class must do and not how.
 * It is the blueprint of the class.
 * It is used to achieve total abstraction.
 *
 * Syntax : interface [INTERFACE_NAME] {
 *
 * }
 *
 *
 * We are using implements keyword for interface.
 * We will use extends keyword for interface to interface
 */

interface Soundbar {

    String color = "Black";

    void TurnOn();

    void TurnOff();

    static void pauseSong(){
        System.out.println("Song is paused");
    }


}

public class InterfaceExample implements Soundbar {
    public static void main(String[] args) {
        System.out.println("The SoundBar color is: " + color);
        Soundbar.pauseSong();

        InterfaceExample ie = new InterfaceExample();
        ie.TurnOn();
        ie.TurnOff();


    }

    public void TurnOn() {
        System.out.println(" The SoundBar is Turned On");
    }


    public void TurnOff() {
        System.out.println(" The SoundBar is Turned Off");
    }
}


/**
 * Note: >>> All variables declared inside the interface are public, static and final.
 */

/** Note: >>> We can implement the method inside the interface using the default keyword and Static keyword */

/** Note: >>> we can introduce private method inside the interface from JAVA 9 */