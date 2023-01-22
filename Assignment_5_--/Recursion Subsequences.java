import java.util.*;
public class Main {
    public static void Subsequence(String str,String ans,ArrayList<String> lst){
        if(str.length()==0){
            lst.add(ans);
            return;
        }
        Subsequence(str.substring(1),ans,lst);
        Subsequence(str.substring(1),ans+str.charAt(0),lst);
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> lst=new ArrayList<>();
        Subsequence(str,"",lst);
        for(int i=0;i<lst.size();i++){
            System.out.print(lst.get(i)+" ");
        }
        System.out.println();
        System.out.println(lst.size());
        sc.close();
    }
}
