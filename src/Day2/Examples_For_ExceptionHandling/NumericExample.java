package Day2.Examples_For_ExceptionHandling;

public class NumericExample {

    public static void main(String[] args) {
        int [] num = new int[5];

        try{
            System.out.println(" In try 1");
            num[9]=25;
            System.out.println("In try 2");
            System.out.println("If the 100 are from same IP address, please throw");

        }
        catch(Exception ex){
            System.out.println("In Catch");
            return;
        }
        finally {
            System.out.println("finally close network port");
        }

    }
}

/**
 * Exception is an error occurs in the runtime of the program
 *
 *
 *
 * */