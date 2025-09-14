package Tarjans_Lowlink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static Graph graph;
	static int time = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int N = Integer.parseInt(in[0]), M = Integer.parseInt(in[1]);
		graph = new Graph(N, M);
		while (M > 0) {
			in = br.readLine().split(" ");
			int n1 = Integer.parseInt(in[0]), n2 = Integer.parseInt(in[1]);
			if (graph.nodes.get(n1) == null)
				graph.add(n1, new Node(n1));
			if (graph.nodes.get(n2) == null)
				graph.add(n2, new Node(n2));
			graph.nodes.get(n1).add(graph.nodes.get(n2));
			graph.nodes.get(n2).add(graph.nodes.get(n1)); //Directed or unDirected
			M --;
		}
		Tarjan(null, graph.nodes.get(1));
		printGraph(graph);
	}
	
	public static void Tarjan(Node P, Node N) {
		graph.incall.add(N);
		N.time = time ++;
		for (Node i : N.neighbours) {
			if (i == P) continue;
			if (i.time == -1)
				Tarjan (N, i);
			Node t = minB (N, i);
			if (graph.incall.contains(t))
				N.back = t;
			else N.back = minT (N, i);
		}
		graph.incall.remove(N);
		return;
	}
	
	public static boolean isCutNode(Node R, Node N) {
		if (R == N) {
			if (N.neighbours.size() >= 2) return true;
		}
		else 
			for (Node i : N.neighbours) 
				if (i.back.time > N.time) return true;
		return false;
		
	}
	
	public static Node minB (Node N1, Node N2) {
		if (N1.back.time > N2.back.time) return N2.back;
		return N1.back;
	}
	
	public static Node minT (Node N1, Node N2) {
		if (N1.back.time > N2.time) return N2;
		return N1.back;
	}
	
	public static void printGraph(Graph graph) {
		for (Node N : graph.nodes.values()) 
			System.out.println("Index: " + N.index + ", Time: " + N.time + ", Lowlink Node: " + N.back.index + ", Lowlink Time: " + N.back.time + ", isCutNode: " + isCutNode(graph.nodes.get(1), N));
		
	}

}
