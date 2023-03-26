import java.util.Scanner;

public class Subsequence {
    static boolean Subsequence(String s1,String s2)
    {
        int n=s1.length();
        int m=s2.length();
        if(n<m){
            return false;
        }
        int j=0;
        for(int i=0;i<n&&j<m;i++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
        }
        return(j==m);

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s1 = sc.next();
        System.out.print("Enter a Substring: ");
        String s2 = sc.next();
        System.out.println(Subsequence(s1,s2));

    }
}
