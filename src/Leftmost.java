import java.util.*;
public class Leftmost{
    static int leftmostt(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j))
                    return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.next();
        System.out.println(leftmostt(s));
    }
}
