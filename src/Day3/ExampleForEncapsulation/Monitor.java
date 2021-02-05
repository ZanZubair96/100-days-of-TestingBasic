package Day3.ExampleForEncapsulation;

/** we can hide direct access to the data by giving private keyword.
        And access the data using public getter and setter methods.

        • Getter method is return type(you must initialize to some variable like string),
        no parameters, read data.
        • Setter method is non-return method with void, must have parameter,
        modify the data,
        use this keyword if param has same name as private data.

        Data type of the param must be same as private data.
        If private data is final we cannot modify.
 */

public class Monitor {
    private int monitor_Pixel;
    private String monitor_LensColor;

    public void setMonitor_Pixel(int pixel) {
        monitor_Pixel=pixel;
    }

    public void setMonitor_LensColor(String color) {
        monitor_LensColor = color;
    }

    public void getMonitor_Pixel(){
        System.out.println("The Monitor Pixel Rate: "+monitor_Pixel+"p");
    }

    public void getMonitor_LensColor(){
        System.out.println("The Monitor LensColor Rate: "+monitor_LensColor);
    }



}
