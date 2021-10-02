import java.util.Scanner;

public class SolutionScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String st = scan.nextLine();

        System.out.println("String: " + st);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
