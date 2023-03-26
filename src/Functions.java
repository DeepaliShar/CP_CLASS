import java.util.Scanner;

public class Functions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.substring(2));
        System.out.println(s.substring(2,5));
        System.out.println(s.contains("deep"));
        System.out.println(s.equals("deepali"));
        System.out.println(s.indexOf('d',3));
        System.out.println(s.compareTo("anurag"));

    }
}
