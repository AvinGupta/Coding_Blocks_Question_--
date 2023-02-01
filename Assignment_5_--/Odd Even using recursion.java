import java.util.*;
public class Main {
    public static void Helper(int nums,ArrayList<Integer> lst_odd,ArrayList<Integer> lst_even){
        if(nums==0) return;
        if(nums%2==0) lst_even.add(nums);
        else lst_odd.add(nums);
        Helper(nums-1,lst_odd,lst_even);
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        // arraylist for storing the answer
        ArrayList<Integer> lst_odd=new ArrayList<>();
        ArrayList<Integer> lst_even=new ArrayList<>();
        Helper(nums,lst_odd,lst_even);
        for(int i=0;i<lst_odd.size();i++){
            System.out.println(lst_odd.get(i));
        }
        for(int i=lst_even.size()-1;i>=0;i--){
            System.out.println(lst_even.get(i));
        }
        sc.close();
    }
}
