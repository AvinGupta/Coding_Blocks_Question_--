package Java_Recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class Permutations_SubString {
    public static void Premutations(ArrayList<String> lst,String str,String ans){
        if(str.length()==0){
            lst.add(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            boolean flag=false;
            char ch=str.charAt(i);
            String S1=str.substring(0,i);
            String S2=str.substring(i+1);
            for(int j=i+1;j<str.length();j++){
                if(ch==str.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                Premutations(lst,S1+S2,ans+ch);
            }
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
