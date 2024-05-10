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
    	public boolean BFS(int src, int dis) {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		qq.add(src);
		while (!qq.isEmpty()) {
			// remove
			int r = qq.remove();
			// Ignore if Already Visited
			if (visited.contains(r)) {
				continue;
			}
			// visited mark
			visited.add(r);
			// work
			if (r == dis) {
				return true;
			}
			// nbrs add krna
			for (int nbrs : map.get(r).keySet()) {
				if (!visited.contains(nbrs)) {
					qq.add(nbrs);
				}
			}

		}
		return false;

	}

	public boolean DFS(int src, int dis) {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		st.push(src);
		while (!st.isEmpty()) {
			// remove
			int r = st.pop();
			// Ignore if Already Visited
			if (visited.contains(r)) {
				continue;
			}
			// visited mark
			visited.add(r);
			// work
			if (r == dis) {
				return true;
			}
			// nbrs add krna
			for (int nbrs : map.get(r).keySet()) {
				if (!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}

		}
		return false;

	}

	public void BFT() {

		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			
			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int r = qq.remove();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}
				// visited mark
				visited.add(r);
				// work
				System.out.print(r + " ");
				// nbrs add krna
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						qq.add(nbrs);
					}
				}

			}
			
		}

	}

	public void DFT() {

		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			st.push(src);
			while (!st.isEmpty()) {
				// remove
				int r = st.pop();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}
				// visited mark
				visited.add(r);
				// work
				System.out.print(r + " ");
				// nbrs add krna
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}

			}
		}

	}

	public boolean isCycle() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int r = qq.remove();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					return true;
				}
				// visited mark
				visited.add(r);

				// nbrs add krna
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						qq.add(nbrs);
					}
				}

			}
		}
		return false;

	}

	public boolean isConneted() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count = 0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			count++;
			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int r = qq.remove();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}
				// visited mark
				visited.add(r);

				// nbrs add krna
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						qq.add(nbrs);
					}
				}

			}
		}
		return count == 1;

	}
}
public class Main{
    //Question for interview
    /* Ques-find the shortest path b/w to vertex on the basis on of minimum number of 
        node traversed in the graph
       Ans-we will use bfs always for minimum traversal's possible
       
       
       note--all tree are graph but all graph are not tree
       if a graph is connected and does not contain any cycle than graph is a valid tree
     */
    
    
	public static void main(String[] args) {
	    Graph g = new Graph(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		//g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		//System.out.println(g.DFS(1, 6));
		g.BFT();
		System.out.println();
		g.DFT();
		System.out.println();
		System.out.println(g.isCycle());
		System.out.println(g.isConneted());
	}
}
