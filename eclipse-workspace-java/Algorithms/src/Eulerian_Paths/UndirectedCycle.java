package Eulerian_Paths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class UndirectedCycle {
	
//	public static ArrayList<Integer>[] graph; //for only one edge between nodes;
	public static TreeMap<Integer, Integer>[] graph; // for multiple edges between nodes
	public static ArrayList<Integer> Path = new ArrayList<>();

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int N = Integer.parseInt(in[0]), M = Integer.parseInt(in[1]);
//		graph = (ArrayList<Integer>[]) new ArrayList[N];
		graph = (TreeMap<Integer, Integer>[]) new TreeMap[N];
//		boolean[] valid = new boolean[N];
		int[] valid = new int[N];
		while (M > 0) {
			in = br.readLine().split(" ");
			int n1 = Integer.parseInt(in[0]), n2 = Integer.parseInt(in[1]);
			
			if (graph[n1] == null) {
//				graph[n1] = new ArrayList<>();
				graph[n1] = new TreeMap<>();
			}
			if (graph[n2] == null) {
//				graph[n2] = new ArrayList<>();
				graph[n2] = new TreeMap<>();
			}
				
//			graph[n1].add(n2);
//			graph[n2].add(n1); // if undirected
//			if (graph[n1].size() % 2 == 0) valid[n1] = true;
//			else valid[n1] = false;
//			if (graph[n2].size() % 2 == 0) valid[n2] = true;  // if undirected
//			else valid[n2] = false;                           // if undirected
			
			graph[n1].put(n2, graph[n1].getOrDefault(n2, 0) + 1);
			graph[n2].put(n1, graph[n2].getOrDefault(n1, 0) + 1); // if undirected
			valid[n1] ++;
			valid[n2] ++;                                         // if undirected
			
			M --;
		}
		
		if (valid(valid)) {
			System.out.println("Running...");
			findCycle(0);
			System.out.println("Printing Results...");
			for (int i : Path)
				System.out.println(i);
		}
	}
	
	static boolean valid(boolean[] A) {
		for (boolean i : A)
			if (!i)
				return false;
		return true;
	}
	
	static boolean valid(int[] A) {
		for (int i : A) {
			if (i % 2 != 0)
				return false;
		}
		return true;
	}
	
	static void findCycle(Integer cur) {
		while (graph[cur].size() > 0) {
//			Integer to = graph[cur].get(0);
//			graph[cur].remove(to);
//			graph[to].remove(cur);  // if undirected
//			findCycle(to);
			
			Entry<Integer, Integer> to = graph[cur].firstEntry();
			if (to.getValue() - 1 == 0) {
				graph[cur].remove(to.getKey());
				graph[to.getKey()].remove(cur);  // if undirected
			}
			else {
				graph[cur].put(to.getKey(), to.getValue() - 1);
				graph[to.getKey()].put(cur, graph[to.getKey()].get(cur) - 1);  // if undirected
			}
			findCycle(to.getKey());
		}
		Path.add(cur);
	}

}
