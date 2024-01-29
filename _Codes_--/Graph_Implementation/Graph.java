//this keyword is used when the data member of class and local variable of the function have same name
import java.util.*;
class Graph {
    	HashMap<Integer, HashMap<Integer, Integer>> map;
    	public Graph(int v) {
    		this.map = new HashMap<>();
    		for (int i = 1; i <= v; i++) {
    			map.put(i, new HashMap<>());
    		}
    	}
    	public void AddEdge(int v1, int v2, int cost) {
    		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
    		map.get(v2).put(v1, cost);
    	}
    	public boolean ContainsEdge(int v1, int v2) {
    		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
    	}
    	public boolean Containsvertex(int v1) {
    		return map.containsKey(v1);
    	}
    	public int noofEdge() {
    		int sum = 0;
    		for (int key : map.keySet()) {
    			sum = sum + map.get(key).size();
    		}
    		return sum / 2;
    	}
    	public void removeEdge(int v1, int v2) {
    		if (ContainsEdge(v1, v2)) {
    			map.get(v1).remove(v2);
    			map.get(v2).remove(v1);
    		}
    	}
    	public void removevertex(int v1) {
    
    		for (int key : map.get(v1).keySet()) {
    			// removeEdge(key, v1);
    			map.get(key).remove(v1);
    		}
    		map.remove(v1);
    
    	}
    	public void display() {
    		for (int key : map.keySet()) {
    			System.out.println(key + "-->" + map.get(key));
    		}
    	}
    	public boolean hashpath(int src, int dis, HashSet<Integer> visited) {
    
    		if (src == dis) {
    			return true;
    		}
    
    		visited.add(src);
    		for (int nbrs : map.get(src).keySet()) {
    			if (!visited.contains(nbrs)) {
    				boolean ans = hashpath(nbrs, dis, visited);
    				if (ans) {
    					return ans;
    				}
    			}
    		}
    		visited.remove(src);
    		return false;
    
    	}
    	public void printallpath(int src, int dis, HashSet<Integer> visited, String ans) {
    
    		if (src == dis) {
    			System.out.println(ans+src);
    			return;
    		}
    
    		visited.add(src);
    		for (int nbrs : map.get(src).keySet()) {
    			if (!visited.contains(nbrs)) {
    				printallpath(nbrs, dis, visited, ans + src + " ");
    
    			}
    		}
    		visited.remove(src);
    	}
    }
public class Main{
	public static void main(String[] args) {
	    Graph g = new Graph(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.display();
		System.out.println(g.noofEdge());
		//g.removeEdge(4, 5);
		//g.removevertex(4);
		g.display();
		System.out.println(g.hashpath(1, 6, new HashSet<>()));
		g.printallpath(1,  6, new HashSet<>(), "");
	}
}
