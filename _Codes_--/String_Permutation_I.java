package Java_Recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class Permutations_SubString {
    public static void Premutations(ArrayList<String> lst,String str,String ans){
        if(str.length()==0){
            if(lst.contains(ans)) return;
            lst.add(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            String S1=str.substring(0,i);
            String S2=str.substring(i+1);
            char ch=str.charAt(i);
            Premutations(lst,S1+S2,ans+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> lst=new ArrayList<>();
        Premutations(lst,str,"");
        System.out.println(lst);
        sc.close();
    }
}
