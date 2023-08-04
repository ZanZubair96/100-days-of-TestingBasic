public class main {
    public static void main(String[] args) {

        // watch the youtube video for understanding the string concepts >>  https://youtu.be/AH0ZcgzWMBw

        // watch this instagram reel for understanding the String, StringBuilder, StringBuffer >> https://www.instagram.com/p/CvT_VuJLSe9/

        // First if the new value is created for a string variable >> it will check the string constant pool first, if the value(Object) is not present there, then the new obeject with 
        // value of it will be created in the string constant pool.

        String s1 = new String("New World"); // 2 objects will be created for this line; one in String Constant Pool and another one in Heap memory with the reference s1

        String s2 = new String("New World"); // 1 object will be created in the heap memory and no object will be created inside the String Constant Pool as "New World" object is already there in the SCP.

    }
}
