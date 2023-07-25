package Java_Recursion;
import java.util.*;
public class String_Subsets_I {
    public static void Subsets(String str,String ans,int idx){
        if(idx==str.length()){
            System.out.println("("+ans+")");
            return;
        }
        Subsets(str,ans,idx+1);
        Subsets(str,ans+str.charAt(idx),idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Subsets(str,"",0);
        sc.close();
    }
}
