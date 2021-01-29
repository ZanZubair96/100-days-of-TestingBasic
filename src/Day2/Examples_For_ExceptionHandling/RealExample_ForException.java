package Day2.Examples_For_ExceptionHandling;

public class RealExample_ForException {

    public static void main(String[] args) {
        int [] numerator = {4, 8, 16, 32};
        int [] denominator = {2, 0, 4, 4};

        for(int i=0; i < numerator.length; i++){
            try {
                System.out.println(numerator[i]/ denominator[i]);
            }
            catch(Exception e){
                System.out.println(e); //java.lang.ArithmeticException
            }
        }
    }





}
