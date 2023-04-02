import java.util.Scanner;

public class PatternSearching {
    public static void Search(String S,String P){
        int m=S.length();
        int n=P.length();
        for(int i=0;i<m-n;i++){
            int j;
            for(j=0;j<n;j++)
                if(S.charAt(i+j) != P.charAt(j))
                    break;
            
            if(j==n)
                System.out.println(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String S=sc.nextLine();
        System.out.println("Enter pattern to be searched");
        String P=sc.nextLine();
        Search(S,P);
       
    }
}
