package Prims;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int N = Integer.parseInt(in[0]), M = Integer.parseInt(in[1]);
		Graph graph = new Graph(N, M);
		while (M > 0) {
			in = br.readLine().split(" ");
			int n1 = Integer.parseInt(in[0]), n2 = Integer.parseInt(in[1]), w = Integer.parseInt(in[2]);
			if (graph.nodes.get(n1) == null)
				graph.add(n1, new Node(n1));
			if (graph.nodes.get(n2) == null)
				graph.add(n2, new Node(n2));
			Node N1 = graph.nodes.get(n1), N2 = graph.nodes.get(n2);
			Edge E = new Edge(N1, N2, w);
			graph.add(E);
			N1.add(E);
			N2.add(E);
			M --;
		}
		Prims(graph);
		printGraph(graph);
	}
	
	static void Prims (Graph graph) {
//		graph.sortEdges();
		ArrayList<Node> L = new ArrayList<>() {
			public boolean add(Node n) {
				boolean r = super.add(n);
				Collections.sort(L, new sortNode());
				return r;
			}
		};
		ArrayList<Edge> edges = new ArrayList<>();
		Node start = graph.nodes.get(1);
		start.weight = 0;
		L.add(start);
		while (L.isEmpty()) {
			Node N = L.get(0);
			L.remove(N);
			N.visited = true;
			for (Edge i : N.connected) {
				if (i.getConnected(N) )
			}
		}
	}
	
	class sortNode implements Comparator<Node> {
	    public int compare(Node a, Node b)
	    {
	        return a.weight - b.weight;
	    }
	}
	
	static void printGraph (Graph graph) {
		System.out.println(graph.Weight);
		for (Edge E : graph.edges) 
			System.out.println(E.N1.id + " " + E.N2.id + " " + E.weight);
	}

}
