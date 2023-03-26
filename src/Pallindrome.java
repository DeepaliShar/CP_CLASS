import java.util.Scanner;

public class Pallindrome {
    static boolean Pallindrome(String s){
        int start=0;
        int end=s.length()-1;
        if(s.charAt(start)==s.charAt(end))
            return true;
        while (start<end) {
            if (s.charAt(start) != s.charAt(end)){
                return false;
        }
           start++;
            end--;

        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s= sc.next();
        if(Pallindrome(s))
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");
    }
}
