package Day1.Folder_Abstract;

abstract class Tshirt {

    // Normal Method
    // for the Normal method we can do implementation inside the abstract class
    public void size() {
        System.out.println("Size is: Medium");
    }

    //abstract Method
    //for the abstract method, we cannot do the implementation inside the abstract class
    //abstract method can be declared only inside the abstract class
    abstract void color();
}

class Machine extends Tshirt{

    // We need to implement the abstract method before you extends it. (If you have the abstract method)
    void color() {
        System.out.println("The Color is Black");
    }
}

public class Shirt {


    public static void main(String[] args) {
          // we cannot use the abstract class as the regular class
          // we need to create the class and use it from there.
        Machine m=  new Machine();
        m.size();
        m.color();
    }
}


/** Difference between the interface and Abstract

Interface thinks all the methods are abstract, but the abstract class is different as it can have
 both the normal implemented method as well as the abstract method.

 */