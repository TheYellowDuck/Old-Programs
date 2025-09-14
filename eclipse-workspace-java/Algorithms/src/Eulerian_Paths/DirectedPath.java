package Eulerian_Paths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class DirectedPath {
	
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
		for (int i = 0; i < N; i ++) {
//			graph[i] = new ArrayList<>();
//			graph[i].add(0);
			
			graph[i] = new TreeMap<>();
			graph[i].put(-1, 0);
		}
//		boolean[] valid = new boolean[N];
		int[] valid = new int[N];
		while (M > 0) {
			in = br.readLine().split(" ");
			int n1 = Integer.parseInt(in[0]), n2 = Integer.parseInt(in[1]);
				
//			graph[n1].add(n2);
//			graph[n2].set(0, graph[n2].get(0) + 1); // if undirected
//			if (graph[n1].size() - 1 == graph[n1].get(0)) valid[n1] = true;
//			else valid[n1] = false;
//			if (graph[n2].size() - 1 == graph[n2].get(0)) valid[n2] = true;  // if undirected
//			else valid[n2] = false;                           // if undirected
			
			graph[n1].put(n2, graph[n1].getOrDefault(n2, 0) + 1);
			graph[n2].put(-1, graph[n2].get(-1) + 1); // if undirected
			valid[n1] ++;
			
			M --;
		}
		
		int start = valid(valid);
		
		if (start != -1) {
			System.out.println("Running...");
			findCycle(start);
			System.out.println("Printing Results...");
			for (int i : Path)
				System.out.println(i);
		}
	}
	
	static int valid(boolean[] A) {
		int count = 0, v = 0;
		for (int i = 0; i < A.length; i ++) {
			if (!A[i]) {
				count ++;
				if (graph[i].size() - 1 - graph[i].get(-1) == 1) {
					if (v != 0)
						return -1;
					v = i;
				}
			}
		}
		if (count == 0 || count == 2)
			return v;
		return -1;
	}
	
	static int valid(int[] A) {
		int count = 0, v = 0;
		for (int i = 0; i < A.length; i ++) {
			if (A[i] != graph[i].get(-1)) {
				count ++;
				if (A[i] - graph[i].get(-1) == 1) {
					if (v != 0)
						return -1;
					v = i;
				}
			}
		}
		if (count == 0 || count == 2)
			return v;
		return -1;
	}
	
	static void findCycle(Integer cur) {
		while (graph[cur].size() > 1) {
//			Integer to = graph[cur].get(graph[cur].size() - 1);
//			graph[cur].remove(to);
//			findCycle(to);
			
			Entry<Integer, Integer> to = graph[cur].lastEntry();
			if (to.getValue() - 1 == 0) {
				graph[cur].remove(to.getKey());
			}
			else {
				graph[cur].put(to.getKey(), to.getValue() - 1);
			}
			findCycle(to.getKey());
		}
		Path.add(0, cur);
	}

}
