import java.util.Scanner;

public class StringWithFrequency {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s= sc.next();
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            for( i=0;i<26;i++){
                if(count[i]>0)
                    System.out.println((char)(i+'a')+ " " + count[i]);
            }
        }

    }
}
