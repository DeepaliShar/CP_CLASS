import java.util.Scanner;

public class Rec_Subsequence {
    static boolean Subsequence(String s1,String s2,int n,int m){
        if(m==0)return true;
        if(n==0)return false;
        if(s1.charAt(n-1)==s2.charAt(m-1))
            return Subsequence(s1,s2,n-1,m-1);
        else
            return Subsequence(s1,s2,n-1,m);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s1=sc.next();
        System.out.println("Enter a Substring");
        String s2=sc.next();
        int n=s1.length();
        int m=s2.length();
        boolean res=(Subsequence(s1,s2,n,m));
        if(res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
