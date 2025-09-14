package Kosarajus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Integer>[] graph, revgraph;
	public static boolean[] visited;
	public static int N;
	public static ArrayList<Integer> order;
	public static int[] comp;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		N = Integer.parseInt(in[0]); int M = Integer.parseInt(in[1]);
		graph = (ArrayList<Integer>[]) new ArrayList[N];
		revgraph = (ArrayList<Integer>[]) new ArrayList[N];
		visited = new boolean[N];
		order = new ArrayList<>(N);
		comp = new int[N];
		while (M > 0) {
			in = br.readLine().split(" ");
			int n1 = Integer.parseInt(in[0]), n2 = Integer.parseInt(in[1]);
			
			if (graph[n1] == null) 
				graph[n1] = new ArrayList<>();
			if (graph[n2] == null) 
				graph[n2] = new ArrayList<>();
			if (revgraph[n1] == null) 
				revgraph[n1] = new ArrayList<>();
			if (revgraph[n2] == null) 
				revgraph[n2] = new ArrayList<>();
				
			graph[n1].add(n2);
			revgraph[n2].add(n1);
			
			M --;
		}
		System.out.println(Kosarajus());
		for (int i = 0 ; i < N; i ++) {
			System.out.println(i + " " + comp[i]);
		}
	}
	
	static void dfs1(int cur ){
		visited[cur] = true;
		for (int to : graph[cur])
			if (!visited[to])
				dfs1(to);
		order.add(0, cur);
	}
	
	static void dfs2(int cur, int whichComp) {
		visited[cur] = true;
		comp[cur] = whichComp;
		for (int to : revgraph[cur])	
			if (!visited[to])
				dfs2(to, whichComp);
	}

	
	static int Kosarajus () {
		for (int i = 0; i < N; i++)
			if (!visited[i])
				dfs1(i);
		System.out.println(order);
		visited = new boolean[N]; // reset visited
		int compNum = 0; // ID of current component
		for (int i : order) {
			if (!visited[i]) {
				dfs2(i, compNum);
				compNum ++;
			}
		}
		return compNum;
	}

}
