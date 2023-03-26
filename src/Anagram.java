import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static boolean Anagram(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        char a[]=s1.toCharArray();
        Arrays.sort(a);
        s1=new String(a);

        char b[]=s2.toCharArray();
        Arrays.sort(b);
        s2=new String(b);

        return(s1.equals(s2));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s1=sc.next();
        System.out.println("Enter a string");
        String s2=sc.next();
        System.out.println(Anagram(s1,s2));
    }
}
