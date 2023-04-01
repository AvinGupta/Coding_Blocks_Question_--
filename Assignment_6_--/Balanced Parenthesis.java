import java.util.*;
public class Main {
	public static boolean Blncd_Par(String str,Stack<Character> stck){
		if(str.length()%2!=0) return false;
		for(char chr:str.toCharArray()){
			if(chr=='(' || chr=='[' || chr=='{') stck.push(chr);
			else if(chr==')' && !stck.isEmpty() && stck.peek()=='(') stck.pop();
			else if(chr==']' && !stck.isEmpty() && stck.peek()=='[') stck.pop();
			else if(chr=='}' && !stck.isEmpty() && stck.peek()=='{') stck.pop();
			else return false;
		}
		return stck.isEmpty();
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Stack<Character> stck=new Stack<>();
		boolean val=Blncd_Par(str,stck);
		if(val) System.out.println("Yes");
		else System.out.println("No");
		sc.close();		
	}
}

